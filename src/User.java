/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : class User
 */
public class User {
    private static String username = "ilhamizaki";
    private static String password = "77ilhamizaki";
    private boolean statusAkun;
    
    public boolean cekAkun(String parUserName, String parPassword) {
        return (parUserName == null ? username == null : parUserName.equals(username)) 
            && (parPassword == null ? password == null : parPassword.equals(password));
    }
    
    public void hasilLogin(boolean status, String parUserName) {
        if(status) {
            System.out.println("Selamat Datang di Aplikasi ini");
        } else {
            System.out.println("Ooops, Username atau Password anda salah");
        }
    }
    
    public void pengecekkanLogin(String parUserName, String parPassword) {
        statusAkun = cekAkun(parUserName, parPassword);
        if(statusAkun) {
           System.out.println();
           System.out.println("******HALLO " + parUserName.toUpperCase() + "******");
        } else {
           System.out.println(); 
        }
        
    }
}
