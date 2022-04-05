
import java.util.Scanner;
import perlombaan.lombasurat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andita Ayu Safitri
 */
public class surat implements lombasurat{
    int nama, asal;

    public surat(int nama, int asal) {
        this.nama = nama;
        this.asal = asal;
    }
    
    double struktur, isi, kreatif, kaidah;
    
    public surat() {
        this.input = new Scanner(System.in);
    }
    
    int penilaiananimasi(){
        System.out.println("--- Form Penilaian ---");
        System.out.println("Keterangan: Nilai yang valid berada di antara 0 - 100");
        System.out.println(" ");
        
        System.out.println("Input Nilai Struktur Surat : ");
        struktur = input.nextDouble();
        System.out.println("Input Nilai Isi Surat : ");
        isi = input.nextDouble();
        System.out.println("Input Nilai Kreativitas: ");
        kreatif = input.nextDouble();
        System.out.println("Input Nilai Penerapan Kaidah Bahasa : ");
        kaidah = input.nextDouble();
        return 0;
    }
    @Override
    public void nilaisurat() {
        ouble nilaiakhir = ((10/100) * struktur) + ((40/100) * isi) + ((30/100) * kreatif) + ((20/100) * kaidah);
        System.out.println("Nilai Akhir : " +nilaiakhir);
        String ket = null;
        System.out.println("KETERANGAN : " +ket);
        if (nilaiakhir >= 85) {
            ket = "LOLOS";
            System.out.println("Mohon maaf " +this.nama "dari " +this.asal "dinyatakan lolos seleksi lomba surat");
        } else {
            ket = "GAGAL";
            System.out.println("Mohon maaf " +this.nama "dari " +this.asal "dinyatakan tidak lolos seleksi lomba surat");
        }
}
