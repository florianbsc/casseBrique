package org.example;

public class Carre {
//  attribut du carré
    private String nomCarre;
    private int nbOfSidesCarre;
    private int longueurCote;
    private String couleurCarre;

    public Carre(String nomCarre,  int longueurCote, String couleurCarre) {
        this.nomCarre = nomCarre;
        this.nbOfSidesCarre = 4;
        this.longueurCote = longueurCote;
        this.couleurCarre = couleurCarre;
    }
    public String getNomCarre() {
        return nomCarre;
    }
    public void setNomCarre(String nomCarre) {
        this.nomCarre = nomCarre;
    }

    public int getNbOfSidesCarre() {
        return nbOfSidesCarre;
    }
    public void setNbOfSidesCarre(int nbOfSidesCarre){
        this.nbOfSidesCarre = nbOfSidesCarre;
    }

    public int getLongueurCote() {
        return longueurCote;
    }
    public void setLongueurCote (int longueurCote) {
        this.longueurCote = longueurCote;
    }

    public String getCouleurCarre() {
        return couleurCarre;
    }

    public void setCouleurCarre(String couleurCarre) {
        this.couleurCarre = couleurCarre;
    }

    public void displayInfoCarre() {
        System.out.println("nom du carre est :" + nomCarre + ", il à " + nbOfSidesCarre + " cotés de " + longueurCote + "cm et est de couleur " + couleurCarre );

    }

}
