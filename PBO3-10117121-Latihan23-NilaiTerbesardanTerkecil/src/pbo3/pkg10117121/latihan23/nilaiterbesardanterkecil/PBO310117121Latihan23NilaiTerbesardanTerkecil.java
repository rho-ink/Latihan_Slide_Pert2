/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117121.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author CHEEKIBREEKIIVDAMKE
 *NAMA                 : M Rifqi S M and Assosiates
 *KELAS                : PBO-3 
 *NIM                  : 10117121
 *Program Deskripsi    : Program menentukan nilai besar dan kecil
 */
public class PBO310117121Latihan23NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String petugas;
        int nMhs;
        int nBesar;
        int nKecil;
        int nilaiMhs;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("======Program Nilai Terbesar dan Terkecil Nilai "
                + "Mahasiswa======");
        
        System.out.print("Masukkan Nama Petugas : ");
        petugas = scanner.next();
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        nMhs = scanner.nextInt();
        
        nBesar = 0;
        nKecil = 100;
        for (int i = 1; i <= nMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+i+" = ");
            nilaiMhs = scanner.nextInt();
            
            nBesar = ((nBesar<=nilaiMhs)?nilaiMhs:nBesar);
            nKecil = ((nKecil>=nilaiMhs)?nilaiMhs:nKecil);
        }
        
        System.out.print("\nNilai Terbesar adalah : "+ nBesar);
        System.out.println("\nNilai Terkecil adalah : "+ nKecil);
        
    }
}
