/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajarobjek;

import belajarkelas.Buah;
import belajarkelas.Manusia;

/**
 *
 * @author ariff
 */
public class ContohObjek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manusia objekManusia = new Manusia();
        objekManusia.nama = "Rizky";
        objekManusia.jeniskelamin = "Laki-Laki";
        objekManusia.umur = 26;
        
        Buah objekBuah = new Buah();
        objekBuah.nama = "Pepaya";
        objekBuah.jumlah = 100;
        
    }
    
}
