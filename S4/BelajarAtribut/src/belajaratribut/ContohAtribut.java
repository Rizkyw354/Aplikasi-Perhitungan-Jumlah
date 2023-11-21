/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajaratribut;

/**
 *
 * @author ariff
 */
public class ContohAtribut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Orang budi = new Orang();
        budi.nama = "Budiman";
        budi.alamat = "Banjarmasin";
        budi.umur = 25;
        budi.menikah = false;
        
        Orang rina = new Orang();
        rina.nama = "nose";
        rina.alamat = "Banjarbaru";
        rina.umur = 26;
        rina.menikah = true;
        
        System.out.println(budi.nama);
        System.out.println(budi.alamat);
        System.out.println(budi.umur);
        System.out.println(budi.menikah);
        
        System.out.println(rina.nama);
        System.out.println(rina.alamat);
        System.out.println(rina.umur);
        System.out.println(rina.menikah);
    }
    
}
