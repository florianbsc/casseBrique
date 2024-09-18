package org.example;

import java.awt.*;

// class un Objet créé
public class Triangle {

    // Attributs du triangle
    private String color;
    private String name;
    private int longueurCote = 2;
    private int nbCote;

//    private int base;
//    private int hauteur;

    // Constructeur
    public Triangle(String name, String color, int nbCote, int longueurCote) {
        this.name = name;
        this.color = color;
        this.nbCote = nbCote;
        this.longueurCote = longueurCote;
    }

    // Getters recuper les info

    public String getColor() {
        return color;
    }

    //    Setters renvoi une info ou acction
    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLongueurCote() {
        return longueurCote;
    }

    public int getNbCote() {
        return nbCote;
    }
    public void setNbCote(int nbCote) {
        this.nbCote = nbCote;
    }

    public void setLongueurCote(int longueurCote) {
        this.longueurCote = longueurCote;
    }

    public double getPerimeter() {
        return longueurCote * 3;
    }

    public double getAire() {
        return (Math.sqrt(3) / 4) * (longueurCote * longueurCote);
    }

    // Méthode = fonction ou action
    //    methode d'affichage
    public void displayInfo() {
//        instruction de la methode
        System.out.println("\n" + "Nom: " + name + ", Couleur: " + color + ", permiètre : " + getPerimeter() + " cm, aire: " + (String.format("%.3f", getAire())) + " cm2 \n");
    }
}
