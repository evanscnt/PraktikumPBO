package com.rizaldiikhlasulakmal.praktikumpbo4;

public class Perkakas {
    String nama;
    String keadaan;
    int jml;
    
    public void disclaimer(){
        System.out.println("Beberapa jenis perkakas " + barang +"!");
    }
    
    public void showInfo(){
        System.out.println("Ambil perkakas " + nama + " Jumlahnya sebanyak : " + jml + ", Sudah diambil!");
        extraInfo();
    }
    
    public void extraInfo(){}
}
