package org.example;

public class Cercle {
    private int rayon;
    private double airCercle;
    private double perimetreCercle;
    private double PI;

    public Cercle(int rayon ) {
        this.rayon = rayon;
//        this.airCercle = airCercle;
//        this.perimetreCercle = perimetreCercle;
        this.PI = 3.1415;
    }

    public int getRayon() {
        return rayon;
    }
    public void setRayon(int rayon) {
        this.rayon = rayon;
    }
    public double getAirCercle(int rayon, double PI) {
        airCercle = PI * (rayon * rayon);
        return airCercle;
    }
    public void setAirCercle(int airCercle) {
        this.airCercle = airCercle;
    }
    public double getPerimetreCercle(int rayon, double PI) {
        perimetreCercle = 2 * PI * rayon;

        return perimetreCercle;
    }
    public void setPerimetreCercle(int perimetreCercle) {
        this.perimetreCercle = perimetreCercle;
    }
    public double getPI() {
        return PI;
    }

    public void displayCercle () {
        System.out.println("cercle de rayon: " + this.rayon);
        System.out.println("Air Cercle: " + this.airCercle);
        System.out.println("Perimetre Cercle: " + this.perimetreCercle);
    }
}
