package org.example;

public abstract class FormeGeo {

    public FormeGeo() {}

    protected String name;
    public abstract double calculePerimetre() ;
    public abstract double calculeAire() ;

    public void displayForme() {}

    public String getName() {
        return name;
    }

}

