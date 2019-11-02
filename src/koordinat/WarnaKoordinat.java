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
public class WarnaKoordinat extends Koordinat {
    
    public String namaWarna;

    public WarnaKoordinat(int x, int y, String namaWarna) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.namaWarna = namaWarna;
    }
    
    public String getNamaWarna(){
        return namaWarna;        
    }
    
    public void setNamaWarna(String namaWarna){
        
    }
    
}
