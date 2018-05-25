/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minigolf;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jafet
 */
public class Graficos {
    JPanel panel;
    JLabel label;
    JFrame frame;
    FlowLayout lay;
    
    public void Crea(){
        lay= new FlowLayout();
       
        panel = new JPanel(new BorderLayout());
        JPanel panel2 = new JPanel(new GridLayout());
        
        label = new JLabel("Mensaje");
        
       panel2.add(label, "Couth");
       panel.add(panel2, "South");
       
        frame = new JFrame("Ventana");
       frame.add(panel);
      frame.setBounds(200,200, 500, 500);
     frame.setVisible(true);
        
    }
    
    
    
}
