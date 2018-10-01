/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117121.latihan20.targetsaldotabungan;

/**
 *
 * @author CHEEKIBREEKIIVDAMKE
 *NAMA                 : M Rifqi S M and Associates
 *KELAS                : PBO-3 
 *NIM                  : 10117121
 *Program Deskripsi    : Program menampilkan saldo per bulan yang ber target
 */
public class PBO310117121Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int i;
        int saldoAwal;
        int bunga; 
        int jbunga; 
        int saldoTarget;
        
        saldoAwal = 3500000;
        bunga = 8;
        saldoTarget = 6000000;
        
        i=1;
        while (saldoAwal <= saldoTarget) {
            jbunga = saldoAwal*bunga/100;
            saldoAwal += jbunga;
            String mataUang = String.format("Rp.%,3d", saldoAwal).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-"+i+" %s%n",mataUang);
            i++;
        }
    }
    
}
