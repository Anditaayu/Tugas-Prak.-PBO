/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Andita Ayu Safitri
 */
public class persegipanjang implements hitungruang {
    double panjang, lebar, tinggibalok;

    public persegipanjang(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggibalok = tinggibalok;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggibalok() {
        return tinggibalok;
    }

    public void setTinggibalok(double tinggibalok) {
        this.tinggibalok = tinggibalok;
    }

    
    @Override
    public double keliling() {
        return 2*(this.panjang+this.lebar);
    }

    @Override
    public double luas() {
        return this.panjang*this.lebar;
    }

    @Override
    public double luasPermukaan() {
        return 2*((this.panjang*this.lebar)+(this.panjang*this.tinggibalok)+(this.lebar*this.tinggibalok));
    }

    @Override
    public double volume() {
        return this.panjang*this.lebar*this.tinggibalok;
    }
    
}

