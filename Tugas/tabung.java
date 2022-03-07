/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Andita Ayu Safitri
 */
public class tabung extends lingkaran {
    double phi = 3.14;
    double jari, tinggi;
    
    
    public tabung(double phi, double jari) {
        super(phi, jari);
    }
    
    int hasil2(){
        lingkaran hasilmenu2 = new lingkaran(jari, tinggi);
        
        System.out.println("Luas Lingkaran : " + hasilmenu2.luas());
        System.out.println("Keliling Lingkaran : " + hasilmenu2.keliling());
        System.out.println("Volume Tabung : " + hasilmenu2.volume());
        System.out.println("Luas Permukaan Tabung : " + hasilmenu2.luasPermukaan());
        return 0;
    }
}
