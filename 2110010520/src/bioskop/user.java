/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bioskop;

/**
 *
 * @author Acer
 */
public class user {
    private int idUser;
    private String username;
    private String password;
    private String Bioskop;
    private String level;

    // Constructor
    public user(int idUser, String username, String password, String Bioskop, String level) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.Bioskop = Bioskop;
        this.level = level;
    }

    // Getter dan Setter
    public int getidUser() {
        return idUser;
    }

    public void setidUser(int idUser) {
        this.idUser = idUser;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public String getBioskop() {
        return Bioskop;
    }

    public void setBioskop(String Bioskop) {
        this.Bioskop = Bioskop;
    }

    public String getlevel() {
        return level;
    }

    public void setlevel(String level) {
        this.level = level;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("Id User: " + idUser);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Bioskop: " + Bioskop);
        System.out.println("level: " + level);
    }   
}
