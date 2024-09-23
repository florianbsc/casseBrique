package org.example;

public class Main {
    public static void main(String[] args) {


        Triangle triangle1 = new Triangle("Tri 1", "bleu", 4);
        Triangle triangle2 = new Triangle("Tri 2", "rouge", 3.2);
        Carre carre1 = new Carre("Carre 1", 5, "vert");
        Carre carre2 = new Carre("Carre 2", 4, "vert-jaune");
        Cercle cercle1 = new Cercle("Cercle 1", 5, "jaune");
        Cercle cercle2 = new Cercle("Cercle 2", 4, "orange");

        triangle1.displayTriangle();
        triangle2.displayTriangle();
        carre1.displayCarre();
        carre2.displayCarre();
        cercle1.displayCercle();
        cercle2.displayCercle();
    }
}