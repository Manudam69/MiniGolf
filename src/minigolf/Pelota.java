/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minigolf;
//import java.awt.Dyn4j;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author MD
 */
public class Pelota extends JLabel implements ActionListener, KeyListener,Runnable,MouseListener{
    private int diametro = 20;
    private double angulo,velx,vely,x,y;
    Timer timer = new Timer(2,this);
    
    @Override
    public void run(){
        repaint();
    }

    public void setVelx(double velx) {
        this.velx = velx;
    }

    public void setVely(double vely) {
        this.vely = vely;
    }

    public double getVelx() {
        return velx;
    }

    public double getVely() {
        return vely;
    }
    

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    public Pelota() {
        timer.start();
        this.setSize(405,720);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        addMouseListener(this);
        
    }
    
    @Override
    public void paint(Graphics g){
        
        super.paintComponent(g);
        g.setColor(Color.white);
        g.fillOval((int)x,(int)y,diametro,diametro);
        g.setColor(Color.black);
        g.drawOval((int)x,(int)y,diametro,diametro);
     
        
    }
    
    Colision game = new Colision(this);
    @Override
    public void actionPerformed(ActionEvent ke) {  
      x = x + velx;
      y = y + vely;
      game.setDatos(x,y,diametro);
      game.campo13();
      repaint();
    }

    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode() == KeyEvent.VK_UP)   {vely=-1; velx=0;} 
        if(ke.getKeyCode() == KeyEvent.VK_DOWN) {vely= 1; velx=0;}    
        if(ke.getKeyCode() == KeyEvent.VK_LEFT) {velx=-1; vely=0;}    
        if(ke.getKeyCode() == KeyEvent.VK_RIGHT){velx= 1; vely=0;}   

    }

    @Override
    public void keyReleased(KeyEvent ke) {}

    @Override
    public void mouseClicked(MouseEvent me) {}

    @Override
    public void mousePressed(MouseEvent me) { }
    double ax,ay;
    @Override
    
    public void mouseReleased(MouseEvent me) {     
        double a,b,h;
        if(velx == 0 && vely == 0){
            a = me.getX() - 10 - x; 
            b = (me.getY() - 10 - y)*-1;
            h = Math.sqrt((Math.pow(a,2) + Math.pow(b,2)));
            angulo = Math.acos((a/h)) * 180/3.1416;
            System.out.println("ady: " + a + "\nopu: " + b + "\nhip: "+ h + "\nang: " + angulo);
            grados(Math.toRadians(angulo));
            velx = ax;
            vely = ay;
            
            //ax = Math.toDegrees(-0.448074);
            //System.out.println(ax + "   " + ay + "   " + Math.toRadians(90) + "  " + Math.toDegrees(1.5707963267948966) +"\n" 
              //      + Math.cos(90) +"   "+ Math.cos(1)+ "   " + Math.toRadians(1));
            /*x = me.getX() - 10;
            y = me.getY() - 10;
            velx = 1;
            vely= -1;*/
        }
    }
    
    private void grados(double theta){
           ax = Math.cos(theta);
           ay = -Math.sin(theta);
           //System.out.println("cos 90 : "+ax);
           //System.out.println("sin 90 : "+ay);
    }

    @Override
    public void mouseEntered(MouseEvent me) {}

    @Override
    public void mouseExited(MouseEvent me) {}
}
