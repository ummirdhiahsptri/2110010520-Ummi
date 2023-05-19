/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010520;

import bioskop.*;
import java.util.Date;


/**
 *
 * @author Acer
 */
public class Main {

    
    public static void main(String[] args) {
        
        
        // Membuat objek dari class bioskop
        bioskop Bioskop = new bioskop(10, "warna", "banjarmasin", "reguler", "banjar");

        // Membuat objek dari class order
        order Order = new order(11, new Date(), "dua", "sebelas", "dua", "ada", "ada");

        // Membuat objek dari class stok
        stok Stok = new stok(12, 1, "kartu", "1000", "100");

        // Membuat objek dari class TambahStok
        tambahStok Tambahstok  = new tambahStok(13, new Date(), 8, "satu");

        // Membuat objek dari class transaksi
        transaksi Transaksi = new transaksi(14, 2, 3, "ada");

        // Membuat objek dari class user
        user User = new user(15, "aya", "tujuh", "reguler", "admin");

        // Menampilkan informasi objek 
        Bioskop.tampilkanInfoBioskop();
        Order.tampilkanInfo();
        Stok.tampilkanInfo();
        Tambahstok.tampilkanInfo();
        Transaksi.tampilkanInfo();
        User.tampilkanInfo();
  
    }
    
}
