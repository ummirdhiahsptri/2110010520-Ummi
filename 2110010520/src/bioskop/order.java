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
public class order {
    private int idOrder;
    private Date tgl;
    private String kdBioskop;
    private String kdBarang;
    private String jumlah;
    private String keterangan;
    private String status;
    

    // Constructor
    public order(int idOrder, Date tgl, String kdBioskop, String kdBarang, String jumlah, String keterangan, String status) {
        this.idOrder = idOrder;
        this.tgl = tgl;
        this.kdBioskop = kdBioskop;
        this.kdBarang = kdBarang;
        this.jumlah =  jumlah;
        this.keterangan = keterangan;
        this.status = status;
                
    }

    // Getter dan Setter
    public int getidOrder() {
        return idOrder;
    }

    public void setidOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Date gettgl() {
        return tgl;
    }

    public void settgl(Date tgl) {
        this.tgl = tgl;
    }

    public String getkdBioskop() {
        return kdBioskop;
    }

    public void setkdBioskop(String kdBioskop) {
        this.kdBioskop = kdBioskop;
    }

    public String getkdBarang() {
        return kdBarang;
    }
    
    public void setkdBarang(String kdBarang) {
        this.kdBarang = kdBarang;
    }
    public String getjumlah() {
        return jumlah;
    }
    
    public void setjumlah(String jumlah) {
        this.jumlah = jumlah;
    }
    
    public String getketerangan() {
        return keterangan;
    }
    
    public void setketerangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
    public String getstatus() {
        return status;
    }

    public void setstatus(String status) {
        this.status = status;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("Id Order: " + idOrder);
        System.out.println("Tgl: " + tgl);
        System.out.println("Kd Bioskop: " + kdBioskop);
        System.out.println("Kd Barang: " + kdBarang);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Keterangan: " + keterangan);
        System.out.println("Status: " + status);
        
    }  
    
    public boolean isTgl() {
        Date tanggalSekarang = new Date();
        return tgl.before(tanggalSekarang);
    } 
}
