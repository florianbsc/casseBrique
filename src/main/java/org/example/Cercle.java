package org.example;

public class Cercle {
     private double rayon = 2.5;
     double PI= Math.PI;
     public String name;
     public String couleur;

    public Cercle(int rayon, String name, String couleur ) {
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
    public double getAir(double rayon, double PI) {

        return PI * (rayon * rayon);
    }

    public double getPerimetre(int rayon, double PI) {

        return 2 * PI * rayon;
    }



    public void display () {
        System.out.println("cercle de rayon: " + this.rayon);
        System.out.println("Air Cercle: " + this.getAir());
        System.out.println("Perimetre Cercle: " + this.getPerimetre());
    }
}
