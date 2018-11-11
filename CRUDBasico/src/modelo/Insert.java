/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Il2
 */
public class Insert extends Conexao{
    
    public void inserir(String nome){
         try {
             String ins = "INSERT INTO alu(nome) value(?)";
             
             Connection conn = null;
             
             PreparedStatement stm = conn.prepareStatement(ins);
                 stm.setString(1,nome);
                 stm.executeUpdate();
             
             Component rootPane = null;
            JOptionPane.showMessageDialog(rootPane, "Aluno inserido");
        } catch (SQLException e) {
             Component rootPane = null;
            JOptionPane.showMessageDialog(rootPane, e);
        }//Fim try
    }
    
}
