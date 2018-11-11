package exemplocrud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class DAO{
 
    public DAO() {    } //Possibilita instancias
    public static Connection con = null;

    public Connection Conectar() {
        System.out.println("Conectando ao banco...");
        try {
          Class.forName("com.mysql.jdbc.Driver");
          con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
          System.out.println("Conectado.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");
          Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
          } catch(SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
        return con;
    }
    
    public void insere() throws SQLException{
        Conectar();
        
        PreparedStatement stm = con.prepareStatement("INSERT INTO alu VALUE(?)");
        stm.setString(1, "Teste");
        stm.execute();
        stm.close();
        con.close();
    }
 
}