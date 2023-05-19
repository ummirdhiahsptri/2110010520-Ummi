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
public class transaksi {
    private int idTransaksi;
    private int idorder;
    private int kodebioskop;
    private String status;

    // Constructor
    public transaksi(int idTransaksi, int idorder, int kodebioskop, String status) {
        this.idTransaksi = idTransaksi;
        this.idorder = idorder;
        this.kodebioskop = kodebioskop;
        this.status = status;
    }

    // Getter dan Setter
    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getidorder() {
        return idorder;
    }

    public void setidorder(int idorder) {
        this.idorder = idorder;
    }

    public double getkodebioskop() {
        return kodebioskop;
    }

    public void setkodebioskop(int kodebioskop) {
        this.kodebioskop = kodebioskop;
    }

    public String getstatus() {
        return status;
    }

    public void setstatus(String status) {
        this.status = status;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("Id Transaksi: " + idTransaksi);
        System.out.println("Id Order: " + idorder);
        System.out.println("Kode Bioskop: " + kodebioskop);
        System.out.println("Status: " + status);
    }   
}
