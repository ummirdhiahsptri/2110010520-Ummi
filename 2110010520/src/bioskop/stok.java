/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bioskop;

/**
 *
 * @author Acer
 */
public class stok {
    private int idStok;
    private int kodeStok;
    private String namaBarang;
    private String total;
    private String satuan;
    

    // Constructor
    public stok (int idStok, int kodeStok, String namaBarang, String total, String satuan) {
        this.idStok = idStok;
        this.kodeStok = kodeStok;
        this.namaBarang = namaBarang;
        this.total = total;
        this.satuan = satuan;
        
        
    }

    // Getter dan Setter
    public int getIdStok() {
        return idStok;
    }

    public void setIdStok(int idStok) {
        this.idStok = idStok;
    }

    public int getkodeStok() {
        return kodeStok;
    }

    public void setkodeStok(int kodeStok) {
        this.kodeStok = kodeStok;
    }

    public String getnamaBarang() {
        return namaBarang;
    }

    public void setnamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    
    public String gettotal() {
        return total;
    }

    public void settotal(String total) {
        this.total = total;
    }
    
    public String getsatuan() {
        return satuan;
    }

    public void setsatuan(String satuan) {
        this.satuan = satuan;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("Id Stok: " + idStok);
        System.out.println("Kode Barang: " + kodeStok);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Total: " + total);
        System.out.println("Satuan: " + satuan);
    }
  
}
