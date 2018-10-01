/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117121.latihan19.saldotabungan;

/**
 *
 * @author CHEEKIBREEKIIVDAMKE
 *NAMA                 : M Rifqi S M and Associates
 *KELAS                : PBO-3 
 *NIM                  : 10117121
 *Program Deskripsi    : Program menampilkan penambahan saldo per bulan
 */
public class PBO310117121Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        int saldoAwal;
        int bunga; 
        int jbunga; 
        int lamaBulan;
        
        saldoAwal = 2500000;
        bunga = 15;
        lamaBulan = 6;
        
        for (int i = 1; i <= lamaBulan; i++){
           jbunga = saldoAwal*bunga/100;
           saldoAwal += jbunga;
           String mataUang = String.format("Rp.%,3d", saldoAwal).replaceAll(",", ".");
           System.out.printf("Saldo di bulan ke-"+i+" %s%n",mataUang);
        }
    }
    
}
    
    

