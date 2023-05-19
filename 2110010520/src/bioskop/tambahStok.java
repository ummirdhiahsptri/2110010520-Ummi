/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bioskop;

import java.util.Date;

/**
 *
 * @author Acer
 */
public class tambahStok {
    private int idtambahStok;
    private Date tgl;
    private int kdBarang;
    private String tambah;

    // Constructor
    public tambahStok(int idtambahStok, Date tgl, int kdBarang, String tambah) {
        this.idtambahStok = idtambahStok;
        this.tgl = tgl;
        this.kdBarang = kdBarang;
        this.tambah = tambah;
    }

    // Getter dan Setter
    public int getIdtambahStok() {
        return idtambahStok;
    }

    public void setIdtambahStok(int idtambahStok) {
        this.idtambahStok = idtambahStok;
    }
    
     public Date gettgl() {
        return tgl;
    }

    public void settgl(Date tgl) {
        this.tgl = tgl;
    }

    public int getkdBarang() {
        return kdBarang;
    }

    public void setkdBarang(int kdBarang) {
        this.kdBarang = kdBarang;   
    }
    public String gettambah() {
        return tambah;
    }

    public void settambah(String tambah) {
        this.tambah = tambah;
    }
    
    // Method
    public void tampilkanInfo() {
        System.out.println("Id Tambah Stok: " + idtambahStok);
        System.out.println("tgl: " + tgl);
        System.out.println("Kode Barang: " + kdBarang);
        System.out.println("tambah: " + tambah);
    }
    
    public boolean isTgl() {
        Date tanggalSekarang = new Date();
        return tgl.before(tanggalSekarang);
    } 
        
}
