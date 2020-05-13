/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import application.Connecter;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import modele.Etudiant;
import services.ServicesListesDetails;

/**
 * FXML Controller class
 *
 * @author Fatoo FaLL
 */
public class InscrireEtudiantController implements Initializable {

    
    Connecter con=new Connecter();
    PreparedStatement pstm;
    ResultSet Rs;
    DaoTable model=new DaoTable ();
    
    @FXML
    private ComboBox<String> cboClasse;
    private ComboBox<String> cboAnneeScol;
    private ComboBox<String> cboClass;
    @FXML
    private ComboBox<String> cboAnnee;
    private TextField txtNumero;
    private TextField txtNom;
    private TextField txtPrenom;
    private TextField txtDatenaiss;
    @FXML
    private Button btnInscrireEtudiant;
    
    private ServicesListesDetails service;
     private Etudiant et;
    @FXML
    private TextField txtNumeroEtudiant;
    @FXML
    private TextField txtNomEtudiant;
    @FXML
    private TextField txtPrenomEtudiant;
    @FXML
    private TextField txtNomEtudiant1;
    @FXML
    private ComboBox<?> cboClasseEtudiant;
    @FXML
    private ComboBox<?> cboAnneeScolaireEtudiant;
    @FXML
    private Button btnOkEtudiant;
    @FXML
    private TableView<?> tblcTableView;
    @FXML
    private TableColumn<?, ?> tblcNomEtudiant;
    @FXML
    private TableColumn<?, ?> tblcPrenomEtudiant;
    @FXML
    private TableColumn<?, ?> tblcClasseEtudiant;
    @FXML
    private TableColumn<?, ?> tblcAnneeScolaireEtudiant;
        


 
   
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
      cboClasse.getItems().add("LIAGE");
      cboClasse.getItems().add("MAE");
      cboClasse.getItems().add("TTL");
      cboClasse.getItems().add("GLRS");
        
        cboClass.getItems().add("LIAGE");
        cboClass.getItems().add("MAE");
        cboClass.getItems().add("TTL");
        cboClass.getItems().add("GLRS");
        
        cboAnneeScol.getItems().add("2017/2018");
        cboAnneeScol.getItems().add("2018/2019");
        cboAnneeScol.getItems().add("2019/2020");
        
        
        cboAnnee.getItems().add("2018");
        cboAnnee.getItems().add("2019");
        cboAnnee.getItems().add("2020");
        
        service = new ServicesListesDetails ();
        ArrayList<Etudiant> comptes = service.listerEtudiant();
  
      
        
        }    
    private void handleActiveClasse(ActionEvent event){
    
    System.out.println("test");
    
    } 

        private void afficher() {
        try {
               
model.setRowCount(0);    

ResultSet Rs=pstm.executeQuery("Select * from info");
while(Rs.next()){
model.addRow(new Object[]{Rs.getString("Nom"),Rs.getString("Prenom"),Rs.getString("Datenaiss"),
   Rs.getString("Numero")});

}
}catch(Exception e){System.err.println(e);}


    }
    
    private void handleInscrireEtudiant(ActionEvent event) {
        String nom=txtNom.getText();
        String prenom=txtPrenom.getText();     
        String DateNaiss=txtDatenaiss.getText();
          String numero=txtNumero.getText();
                String requete="insert into info (Nom,Prenom,Datenaiss,Numero)VALUES('"+
                nom+"','"+prenom+"','"+ DateNaiss+"','"+numero+"')";    
         try {           

JOptionPane.showMessageDialog(null,"l'etudiant est bien ajouter");
txtNom.setText("");
txtPrenom.setText("");
txtDatenaiss.setText("");
txtNumero.setText("");
afficher();

        
        }catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
        
    }

    @FXML
    private void handleButtonInscrire(ActionEvent event) {
    }

    @FXML
    private void onSearchByAnneeClss(ActionEvent event) {
    }

    
    



    private static class stm {
        

        public stm() {
        }
    }

    private static class DaoTable {

        public DaoTable() {
        }

        private void setRowCount(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void addRow(Object[] object) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
