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

/**
 *
 * @author MD
 */
public class Pelota extends JLabel implements ActionListener, KeyListener{
    private int x=192,y=668;

    public Pelota() {
        
        this.setSize(405,720);
        addKeyListener(this);
    }
    
    public void mover(KeyEvent flecha){
        
        //repaint();
        
    }
    
    public void paint(Graphics g){
        //ImageIcon Img = new ImageIcon(getClass().getResource("/minigolf/pelota.png"));
        g.setColor(Color.white);
        g.fillOval(x,y,20,20);
        g.setColor(Color.black);
        g.drawOval(x,y,20,20);
        //g.drawImage(Img.getImage(),x,y, 28, 28,null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    }

    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode() == KeyEvent.VK_UP)   y--;
        if(ke.getKeyCode() == KeyEvent.VK_DOWN) y++;
        if(ke.getKeyCode() == KeyEvent.VK_LEFT) x--;
        if(ke.getKeyCode() == KeyEvent.VK_RIGHT)x++;  
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {}
}
