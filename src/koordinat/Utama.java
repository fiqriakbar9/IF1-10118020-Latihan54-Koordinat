/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koordinat;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan Titik Koordinat X dan Y
 * 
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        WarnaKoordinat wk = new WarnaKoordinat(10,4,"Jingga");
        
        System.out.println("Warna Koordinat : "+wk.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+wk.getX()+", y : "+wk.getY());
        
        System.out.println("\nDevelop By : Fiqri Akbar Pratama");
    }
    
}
