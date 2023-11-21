/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package setdanget;

/**
 *
 * @author ariff
 */
public class SetdanGet {

    /**
     * @param args the command line arguments
     */
    private String nama;
    private int stok, harga_satuan, harga, total_harga;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHarga_satuan() {
        return harga_satuan;
    }

    public void setHarga_satuan(int harga_satuan) {
        this.harga_satuan = harga_satuan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int stok, int harga_satuan) {
        this.harga = stok*harga_satuan;
    }

    public int getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(int total_harga) {
        this.total_harga = total_harga;
    }
    
}
