package tugasKedua;
import java.util.Scanner;

public class tugasKedua {

    public static void main(String[] args){
        System.out.println("Affandi Rohman Rizky Hardika - 265150700111031"); 
        Scanner input = new Scanner(System.in); 
        String ulangi;
        
        do{
            System.out.print("Masukkan angka pertama: ");
            float angkaPertama = input.nextFloat(); 
            System.out.print("Masukkan angka kedua: "); 
            float angkaKedua = input.nextFloat();
            System.out.print("Pilih operasi (+,-,/,*): ");
            char operasi = input.next().charAt(0);
            
            double hasil = 0; 
            boolean statusOperasi = true; 

            switch (operasi) {
                case '+': 
                hasil = angkaPertama + angkaKedua;
                break;
                case '-':
                hasil = angkaPertama - angkaKedua; 
                break;
                case '*' : 
                hasil = angkaPertama * angkaKedua; 
                break;
                case '/': 
                if (angkaKedua != 0){
                    hasil = angkaPertama / angkaKedua;
                } else { 
                    System.out.print("Ga boleh membagi angka dengan nol!");
                }
                break; 
                default:
                    System.out.print("Operasi yang Anda lakukan tidak valid!");
                    statusOperasi = false;
                    break;
            }
            if (statusOperasi){
                System.out.println("Hasil: " + hasil);
            }
            System.out.print("Mau ulangin ga? (Y/T): ");
            ulangi = input.next();
            System.out.println(); 

        } while (ulangi.equalsIgnoreCase("Y"));
        input.close();
    }
}
