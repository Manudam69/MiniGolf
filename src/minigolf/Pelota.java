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
import javax.swing.Timer;

/**
 *
 * @author MD
 */
public class Pelota extends JLabel implements ActionListener, KeyListener,Runnable{
    private int x,y,velx,vely;
    Timer timer = new Timer(5,this);
    
    @Override
    public void run(){
        repaint();
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getVelx() {
        return velx;
    }

    public int getVely() {
        return vely;
    }
    
    public Pelota() {
        timer.start();
        this.setSize(405,720);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }
    
    public void mover(){
        //this.setLocation(this.getX(),this.getY());
    }
    
    @Override
    public void paint(Graphics g){      
        super.paintComponent(g);
        g.setColor(Color.white);
        g.fillOval(x,y,20,20);
        g.setColor(Color.black);
        g.drawOval(x,y,20,20);
    }

    @Override
    public void actionPerformed(ActionEvent ke) {
        
      x = x + velx;
      y = y + vely;
      repaint();
    }

    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode() == KeyEvent.VK_UP)   {vely=-1; velx=0;}    //y-=5;
        if(ke.getKeyCode() == KeyEvent.VK_DOWN) {vely= 1; velx=0;}    //y+=5;
        if(ke.getKeyCode() == KeyEvent.VK_LEFT) {velx=-1; vely=0;}    //x-=5;
        if(ke.getKeyCode() == KeyEvent.VK_RIGHT){velx= 1; vely=0;}    //x+=5;

    }

    @Override
    public void keyReleased(KeyEvent ke) {}
}
