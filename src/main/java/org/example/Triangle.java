package org.example;

import java.awt.*;

public class Triangle extends FormeGeo {

   // attibus du triangle = composant

    public Triangle() {}

    public  Triangle  (double sideLongueur) {
        this.name = "Triangle";
        this.sideLongueur =sideLongueur;
    }
    public String getName() {
        return name;
    }

    public double getSideLongueur() {
        return sideLongueur;
    }

    public double calculePerimetre () {
        return 3 * sideLongueur;
    }

    public double calculeAire() {
        return ((Math.sqrt(3)/4)*sideLongueur);
    }

    //la methode pour afficher les infos
    public void displayForme() {
        System.out.println("Nom : " +name + " longuere de  cotés: " + sideLongueur + " cm");
        System.out.println("Perimetre: " + calculePerimetre() + " cm, Air : " + calculeAire() +" cm2" +  "\n");
    }

}

