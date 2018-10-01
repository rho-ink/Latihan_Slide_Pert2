/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117121.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author CHEEKIBREEKIIVDAMKE
 *NAMA                 : M Rifqi S M
 *KELAS                : PBO-3 
 *NIM                  : 10117121
 *Program Deskripsi    : Program menghitung rata rata nilai mahasiswa
 */
public class PBO310117121Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int namaMhs;
        int nilaiMhs;
        double totalNilai;
        double avgNilai;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        namaMhs = scanner.nextInt();
        
        totalNilai = 0; 
        for (int i = 1; i <= namaMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            nilaiMhs = scanner.nextInt();
            totalNilai += nilaiMhs; 
        }
        
        avgNilai = totalNilai/namaMhs;
        System.out.println("\nMaka, Rata-rata Nilainya adalah "+avgNilai);
    }
    
}
    
