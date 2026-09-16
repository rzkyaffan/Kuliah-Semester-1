package latihanMandiri;

import java.util.Scanner;  

public class latihan {
    public static void main(String[] args){
        /* Scanner input = new Scanner(System.in); 
        System.out.print("Masukin nama lo bang: ");
        String userInput = input.nextLine(); 

        System.out.print("Nama lo " + userInput + " bukan?");
        System.out.print("Konfirmasi: (Y/N): ");
        char validation = input.next().charAt(0);

        if (validation == 'Y') {
            System.out.println("Oke bang " + userInput);
        } else {
            System.out.println("Lu sape mpruy");
        }
        input.close(); */

        String[][] nama = { { "Satu", "Duwa", "tiga", "empats" }, {"limas", "enams", "tujuh"}};

        for( int i = 0; i< nama.length ; i++){
            for( int a = 0; a < nama[i].length; a++){
                System.out.println(nama[i][a]);
            }
        }
    }
}
