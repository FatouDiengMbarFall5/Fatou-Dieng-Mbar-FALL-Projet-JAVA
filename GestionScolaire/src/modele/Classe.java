/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author Fatoo FaLL
 */
public class Classe {
    private int id;
    private static int cpt;
    private String libelle;
    
    
    private Details details;
    private Inscription [] inscriptions;
    
     ///CONSTRUCTEUR///
    public Classe() {
        cpt++;
        id =cpt;
    }
    
   ///GETTERS///
    public int getId() {
        return id;
    }

    public static int getCpt() {
        return cpt;
    }

    public String getLibelle() {
        return libelle;
    }
    
    ///SETTERS///
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
        ///ToString///
    @Override
    public String toString() {
        return "Classe{" + "libelle=" + libelle + '}';
    }
    
    
    
}
