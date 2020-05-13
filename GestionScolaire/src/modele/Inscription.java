/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.Date;

/**
 *
 * @author Fatoo FaLL
 */
public class Inscription extends Personne{
    private Date date;
    private int anescolaire;
    
    private Classe classe;
    private Etudiant etudiant;
    
    public Inscription(){
    }
    
    ///GETTERS///
    public Date getDate() {
        return date;
    }

    public int getAnescolaire() {
        return anescolaire;
    }
    
    ///SETTERS///
    public void setDate(Date date) {
        this.date = date;
    }

    public void setAnescolaire(int anescolaire) {
        this.anescolaire = anescolaire;
    }
    
}
