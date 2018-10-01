/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117121.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author CHEEKIBREEKIIVDAMKE
 *NAMA                 : M Rifqi S M and Associates
 *KELAS                : PBO-3 
 *NIM                  : 10117121
 *Program Deskripsi    : Program memperbaiki kalimat berantakan lettercase nya
 */
public class PBO310117121Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimat;
        String hBesar;
        String hKecil;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        kalimat = scanner.nextLine(); 
        
        hBesar = kalimat.toUpperCase(); 
        hKecil = kalimat.toLowerCase(); 
        
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Huruf Besar : "+ hBesar);
        System.out.println("Huruf Kecil : "+ hKecil);
        
    }
}
