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
class Details {
    private int anescolaire;
    
    private Classe[] classes;
    private Professeur [] professeurs;
    
    public Details(){
    }
    
    ///GETTERS///
    public int getAnescolaire() {
        return anescolaire;
    }
    ///SETTERS///

    public void setAnescolaire(int anescolaire) {
        this.anescolaire = anescolaire;
    }

    
}
