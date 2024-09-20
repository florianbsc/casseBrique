package org.example;

public class Triangle  {

   // attibus du triangle = composant
    private int nbOfSidesTriange;
    private String color;
    private String name;
    private  int angleA;
    private  int angleB;
    private  int angleC;

    public Triangle(String color, String name) {
        this.nbOfSidesTriange = 3;
        this.color = color;
        this.name = name;
        this.angleA = angleA;
        this.angleB = angleB;
        this.angleC = angleC;

    }

    // recupere les caracteristique de nbOfSide et les renvoient a la methode displayInfo
//    Un getter est une méthode qui permet de récupérer la valeur d'un attribut privé d'une classe.
//    Cela permet de rendre un attribut accessible en lecture, tout en le gardant protégé
    public int getNbOfSides() {
        return nbOfSidesTriange;
    }
    // recupere la valeur de nbOfSide pour les afficher dans la console
//    public void setNbOfSides(int nbOfSides) {
//        this.nbOfSides = nbOfSides;
//    }

    public String getColor() {
        return color;
    }
//    public void setColor(String color) {
//        this.color = color;
//    }

    public String getName() {
        return name;
    }
//    public void setName(String name) {
//        this.name = name;
//    }


    //la methode pour afficher les infos
    public void displayInfo() {
        System.out.println("Nombre de  cotés: " + nbOfSidesTriange + ", de couleur: " + color + ", de nom: " + name);
    }

}

