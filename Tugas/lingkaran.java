/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Andita Ayu Safitri
 */
public class lingkaran implements hitungruang{
    double phi = 3.14;
    double jari, tinggi;

    
    public lingkaran(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }
    
    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

   
    @Override
    public double keliling() {
        return 2*this.phi*this.jari;
    }

    @Override
    public double luas() {
        return this.phi*this.jari*this.jari;
    }
    
    @Override
    public double luasPermukaan() {
        return ((2*this.phi*this.jari*this.jari) + (2*this.phi*this.jari*this.tinggi));
    }

    @Override
    public double volume() {
        return this.phi*this.jari*this.jari*this.tinggi;
    }
   
}

