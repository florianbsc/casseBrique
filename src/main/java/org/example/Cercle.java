package org.example;

public class Cercle extends FormeGeo {
     private double rayon = 2.5;


     public Cercle() {}

    public Cercle(String name, double rayon) {
        this.rayon = rayon;
        this.name = "Cercle";
    }
    public String getName() {
        return name;
    }
    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double calculeAire() {

        return Math.PI * (rayon * rayon);
    }

    public double calculePerimetre() {

        return 2 * Math.PI * rayon;
    }

    public void displayForme () {
        System.out.println(name + " de rayon: " + this.rayon);
        System.out.println("Air Cercle: " + calculeAire());
        System.out.println("Perimetre Cercle: " + calculePerimetre() + "\n");
    }
}
