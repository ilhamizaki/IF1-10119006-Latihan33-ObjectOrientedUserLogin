/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : class main User Login
 */
public class Latihan33Login {
    private static String usName;
    private static String passWord;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Username : ");
        usName = scanner.next();
        System.out.print("Masukkan Password : ");
        passWord = scanner.next();
        
        User login = new User();
        boolean status = login.cekAkun(usName, passWord);
        login.pengecekkanLogin(usName, passWord);
        login.hasilLogin(status, usName);
        
    }
}
