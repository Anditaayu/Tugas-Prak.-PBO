/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Andita Ayu Safitri
 */
public class balok extends persegipanjang{
    double panjang, lebar, tinggi;

    public balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar, tinggi);        
    }
    
    int hasil1 (){
        persegipanjang hasilmenu1 = new persegipanjang (panjang, lebar, tinggi);       
                
        System.out.println("Luas Persegi Panjang : " + hasilmenu1.luas());
        System.out.println("Keliling Persegi Panjang : " + hasilmenu1.keliling());
        System.out.println("Volume Balok : " + hasilmenu1.volume());
        System.out.println("Luas Permukaan Balok : " + hasilmenu1.luasPermukaan());
        return 0;
    }
}