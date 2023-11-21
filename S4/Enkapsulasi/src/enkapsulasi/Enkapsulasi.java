/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enkapsulasi;

/**
 *
 * @author ariff
 */
public class Enkapsulasi {

    /**
     * @param args the command line arguments
     */
    private int alas, tinggi;
    private double luasSegitiga;
    
    public void setAlas(int alas) {
        this.alas = alas;
    }
    public int getAlas() {
        return alas;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public int getTinggi() {
        return tinggi;
    }
    public void setLuasSegitiga(int alas,int tinggi) {
        luasSegitiga = 0.5 * (double)(alas * tinggi);
    }
    public double getLuasSegitiga() {
        return luasSegitiga;
    }
    public class MainEnkapsulasi {
        public static void main (String args[])
        {   Enkapsulasi ob = new Enkapsulasi();
        ob.setAlas(5);
        ob.setTinggi(7);
        System.out.println("Alas Segitiga : "+ob.getAlas());
        System.out.println("Tinggi Segitiga : "+ob.getTinggi());
        ob.setLuasSegitiga(ob.getAlas(), ob.getTinggi());
        System.out.println("Alas Segitiga : "+ob.getAlas());
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
