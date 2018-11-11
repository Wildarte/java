package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class Conexao {
 
    public Conexao () {    } //Possibilita instancias
    public static Connection con = null;

    public static void Conectar() {
        System.out.println("Conectando ao banco...");
        try {
          Class.forName("com.mysql.jdbc.Driver");
          con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
          System.out.println("Conectado.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");
          Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
          } catch(SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }

    }
 
}