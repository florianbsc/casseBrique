package org.example;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {


        // Créer un niveau
        Niveau niveau1 = new Niveau();
        Niveau niveau2 = new Niveau();

        // Créer un carré, un triangle et un cercle
        FormeGeo carre1 = new Carre(4);    // Carré avec un côté de 4 unités
        FormeGeo triangle1 = new Triangle(4.5); // Triangle avec un côté de 4.5 unités
        FormeGeo cercle1 = new Cercle(5);  // Cercle avec un rayon de 5 unités
        FormeGeo carre2 = new Carre(6);

        // Ajouter les formes au niveau
        niveau1.addForme(carre1);
        niveau1.addForme(triangle1);
        niveau1.addForme(triangle1);
        niveau1.addForme(cercle1);

        niveau2.addForme(carre1);
        niveau2.addForme(carre2);

        // Afficher le contenu du niveau
        niveau1.dispayNiveau();
        niveau2.dispayNiveau();
    }
////        creation des instances de formes geo
//        FormeGeo car1 = new Carre( 4);
//        FormeGeo triangle1 = new Triangle(4.5);
//        FormeGeo cercle1 = new Cercle(5);
//
////        creation d'une liste pour stocker les formes
//        List<FormeGeo> niveau = new ArrayList<>();
//        niveau.add(car1);
//        niveau.add(triangle1);
//        niveau.add(cercle1);

//        for (FormeGeo forme : niveau) {
//            forme.displayForme();
//        }


    }
