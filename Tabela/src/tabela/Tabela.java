/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabela;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Il2
 */
public class Tabela extends JFrame{

    JTable tabela;
    JScrollPane barraRolagem;
    JPanel panel;
    
     String[] colunas = {"Nome", "Telefone", "E-mail"};
    Object [][] dados = {
        {"Ana", "3224223", "ana@email.com",},
        {"Paulo", "989787", "paulo@email.com"},
        {"Pedro", "87887343", "pedro@email.com"}
    };
    
    public void Janela(){
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(1,1));
        tabela = new JTable(dados, colunas);
        barraRolagem = new JScrollPane(tabela);
        panel.add(barraRolagem);
        
        getContentPane().add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 120);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
       
        
      Tabela t = new Tabela();
      t.Janela();
        
    }
    
}
