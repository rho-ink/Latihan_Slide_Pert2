/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117121.latihan26.waktusaatini;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 
/**
 *
 * @author CHEEKIBREEKIIVDAMKE
 */
public class PBO310117121Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     *NAMA                 : M Rifqi S M
     *KELAS                : PBO-3 
     *NIM                  : 10117121
     *Program Deskripsi    : Program menampilakan waktu yang tersinkronisasi ke sistem
     */

    public static void main(String[] args) {    
    System.out.print("hari ini adalah : ");
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
    LocalDateTime now = LocalDateTime.now();  
    System.out.println(dtf.format(now));  
    }   
}     

    

