package org.example;

//class Side {
//    private double longueur;
//
//    public Side (double longueurCote) {
//        this.longueur = longueur;
//    }
//
//    public double getLongueur() {
//    return longueur;
//}
//
//    public void setLongueur (double longueur) {
//    this.longueur = longueur;
//}
//
//}

public class Carre extends FormeGeo{
//  attribut du carré
    private String name;
    private double sideLongueur;

//    private Side side; // Un carré est composé d'un seul côté (longueur du côté identique pour tous)



    public Carre(String nom,  double sideLongueur) {
        this.name = "carre";
        this.sideLongueur = sideLongueur;
//        this.side = new Side(sideLongueur); // Composition : Un carré contient un côté
    }

    public String getName() {
        return name;
    }
    public void setNom(String nom) {
        this.name = name;
    }


    public double calculePerimetre() {
//        double longueur = side.getLongueur(); // Récupérer la longueur du côté
        double longueur = sideLongueur; // Récupérer la longueur du côté

        return longueur*4;
    }

    // Méthode pour calculer l'aire du carré
    public double calculeAire() {
        return Math.pow(2, sideLongueur); // Aire = côté * côté
    }

    public void displayForme() {
        System.out.println("Nom :" + name  + ", Longueur Coté : " + sideLongueur );
        System.out.println("le perimetre : " + calculePerimetre() + " cm et l'air : " + calculeAire() + " cm2"+ "\n");

    }

}
