/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pbo;
/**
 *
 * @author Andita Ayu Safitri
 */
public class Converter {
    double suhu;

    public Converter(double suhu) {
        this.suhu = suhu;
    }
    
    int rumusSuhu(){
       double F = ( 4 * this.suhu )/5;
       double R =  (( 9 * this.suhu )/5) + 32;
       double K = this.suhu + 273.15;
       
       System.out.println("Suhu Dalam Celcius    : " + this.suhu + "°C");
       System.out.println("Suhu Dalam Fahrenheit    : " + F + "°F");
       System.out.println("Suhu Dalam Reaumur    : " + R + "°R");
       System.out.println("Suhu Dalam Kelvin    : " + K + "°K");
       
       if (this.suhu <= 0){
           System.out.println("Kondisi Air Beku.\n");
       }
       else if (this.suhu > 0 && this.suhu < 100 ){
           System.out.println("Kondisi Air Normal.\n");
       }
       else {
           System.out.println("Kondisi Air Mendidih.\n");
       }
       return 0;
    };
}

    
   