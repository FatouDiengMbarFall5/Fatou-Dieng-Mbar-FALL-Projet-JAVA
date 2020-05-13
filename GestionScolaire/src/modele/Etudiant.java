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
public class Etudiant extends Personne{
    private int id;
    private String tuteur;
    
    ///OneToMany///
    private Inscription [] inscriptions;

     ///CONSTRUCTEUR///
    public Etudiant() {
        super();
        this.attributeNumero("ET");
    }

    ///GETTERS///
    public String getTuteur() {
        return tuteur;
    }

    ///SETTERS///
    public void setTuteur(String tuteur) {
        this.tuteur = tuteur;
    }
    
    ///ToString///
    @Override
    public String toString() {
        return super.toString()+ "tuteur=" + tuteur + '}';
    }
    
    public void setdateNaissance(int i){
        throw new UnsupportedOperationException("No Supported yet.");//To change body of generated methods, choose Tools | Templates.
    }

     
    public void setdateNaissance(String String){
        throw new UnsupportedOperationException("No Supported yet.");//To change body of generated methods, choose Tools | Templates.
    }

    
}
