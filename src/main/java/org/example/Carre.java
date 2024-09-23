package org.example;

//polymorphisme
class Side {
    private double sideLongueur;

    public Side (double sideLongueur) {
        this.sideLongueur = sideLongueur;
    }

    public double getSideLongueur() {
    return sideLongueur;
}

    public void setSideLongueur (double sideLongueur) {
    this.sideLongueur = sideLongueur;
}

}

public class Carre extends FormeGeo{
//  attribut du carré

//    private double sideLongueur;

    private Side side; // Un carré est composé d'un seul côté (longueur du côté identique pour tous)

    // Constructeur pour initialiser le carré avec un côté
    public Carre(String name,  double sideLongueur) {
        this.name = "carre";
//        this.sideLongueur = sideLongueur;
        this.side = new Side(sideLongueur); // Composition : Un carré contient un côté
    }

//    methode
    public String getName() {
        return name;
    }

    public double getSideLongueur() { return sideLongueur; }


    public void setName(String name) {
        this.name = name;
    }


    public double calculePerimetre() {
        double longueur = side.getSideLongueur(); // Récupérer la longueur du côté
//        double longueur = side; // Récupérer la longueur du côté

        return longueur*4;
    }

    // Méthode pour calculer l'aire du carré
    public double calculeAire() {
        return Math.pow(2, side.getSideLongueur()); // Aire = côté * côté
    }

    public void displayForme() {
        System.out.println("Nom :" + name  + ", Longueur Coté : " + side.getSideLongueur() );
        System.out.println("le perimetre : " + calculePerimetre() + " cm et l'air : " + calculeAire() + " cm2"+ "\n");

    }

}
