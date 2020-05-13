/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.*;


/**
 *
 * @author Fatoo FaLL
 */
public class ProfesseurDao {
    Connection con;
    public ProfesseurDao(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    }catch(ClassNotFoundException e){
    System.err.println(e);

    }
    try{
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/etudiantdao","root","");
    }catch(SQLException e){System.err.println(e);}
    }
    Connection obtenirconnexion(){return con;}

    
    
    
    
    
}
