package org.example;

public class Triangle  {

   // attibus du triangle = composant
    private int nbCote;
    private String color;
    private String name;
    private double longCote;
//    private  int angleA;
//    private  int angleB;
//    private  int angleC;

    public Triangle(String name, String color, double longCote) {
        this.nbCote = 3;
        this.color = color;
        this.name = name;
        this.longCote =longCote;
//        this.angleA = angleA;
//        this.angleB = angleB;
//        this.angleC = angleC;

    }


    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPerimetre () {
        return 3 * longCote;
    }
    public double getArea() {
        return ((Math.sqrt(3)/4)*longCote);
    }

    //la methode pour afficher les infos
    public void displayTriangle() {
        System.out.println("Nom : " +name + " nombre de  cotés: " + nbCote + ", de couleur: " + color  );
        System.out.println("Perimetre: " + getPerimetre() + " cm, Air : " + getArea() +" cm2" +  "\n");
    }

}

