package org.example;

public abstract class FormeGeo {

    public FormeGeo() {}

    protected String name;
    protected double sideLongueur;

    public abstract double calculePerimetre() ;
    public abstract double calculeAire() ;

   public double getSideLongueur() {
       return sideLongueur;
   }

    public String getName() {
        return name;
    }
    public void displayForme() {}

}

