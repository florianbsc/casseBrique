package org.example;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Carre Car1 = new Carre("Car 2",5);
        Triangle triangle1 = new Triangle("Tri 1", 4);
        Cercle cercle1 = new Cercle("Cercle 1", 5);

        triangle1.displayForme();
        Car1.displayForme();
        cercle1.displayForme();
    }
}