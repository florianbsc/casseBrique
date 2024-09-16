package org.example;

public class Triangle  {

   // attibus du triangle = composant
    private int nbOfSidesTriange;
    private String colorTriangle;
    private String nameTriangle;
    private  int angleTriangleA;
    private  int angleTriangleB;
    private  int angleTriangleC;

    public Triangle(String colorTriangle, String nameTriangle) {
        this.nbOfSidesTriange = 3;
        this.colorTriangle = colorTriangle;
        this.nameTriangle = nameTriangle;
        this.angleTriangleA = angleTriangleA;
        this.angleTriangleB = angleTriangleB;
        this.angleTriangleC = angleTriangleC;

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
        return colorTriangle;
    }
//    public void setColor(String colorTriangle) {
//        this.colorTriangle = colorTriangle;
//    }

    public String getName() {
        return nameTriangle;
    }
//    public void setName(String nameTriangle) {
//        this.nameTriangle = nameTriangle;
//    }


    //la methode pour afficher les infos
    public void displayInfo() {
        System.out.println("Nombre de  cotés: " + nbOfSidesTriange + ", de couleur: " + colorTriangle + ", de nom: " + nameTriangle);
    }

}

