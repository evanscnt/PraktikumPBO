package com.rizaldiikhlasulakmal.praktikumpbo3;

public class Main1 {
    public static void main(String[] args) {
        Challenge rizaldi = new Challenge("Rizaldi", 1, 2001);
        Challenge ikhlasul = new Challenge("Ikhlasul", 2, 2002);
        Challenge akmal = new Challenge ("Akmal", 3, 2003);
        
        rizaldi.showProfile();
        ikhlasul.showProfile();
        akmal.showProfile();
        
        System.out.println("Rizaldi name (before) : " + rizaldi.getName());
        rizaldi.setName("Asshole");
        System.out.println("Rizaldi name (after) : " + Rizaldi.getName());
        
    }
}
