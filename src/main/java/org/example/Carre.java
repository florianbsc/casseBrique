package org.example;

public class Carre {
//  attribut du carré
    private String nom;
    private int nbOfSides;
    private int longueurCote;
    private String couleur;

    public Carre(String nom,  int longueurCote, String couleur) {
        this.nom = nom;
        this.nbOfSides = 4;
        this.longueurCote = longueurCote;
        this.couleur = couleur;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbOfSides() {
        return nbOfSides;
    }

    public void setNbOfSides(int nbOfSides){
        this.nbOfSides = nbOfSides;
    }

    public int getLongueurCote() {
        return longueurCote;
    }

    public void setLongueurCote (int longueurCote) {
        this.longueurCote = longueurCote;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public double getPerimetre() {
        return longueurCote*4;
    }
    public double getArea() {
        return longueurCote*longueurCote;
    }

    public void displayCarre() {
        System.out.println("Nom :" + nom + ", Nb coté : " + nbOfSides + " Longueur Coté : " + longueurCote + "cm, Couleur : " + couleur );
        System.out.println("le perimetre : " + getPerimetre() + " cm et l'air : " + getArea() + " cm2"+ "\n");

    }

}
