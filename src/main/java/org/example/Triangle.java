package org.example;

import java.awt.*;

public class Triangle extends Frame {

   // attibus du triangle = composant

    private String name;
    private double longCote;

    public Triangle() {}

    public  Triangle  (String name, double longCote) {
        this.name = name;
        this.longCote =longCote;
    }
    public String getName() {
        return name;
    }

        public double calculePerimetre () {
        return 3 * longCote;
    }
    public double calculeAire() {
        return ((Math.sqrt(3)/4)*longCote);
    }

    //la methode pour afficher les infos
    public void displayForme() {
        System.out.println("Nom : " +name + " longuere de  cotés: " + longCote + " cm");
        System.out.println("Perimetre: " + calculePerimetre() + " cm, Air : " + calculeAire() +" cm2" +  "\n");
    }

}

