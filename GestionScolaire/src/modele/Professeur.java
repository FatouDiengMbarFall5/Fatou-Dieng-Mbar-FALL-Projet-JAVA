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
public class Professeur extends Personne {
    private int id;
    private String grade;
    
    private Details details; 
    
     ///CONSTRUCTEUR///
    public Professeur(){
        super();
        this.attributeNumero("prof");
    }
    
    ///GETTERS///
    public String getGrade() {
        return grade;
    }
    
    
    ///SETTERS///
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
  
    ///ToString///
    @Override
    public String toString() {
        return super.toString() + "grade=" + grade + '}';
    }
    
    public void setdateNaissance (String String){
        throw new UnsupportedOperationException("No Supported yet.");//To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
