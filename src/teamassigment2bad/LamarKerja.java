/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teamassigment2bad;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class LamarKerja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String jabatan = null;
        System.out.println("===============================================");
        System.out.println("==== Selamat Datang di Perekrutan Karyawan ====");
        System.out.println("===============================================");
        System.out.println(" ");

        // Pilihan jabatan yang ingin anda lamar
        System.out.println("(1.) Staff");
        System.out.println("(2.) Officer");
        System.out.println("(3.) Supervisor");
        System.out.println("(4.) Manager");
        System.out.println(" ");
        System.out.print("Pilih jenis jabatan yang dilamar :   ");
        int pilihanJabatan = scanner.nextInt();
        
        switch (pilihanJabatan) {
            case 1:
                jabatan = "Staff";
                System.out.print("Masukkan Nama Anda :  ");
                String namaPelamar1 = scanner.next();
                System.out.print("Masukkan Usia Anda :  ");
                int usiaPelamar1 = scanner.nextInt();
                if (usiaPelamar1 > 25) {
                    System.out.println("Maaf usia anda telah melebihi batas untuk posisi ini!");
                    jabatan = null;
                } else if(usiaPelamar1 <= 25){
                    System.out.println("Pendaftaran perekrutan karyawan berhasil, data anda telah kami terima, silahkan tunggu konfirmasi selanjutnya !");
                    System.out.println("Nama    : " + namaPelamar1);
                    System.out.println("Jabatan : " + jabatan);
                    System.out.println("Usia    : " + usiaPelamar1);
                }
                break;
            case 2:
                jabatan = "Officer";
                System.out.print("Masukkan Nama Anda :  ");
                String namaPelamar2 = scanner.next();
                System.out.print("Masukkan Usia Anda :  ");
                int usiaPelamar2 = scanner.nextInt();
                
                if (usiaPelamar2 > 30) {
                    System.out.println("Maaf usia anda telah melebihi batas untuk posisi ini!");
                    jabatan = null;
                } else if(usiaPelamar2 <= 30){
                    System.out.println("Pendaftaran perekrutan karyawan berhasil, data anda telah kami terima, silahkan tunggu konfirmasi selanjutnya !");
                    System.out.println("Nama    : " + namaPelamar2);
                    System.out.println("Jabatan : " + jabatan);
                    System.out.println("Usia    : " + usiaPelamar2);
                }
                break;
            
            case 3:
                jabatan = "Officer";
                System.out.print("Masukkan Nama Anda :  ");
                String namaPelamar3 = scanner.next();
                System.out.print("Masukkan Usia Anda :  ");
                int usiaPelamar3 = scanner.nextInt();
                
                if (usiaPelamar3 > 35) {
                    System.out.println("Maaf usia anda telah melebihi batas untuk posisi ini!");
                    jabatan = null;
                } else if(usiaPelamar3 <= 35){
                    System.out.println("Pendaftaran perekrutan karyawan berhasil, data anda telah kami terima, silahkan tunggu konfirmasi selanjutnya !");
                    System.out.println("Nama    : " + namaPelamar3);
                    System.out.println("Jabatan : " + jabatan);
                    System.out.println("Usia    : " + usiaPelamar3);
                }
                break;
            
            case 4:
                jabatan = "Manager";
                System.out.print("Masukkan Nama Anda :  ");
                String namaPelamar4 = scanner.next();
                System.out.print("Masukkan Usia Anda :  ");
                int usiaPelamar4 = scanner.nextInt();
                
                if (usiaPelamar4 > 40) {
                    System.out.println("Maaf usia anda telah melebihi batas untuk posisi ini!");
                    jabatan = null;
                } else if(usiaPelamar4 <= 40){
                    System.out.println("Pendaftaran perekrutan karyawan berhasil, data anda telah kami terima, silahkan tunggu konfirmasi selanjutnya !");
                    System.out.println("Nama    : " + namaPelamar4);
                    System.out.println("Jabatan : " + jabatan);
                    System.out.println("Usia    : " + usiaPelamar4);
                }
                break;
        }
    }

}
