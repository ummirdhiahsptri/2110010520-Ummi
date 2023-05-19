/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bioskop;

/**
 *
 * @author Acer
 */
public class bioskop {
    private int kdbioskop;
    private String nmBioskop;
    private String kota;
    private String studio;
    private String alamat;
    
    // Constructor
    public bioskop(int kdbioskop, String nmBioskop, String kota, String studio, String alamat) {
        this.kdbioskop = kdbioskop;
        this.nmBioskop = nmBioskop;
        this.kota = kota;
        this.studio = studio;
        this.alamat = alamat;
    }

    // Getter dan Setter
    public int getkdbioskop() {
        return kdbioskop;
    }

    public void setkdbioskop(int kdbioskop) {
        this.kdbioskop = kdbioskop;
    }

    public String getkota() {
        return kota;
    }

    public void setkota(String kota) {
        this.kota = kota;
    }

    public String getstudio() {
        return studio;
    }

    public void studio(String studio) {
        this.studio = studio;
    }

    public String getalamat() {
        return alamat;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    // Method
    public void tampilkanInfoBioskop() {
        System.out.println("Kd Bioskop : " + kdbioskop);
        System.out.println("Nama Bioskop : " + nmBioskop);
        System.out.println("Kota : " + kota);
        System.out.println("Studio : " + studio);
        System.out.println("Alamat : " + alamat);
    }
    
}
