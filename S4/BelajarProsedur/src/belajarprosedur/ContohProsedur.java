/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajarprosedur;

/**
 *
 * @author ariff
 */
public class ContohProsedur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manusia budi = new Manusia();
        budi.nama = "Budiman Cahyadi";
        budi.alamat = "Surabaya";
        budi.jk = "Laki-Laki";
        
        Manusia irma = new Manusia();
        irma.nama = "Irmandi";
        irma.alamat = "Hokage";
        irma.jk = "Perempuan";
        
       budi.tampilInformasi();
       irma.tampilInformasi();
    }
    
}
