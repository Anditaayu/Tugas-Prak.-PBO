/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andita Ayu Safitri
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection koneksi;
     
     public static Connection getKoneksi(){
         if (koneksi == null){
            try{
                String url = "jdbc:mysql://localhost/aslab_db";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Berhasil");
            }catch (SQLException e){
                System.out.println("Koneksi Gagal");
            }
        }
        return koneksi;
    }
    public static void main (String args[]){
        getKoneksi();
    }
}
