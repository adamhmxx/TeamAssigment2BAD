/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teamassigment2bad;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class OperasiBiner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int desimal = 0, i = 1, digit;
        System.out.println("=================================================");
        System.out.println("==== Selamat Datang di Program Operasi Biner ====");
        System.out.println("=================================================");
        System.out.println(" ");
        System.out.print("Masukkan Angka Biner Anda (Max 8 Digit) :  ");
        int biner = scanner.nextInt();

        System.out.println(" ");
        System.out.print("Angka Desimal dari biner " + biner);

        while (biner != 0) {
            if (String.valueOf(biner).length() <= 8) {
                digit = biner % 10;
                desimal = desimal + (digit * i);
                i = i * 2;
                biner = biner / 10;
            }
            else{
                System.out.println("Angka Biner yang anda inputkan melebihi batas ketentuan !");
                break;
            }

        }

        System.out.println(" adalah : " + desimal);
    }

}
