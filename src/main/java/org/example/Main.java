package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        for (Gezegen gezegen : Gezegen.values()){
            System.out.println ("Gezegen Adı " + gezegen + " Sıra No " + gezegen.getGuneseGoreNo() +
               " Uzaklık " + gezegen.getUzaklık() + " Yarı Çapı " + gezegen.getYarıCap() + " Dönme Süresi " + gezegen.getDonmeSuresi()  );
        }

    }
}