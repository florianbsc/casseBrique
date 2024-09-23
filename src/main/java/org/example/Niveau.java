package org.example;
import java.util.ArrayList;

public class Niveau {
    private ArrayList<FormeGeo> formeGeos = new ArrayList<>();

    public Niveau() {}

    public ArrayList<FormeGeo> getFormeGeos() {
        return formeGeos;
    }

    //    CRUD ??

    public void setFormeGeos(ArrayList<FormeGeo> formeGeos) {
        this.formeGeos = formeGeos;
    }
    
    public void addFormeGeo(FormeGeo formeGeo) {
        formeGeos.add(formeGeo);
        
    }
    public void editFormeGeo (FormeGeo formeGeo) {
        int index = formeGeos.indexOf(formeGeo);
    } 
    
    public void removeFormeGeo (FormeGeo formeGeo) {
        formeGeos.remove(formeGeo);
    }
    public double allAire( FormeGeo getAir) {
        double  totalAire = 0;
        return totalAire;
    }
    
    public double allPermietre (FormeGeo getPermietre) {
        double  totalPermietre = 0;
        return totalPermietre;
    }
}
