/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.Date;

import modele.Classe;
import modele.Etudiant;
import modele.Inscription;
import modele.Personne;
import modele.Professeur;

/**
 *
 * @author Fatoo FaLL
 */
public class ServicesListesDetails implements IGeneral{
    
     ArrayList<Personne> bd = new ArrayList<Personne>();
     public ServicesListesDetails(){
       
     }
     
        
    ///ListerProfesseur///
 public static final ArrayList<Professeur> ListerProfesseur = new ArrayList<Professeur>();
  public boolean creerPersonne(Professeur p){
      ListerProfesseur.add(p);
              return true;
  }
  public ArrayList<Professeur> ListerProf(){
      return ListerProfesseur;
  }
  
  
   ///ListerEtudiant///
  public static final ArrayList<Etudiant> ListerEtudiant= new ArrayList<Etudiant>();
  public boolean creerPersonne(Etudiant p){
      ListerEtudiant.add(p);
              return true;
  }
  
  public ArrayList<Etudiant> ListerEtudiant(){
      return ListerEtudiant;
  }
  
  
   ///ListerClasse///
  public static final ArrayList<Classe> ListerClasse= new ArrayList<Classe>();
  public boolean creerPersonne(Classe p){
      ListerClasse.add(p);
              return true;
  }
  public ArrayList<Classe> ListerClasse(){
      return ListerClasse;
}

  ///ListerInscription///
  public static final ArrayList<Inscription> ListerInscription= new ArrayList<Inscription>();
  public boolean creerPersonne(Inscription p){
      ListerInscription.add(p);
              return true;
  }
  public boolean ListerInscription(){
      return true;
  }
  
  
    public boolean CreerPersonne(Personne p) {
         bd.add(p);
        return true;
    }

    public ArrayList<Personne> listerPersonne() {
          return bd;
    }

    public ArrayList<Etudiant> listerEtudiant() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Inscrire() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean AddEtudiant(Etudiant et) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Etudiant rechercherEtudiant(String numeroEtudiant) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean AddClasse(Classe c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean AddProfesseur(Professeur prof) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean AffecterClasseProfesseur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Professeur rechercherProfesseur(String numeroProfesseur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Professeur> ListerProfesseur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean AddInscription(Inscription ins) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Classe rechercherClassebyLibelle(String libelle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
