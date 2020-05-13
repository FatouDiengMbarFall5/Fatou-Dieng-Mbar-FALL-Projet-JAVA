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
public abstract class Personne {
    private int id;
    protected static int cpt;
    protected String nom;
    protected String prenom;
    protected Date dateNaissance;
    protected String numero;
    
    ///CONSTRUCTEUR///
  public Personne(){
      cpt++;
      id=cpt;
  }
  
  ///GETTERS///
    public int getId() {
        return id;
    }

    public static int getCpt() {
        return cpt;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getNumero() {
        return numero;
    }
    
    ///SETTERS///
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    
    ///ToString///
    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + '}';
    }

   
  protected void attributeNumero(String debut){
      String id =Integer.toString(this.getId());
      numero = debut + "0" + id;
  }
    
}
