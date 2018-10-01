/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117121.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author CHEEKIBREEKIIVDAMKE
 *NAMA                 : M Rifqi S M and Associates
 *KELAS                : PBO-3 
 *NIM                  : 10117121
 *Program Deskripsi    : Program menghitung R,L, dan K lingkaran
 */
public class PBO310117121Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String d; 
        double diameter; 
        double r; 
        double L; 
        double K;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("======Perhitungan Lingkaran======");
        
        do {            
            System.out.print("Masukkan nilai diameter lingkaran : ");
            d = scanner.nextLine();
            System.out.println((!d.matches("[0-9]*"))
                    ?"Nilai Diameter Tidak Sesuai\n":"");

        } 
        while (!d.matches("[0-9]*"));
        
        System.out.println("\n======Hasil Perhitungan Lingkaran======");
        diameter = Double.parseDouble(d); 
        
        r = diameter/2;
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",r);
        L = Math.PI*r*r;
        System.out.printf("Luas Lingkaran = %.2f cm %n",L);
        K = 2*Math.PI*r;
        System.out.printf("Keliling Lingkaran = %.2f cm %n",K);
        
    }
    
    
}
