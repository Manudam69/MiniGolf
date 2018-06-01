/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minigolf;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author MD
 */
public class Pelota extends JLabel implements ActionListener, KeyListener{
    
    /*public class Movimiento implements Runnable{
        final Pelota pu;
        public Movimiento(Pelota pu){
            this.pu = pu;
        }
        
        @Override
        public void run(){
            do {
                try{
                    Thread.sleep(1000);        
                }catch(InterruptedException e){ e.printStackTrace();}
                SwingUtilities.invokeLater(()->{this.pu.mover();});
            } while (true); 
        } 
    }*/
    private int x=192,y=668;

    public Pelota() {
        this.setSize(405,720);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }
    
    public void mover(){
        this.setLocation(this.getX(),this.getY());
    }
    
    @Override
    public void paint(Graphics g){
        //ImageIcon Img = new ImageIcon(getClass().getResource("/minigolf/pelota.png"));
        g.setColor(Color.white);
        g.fillOval(x,y,20,20);
        g.setColor(Color.black);
        g.drawOval(x,y,20,20);
        //g.drawImage(Img.getImage(),x,y, 28, 28,null);
    }

    @Override
    public void actionPerformed(ActionEvent ke) {
        y--;
    }

    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent ke) {
        
        
        if(ke.getKeyCode() == KeyEvent.VK_UP)   y-=5;
        if(ke.getKeyCode() == KeyEvent.VK_DOWN) y+=5;
        if(ke.getKeyCode() == KeyEvent.VK_LEFT) x-=5;
        if(ke.getKeyCode() == KeyEvent.VK_RIGHT)x+=5;
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent ke) {}
}
