/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;

import modele.Classe;
import modele.Etudiant;
import modele.Inscription;

import modele.Professeur;

/**
 *
 * @author Fatoo FaLL
 */
public interface IGeneral {
 public boolean Inscrire();
 public boolean AddEtudiant(Etudiant et);
 public ArrayList<Etudiant> ListerEtudiant();
 public Etudiant rechercherEtudiant (String numeroEtudiant);
 
 public boolean AddClasse (Classe c);
 public ArrayList<Classe> ListerClasse();
 public Classe rechercherClassebyLibelle (String libelle);
 public boolean AddProfesseur (Professeur prof);
 public boolean AffecterClasseProfesseur();
 public Professeur rechercherProfesseur(String numeroProfesseur);
 public ArrayList<Professeur> ListerProfesseur();
 public boolean AddInscription (Inscription ins);
 
}
