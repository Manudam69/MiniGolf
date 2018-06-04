/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minigolf;


/**
 *
 * @author MD
 */
public class MiniGolf extends Thread implements Runnable{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JGraficos ventana = new JGraficos();
                ventana.setVisible(true);
                ventana.Hoyo1();      
            }
        });
    }
    
}
