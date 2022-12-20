package com.rizaldiikhlasulakmal.praktikumpbo4;

import java.util.Scanner;

public class Main1 {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" === PERKAKAS ===  ");
        System.out.println("   1. Pisau   ");
        System.out.println("   2. Golok   ");
        System.out.println("   3. Cangkul       ");
        System.out.println("   4. Keluar       ");
        System.out.print("Masukkan Pilihan : ");
        int pilihan = input.nextInt();
        System.out.println();
        Pisau pc = new Pisau();
        Perkakas hu = new Perkakas();
        Golok ky = new Golok();
        
        pc.nama = "Pisau";
        pc.jml = 2;
        pc.keadaan = "Baik";
        pc.ciriCiri = "Tajam";
        
        hu.nama = "Golok";
        hu.keadaan ="Baik";
        hu.jml = 1;
        
        ky.nama = "Cangkul";
        ky.jml = 3;
        ky.keadaan = "Baik";
        ky.ciriCiri = "Ujungnya tajam";
        
        switch(pilihan){
            case 1:
               pc.disclaimer();
               pc.showInfo();
               pc.funFact();
               pc.extraInfo(); 
            break;
            
            case 2:
                hu.disclaimer();
                hu.showInfo();
            break;
            
            case 3:
               ky.disclaimer();
               ky.showInfo();
               ky.funFact();
               ky.extraInfo(); 
            break;
            
            case 4:
                System.out.println("Silahkan Keluar");
            break;
        }
    }
}
