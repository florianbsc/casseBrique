package org.example;

import java.awt.*;

public abstract class FormeGeo {
    protected Color couleur;
    protected String name; // attribut commun a toutes les formes
//    protected double sideLongueur;  // enlever car Cercle n'herite pas de cette attribut

    public FormeGeo(String name, Color couleur) {
        this.name = name;
        this.couleur = couleur;
    }

    public abstract double calculePerimetre() ;
    public abstract double calculeAire() ;

//    public String getName() {
//        return name;
//    }
    public Color getCouleur() {
        return couleur;
    }

    public abstract void displayForme() ;

}

