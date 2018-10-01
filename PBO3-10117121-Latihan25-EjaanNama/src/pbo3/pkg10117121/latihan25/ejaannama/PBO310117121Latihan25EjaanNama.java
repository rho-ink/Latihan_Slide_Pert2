/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117121.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author CHEEKIBREEKIIVDAMKE
 *NAMA                 : M Rifqi S M and Associates
 *KELAS                : PBO-3 
 *NIM                  : 10117121
 *Program Deskripsi    : Program mengeja nama dan diurut sesuai nomor
 */
public class PBO310117121Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama;
        int panjang; 
        char huruf; 
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama Anda untuk dieja : ");
        nama = scanner.next();
        panjang = nama.length();
        
        System.out.println("\nEjaan untuk "+" \""+nama+"\" adalah : ");
        for (int i = 0; i < panjang; i++) {
            System.out.println("Huruf ke-"+(i+1)+" : "+nama.charAt(i));
        }
    }
    
}
    