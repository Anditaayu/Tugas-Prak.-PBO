/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author Andita Ayu Safitri
 */
public class Main {
    public static void main(String[] args) {
        double panjang = 0, lebar = 0, tinggibalok = 0; 
        double phi = 3.14;
        double jari = 0, tinggi = 0;
        int pilih;
        boolean ulang = true;
        
        Scanner input = new Scanner(System.in);
        
         while(ulang){
            System.out.println("+--------------------+");
            System.out.println("PROGRAM BANGUN RUANG");
            System.out.println("+--------------------+");
            System.out.println(" ");
            
            balok menu1 = new balok(panjang, lebar, tinggi);
            tabung menu2 = new tabung(phi, jari);
            boolean ulangi = true;
            
            do{
                System.out.println("Opsi Menu");
                System.out.println("----");
                System.out.println("1. Balok");
                System.out.println("2. Tabung");
                System.out.println("3. Exit");
                System.out.println("Pilih : ");
                pilih = input.nextInt();

                switch (pilih) {
                    case 1:
                        System.out.println("Masukkan panjang : ");
                        panjang = input.nextDouble();
                        System.out.println("Masukkan lebar : ");
                        lebar = input.nextDouble();
                        System.out.println("Masukkan tinggi : ");
                        tinggibalok = input.nextDouble();
                        menu1.hasil1();
                        break;
                    case 2:
                        System.out.println("Masukkan tinggi : ");
                        tinggibalok = input.nextDouble();
                        System.out.println("Masukkan jari-jari : ");
                        jari = input.nextDouble();
                        menu2.hasil2();
                        break;
                    case 3:
                        ulang = false;
                        ulangi = false;
                        break;
                    default:
                        System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar!");
                        continue;
                }
            }while (ulangi);
        } 
    }
}
