package jsp.exercici06;

import java.io.Serializable;

/**
 *
 * 220216
 * @author becari
 */
public class Personal implements Serializable {
    
    private int dni;
    private String nom;
    
    public Personal() { }
    
    public Personal(int dni, String nom) {
        this.dni = dni;
        this.nom = nom;
    }
    
    public int getDni() {
        return dni;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
}
