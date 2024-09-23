package org.example;

public class Cercle extends FormeGeo {
     private double rayon = 2.5;
     double PI= Math.PI;
     public String name;
     public String couleur;

     public Cercle() {}

    public Cercle(String name, double rayon, String couleur ) {
        this.rayon = rayon;
        this.name = name;
        this.couleur = couleur;
    }

    public double getRayon() {
        return rayon;
    }
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    public double getAir() {

        return PI * (rayon * rayon);
    }

    public double getPerimetre() {

        return 2 * PI * rayon;
    }



    public void displayCercle () {
        System.out.println("cercle de rayon: " + this.rayon);
        System.out.println("Air Cercle: " + getAir());
        System.out.println("Perimetre Cercle: " + getPerimetre() + "\n");
    }
}
