package servlets.exercici06.beans;

import java.io.Serializable;

/**
 *
 * 220216
 * @author becari
 */
public class Persona implements Serializable {
    
    private String nom;
    private int numFills;
    private boolean casat;

    
    
    public Persona() { }

    public Persona(String nom, int numFills, boolean casat) {
        this.nom = nom;
        this.numFills = numFills;
        this.casat = casat;
    }

    public String getNom() {
        return nom;
    }

    public int getNumFills() {
        return numFills;
    }

    public boolean isCasat() {
        return casat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumFills(int numFills) {
        this.numFills = numFills;
    }

    public void setCasat(boolean casat) {
        this.casat = casat;
    }
    
}
