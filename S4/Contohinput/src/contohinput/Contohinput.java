/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contohinput;

/**
 *
 * @author ariff
 */
public class Contohinput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nilai : ");
        int nilai = input.nextInt();
        
        input.nextLine();
        System.out.print("Nama : ");
        String nama = input.nextLine();
        
        System.out.print("Menikah : ");
        boolean menikah =input.nextBoolean();
        
        System.out.println("Nilai yang dimasukkan adalah " +nilai);
        System.out.println("Nama yang dimasukkan adalah "+nama);
        System.out.println("Menikah yang dimasukkan adalah "+menikah);
        // TODO code application logic here
    }
    
}