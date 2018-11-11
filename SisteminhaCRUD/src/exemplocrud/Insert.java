/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplocrud;

import static exemplocrud.DAO.con;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Il2
 */
public class Insert extends DAO {
/*
    Insert(String nome, String rua, String cidade, String estado, int tel1, int tel2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  */  
    public Insert(String nome, String rua, String cidade, String estado, int telefone1, int telefone2){
        DAO c = new DAO();
            c.Conectar();
            PreparedStatement stm = null;
            try {
                stm = con.prepareStatement("INSERT INTO cad VALUES(?,?,?,?,?,?)");
                stm.setString(1, nome);
                stm.setString(2, rua);
                stm.setString(3, cidade);
                stm.setString(4, estado);
                stm.setInt(5, telefone1);
                stm.setInt(6, telefone2);
                stm.execute();
                stm.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConsultaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    
}
