/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117121.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author CHEEKIBREEKIIVDAMKE
 *NAMA                 : M Rifqi S M and Associates
 *KELAS                : PBO-3 
 *NIM                  : 10117121
 *Program Deskripsi    : Program menganti kata pada kalimat tertentu
 */
public class PBO310117121Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimatAwal;
        String kalimatBaru;
        String gantiKata;
        String jadiKata;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====Program Ganti Kata====\n");
        System.out.print("Masukkan Kalimat : ");
        kalimatAwal = scanner.nextLine();
        System.out.print("Ganti Kata : ");
        gantiKata = scanner.next();
        System.out.print("Menjadi Kata : ");
        jadiKata = scanner.next();
        kalimatBaru =  (kalimatAwal).replaceAll(gantiKata, jadiKata);
        
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat Awal : "+kalimatAwal);
        System.out.println("Kalimat Baru : "+kalimatBaru);
        
        
        
        
    }
    
}
