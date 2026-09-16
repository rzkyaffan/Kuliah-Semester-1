
import java.util.Scanner;
public class tugasPertama {
    public static void main(String[] args){
        System.out.print("Affandi Rohman Rizky Hardika ");
        System.out.println("265150700111031");

        Scanner userInput = new Scanner (System.in);
        System.out.print ("Masukkan nilai Anda: ");
        int nilai = userInput.nextInt();

        char grade;
        if (nilai > 100) {
            System.out.println("Nilai tidak boleh lebih dari 100");
            return;
        } else if (nilai >= 81) {
            grade = 'A'; 
        } else if (nilai >= 71) {
            grade = 'B'; 
        } else if (nilai >= 61) {
            grade = 'C'; 
        } else if (nilai >= 41) {
            grade = 'D'; 
        } else if (nilai >= 0) {
            grade = 'E'; 
        } else {
            System.out.println("Nilai tidak boleh kurang dari 0");
            return;
        }

        System.out.println("nilai Anda : " + grade);
    }
}
