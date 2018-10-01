/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117121.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author CHEEKIBREEKIIVDAMKE
 *NAMA                 : M Rifqi S M
 *KELAS                : PBO-3 
 *NIM                  : 10117121
 *Program Deskripsi    : Program membandingkan dua buah nilai
 */
public class PBO310117121Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1;
        int n2;
        String lagi; 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("========Program Perbandingan Nilai========");
        do {            
            System.out.print("Masukkan nilai pertama : ");
            n1 = scanner.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            n2 = scanner.nextInt();
            
            if (n1 > n2) {
                System.out.println("Hasil : "+n1+" Lebih besar dari "+n2+"\n");
            }else if(n1 < n2){
                System.out.println("Hasil : "+n1+" Lebih kecil dari "+n2+"\n");
            }else
                System.out.println("Hasil : "+n1+" sama dengan "+n2+"\n");
                
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            lagi = scanner.next();
            
            System.out.println("");
        } while (!lagi.equals("Tidak"));
    }
    
}