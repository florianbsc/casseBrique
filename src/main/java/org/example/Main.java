package org.example;

public class Main {
    public static void main(String[] args) {
        // creation triangle
        Triangle tri1 = new Triangle("tri1", "vert", 3, 2);
        Carre car1 = new Carre("Car 1", 4, "orange");
        Cercle cer1 = new Cercle("Cer 1", "bleu", 2.80);
//        // Créer un carré
//        Carre carre = new Carre("Carré1", 5, "Bleu");
//
////        creation cercle
//        Cercle cercle1 = new Cercle("Cercle 1", "noir" , 4);
//
////        affichage
        tri1.displayInfo();
        car1.displayInfoCarre();

        cer1.displayCercle();

    }
}