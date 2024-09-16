package org.example;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle("bleu", "triangle 1");
        Triangle triangle2 = new Triangle("rouge", "triangle 2");
        Carre carre1 = new Carre("Carre 1", 5, "jaune");
        Cercle cercle1 = new Cercle(4);

        triangle1.displayInfo();
        carre1.displayInfoCarre();
        cercle1.displayCercle();
    }
}