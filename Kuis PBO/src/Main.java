/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andita Ayu Safitri
 */

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double C = 0, K = 0, F = 0, R = 0;
        int kategori, nama, asal ;
        double alur = 0, konten = 0, kreatif = 0, input = 0 , sinema = 0;
        boolean ulang = true;
        
        Scanner input = new Scanner(System.in);
        
        while(ulang){
            System.out.println("+--------------------+");
            System.out.println("PROGRAM LOMBA APRESIASI PAHLAWAN WANITA INDONESIA");
            System.out.println("OLEH UPNYK");
            System.out.println("+--------------------+");
            System.out.println("Terdapat 2 kategori perlombaan : ");
            System.out.println("1. Animasi (Tim)");
            System.out.println("2. Menulis Surat (Individu)");
            System.out.println("");
            
            animasi Animasi = new animasi();
            surat Surat = new surat();
            boolean ulangi = true;
            
            do{
                System.out.println("Pilih kategori perlombaan : ");
                kategori = input.nextInt();
                
                System.out.println("=== FORM PENDAFTARAN ===");
                System.out.println("Input Nama : ");
                nama = input.nextInt();
                System.out.println("Asal Sekolah : ");
                asal = input.nextInt();
                
                if (kategori == 1){
                        Animasi.penilaiananimasi();
                }
                else if (kategori == 2){
                        Animasi.penilaiansurat();
                }
                else {
                    System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar!");
                    continue;
                }
            }while (ulangi);
        } 
    }
}
