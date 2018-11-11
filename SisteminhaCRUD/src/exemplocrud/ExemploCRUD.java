/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplocrud;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JRootPane;

/**
 *
 * @author Il2
 */
public class ExemploCRUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Client c = new Client();
        c.setVisible(true);
        c.setExtendedState(JFrame.MAXIMIZED_BOTH);
        /*
        P telaPrincipal = new P();
        telaPrincipal.setVisible(true);
        telaPrincipal.setTitle("Sistema principal");
        
        telaPrincipal.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        telaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        telaPrincipal.setResizable(false);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        d.setSize(d.getWidth(), d.getHeight());
        telaPrincipal.setMinimumSize(d);
        */
    }
    
}
