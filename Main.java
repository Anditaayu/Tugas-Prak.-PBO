
package praktikum.pbo;

import java.util.Scanner;

// Andita Ayu Safitri
// 123200118
// Prak. PBO Plug-C

public class Main {
    
    public static void main(String[] args) {
        double C = 0, K = 0, F = 0, R = 0;
        int pilih, pilihku;
        double suhu;
        boolean ulang = true;
        
        Scanner input = new Scanner(System.in);
        
        while(ulang){
            System.out.println("+--------------------+");
            System.out.println("PROGRAM KONVERSI SUHU");
            System.out.println("+--------------------+");
            System.out.println("Input Data");
            System.out.println("-----------");
            System.out.println("Suhu Dalam Celcius  : ");
            suhu = input.nextInt();
            System.out.println("");
            
            Converter celcius = new Converter(suhu);
            boolean ulangi = true;
            
            do{
                System.out.println("Opsi");
                System.out.println("----");
                System.out.println("1. Lihat Data Konversi");
                System.out.println("2. Edit Data Koneversi");
                System.out.println("3. Exit");
                System.out.println("Pilih : ");
                pilih = input.nextInt();

                if (pilih == 1){
                        celcius.rumusSuhu();
                }
                else if (pilih == 2){
                        ulangi = false;
                }
                else if (pilih == 3){
                        ulang = false;
                        ulangi = false;
                }
                else {
                    System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar!");
                    continue;
                }
            }while (ulangi);
        } 
    }
}
