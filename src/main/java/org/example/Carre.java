package org.example;

public class Carre {
    //  attribut du carré
    private String nomCarre;
    private String couleurCarre;
    private int nbCote;
    private int longueurCote;

    public Carre(String nomCarre, int longueurCote, String couleurCarre) {
        this.nomCarre = nomCarre;
        this.couleurCarre = couleurCarre;
        this.nbCote = 4;
        this.longueurCote = longueurCote;
    }

    public String getNomCarre() {

        return nomCarre;
    }

    public void setNomCarre(String nomCarre) {

        this.nomCarre = nomCarre;
    }

    public String getCouleurCarre() {
        return couleurCarre;
    }
    public void setCouleurCarre(String couleurCarre) {
        this.couleurCarre = couleurCarre;
    }

    public int getNbCote() {
        return nbCote;
    }
    public void setNbCote(int nbCote) {
        this.nbCote = nbCote;
    }

    public int getLongueurCote() {
        return longueurCote;
    }
    public void setLongueurCote(int longueurCote) {
        this.longueurCote = longueurCote;
    }

    public int getAirCarre() {
        return longueurCote * longueurCote;
    }

    public int getPerimetreCarre() {
        return 4 * longueurCote;
    }


    public void displayInfoCarre() {
        System.out.println("nom :" + nomCarre +
                ", il à " + nbCote + " cotés de " + longueurCote +
                "cm et est de couleur " + couleurCarre);
        System.out.println("Le perimetre est de : " + this.getPerimetreCarre() + " cm et d'air de : " + getAirCarre() + "cm2" + "\n");

    }

}
