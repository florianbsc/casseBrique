package org.example;

public class Cercle {
    private String nom;
    private String couleur;
    private double rayon;
    public double PI = 3.14159265358979323846;

    public Cercle(String nom, String couleur, double rayon) {
        this.nom = nom;
        this.couleur = couleur;
        this.rayon = rayon;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getCouleur() {
        return couleur;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public double getRayon() {

        return rayon;
    }

    public void setRayon(int rayon) {

        this.rayon = rayon;
    }

    public double getAirCercle(double rayon, double PI) {

        return PI * (rayon * rayon);
    }

    public double getPerimetreCercle(double rayon, double PI) {

        return 2 * PI * rayon;
    }

    public double getPI() {
        return PI;
    }

    public void displayCercle() {
        System.out.println("nom : "+this.nom + " de couleur : "+this.couleur + "de rayon : " + this.rayon + " cm");
        System.out.println("Air Cercle: " + (String.format("%.3f", this.getAirCercle(this.rayon, PI))) + " cm2");
        System.out.println("Perimetre Cercle: " + (String.format("%.3f", this.getPerimetreCercle(this.rayon, PI))) + " cm" + "\n");
    }
}
