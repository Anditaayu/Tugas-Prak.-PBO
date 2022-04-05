
import java.util.Scanner;
import perlombaan.lombaanimasi;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andita Ayu Safitri
 */
public class animasi implements lombaanimasi {
    double alur, konten, kreatif, input, sinema;
    
    public animasi() {
        this.input = new Scanner(System.in);
    }
    
    int penilaiananimasi(){
        System.out.println("--- Form Penilaian ---");
        System.out.println("Keterangan: Nilai yang valid berada di antara 0 - 100");
        System.out.println(" ");
        
        System.out.println("Input Nilai Alur Cerita : ");
        alur = input.nextDouble();
        System.out.println("Input Nilai Konten : ");
        konten = input.nextDouble();
        System.out.println("Input Nilai Kreativitas : ");
        kreatif = input.nextDouble();
        System.out.println("Input Nilai Sinematografi : ");
        sinema = input.nextDouble();
        return 0;
    }
    
    
    @Override
    public void nilaianimasi() {
        Double nilaiakhir = ((15/100) * alur) + ((35/100) * konten) + ((35/100) * kreatif) + ((15/100) * sinema);
        System.out.println("Nilai Akhir : " +nilaiakhir);
        String ket = null;
        System.out.println("KETERANGAN : " +ket);
         if (nilaiakhir >= 85) {
            ket = "LOLOS";
            System.out.println("Mohon maaf " +this.nama "dari " +this.asal "dinyatakan lolos seleksi lomba animasi");
        } else {
            ket = "GAGAL";
            System.out.println("Mohon maaf " +this.nama "dari " +this.asal "dinyatakan tidak lolos seleksi lomba animasi");
        }
    }
}
