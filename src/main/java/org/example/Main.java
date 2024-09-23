package org.example;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        FormeGeo car1 = new Carre("Car 2",5);
        FormeGeo triangle1 = new Triangle(4.5);
        FormeGeo cercle1 = new Cercle("Cercle 1", 5);

        triangle1.displayForme();
        car1.displayForme();
        cercle1.displayForme();
    }
}