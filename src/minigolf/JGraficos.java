/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minigolf;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Window;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author Jafet
 */
public class JGraficos extends JFrame{
     
     private class Campos extends JPanel{
         private final String nombre;
         @Override
        public void paint(Graphics g){
            ImageIcon Img = new ImageIcon(getClass().getResource("/Imagenes/"+nombre+".jpg"));
            g.drawImage(Img.getImage(),0,0,405,720,null);
            setOpaque(false);
            super.paintComponent(g);
        }       
        public Campos(String nombre) {
            this.nombre = nombre;
            this.setSize(405,720);
            
        }
    }
    public JGraficos() {
        try{  
            initComponents();          
        }catch(Exception e){
            System.out.println("ALGO SALIO MAL  ");
        }
    }
    
    private void cargaImagen(String nombre){
        Campos img = new Campos(nombre);
            Panel1.add(img);
            Panel1.repaint();
    }
    
    private void cargaPelota(int x,int y){
        Pelota pelota = new Pelota();
        pelota.run();
        pelota.setX(x);
        pelota.setY(y);
        Jpelota.add(pelota);
        Jpelota.repaint();
        
        
    }
    
    public void Hoyo1(){
        cargaImagen("Hoyo1");
        cargaPelota(192,668); //x,y x = el centro, y = en la parte baja de la pantalla
            
            
    }
    public void Hoyo2(){
        cargaImagen("Hoyo2");
            
    }
    public void Hoyo3(){
        cargaImagen("Hoyo3");
            
    }
    public void Hoyo4(){
        cargaImagen("Hoyo4");
            
    }
    public void Hoyo5(){
        cargaImagen("Hoyo5");
            
            
    }
    public void Hoyo6(){
        cargaImagen("Hoyo6");
            
    }
    public void Hoyo7(){
        cargaImagen("Hoyo7");
            
    }
    public void Hoyo8(){
        cargaImagen("Hoyo8");
            
    }
    public void Hoyo9(){
        cargaImagen("Hoyo9");
            
    }
    public void Hoyo10(){
        cargaImagen("Hoyo10");
            
    }
    public void Hoyo11(){
        cargaImagen("Hoyo11");
            
    }
    public void Hoyo12(){
        cargaImagen("Hoyo12");
            
    }
    public void Hoyo13(){
        cargaImagen("Hoyo13");
            
    }
    public void Hoyo14(){
        cargaImagen("Hoyo14");
            
    }
    public void Hoyo15(){
        cargaImagen("Hoyo15");
            
    }
    public void Hoyo16(){
        cargaImagen("Hoyo16");
            
    }
    public void Hoyo17(){
        cargaImagen("Hoyo17");
            
    }
    public void Hoyo18(){
        cargaImagen("Hoyo18");
        
    }  
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        Jpelota = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MiniGolf");

        Panel1.setPreferredSize(new java.awt.Dimension(405, 720));

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpelota, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpelota, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JGraficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JGraficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JGraficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JGraficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JGraficos().setVisible(true);   
            }        
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jpelota;
    private javax.swing.JPanel Panel1;
    // End of variables declaration//GEN-END:variables
}
