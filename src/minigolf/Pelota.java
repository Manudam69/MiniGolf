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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author MD
 */
public class Pelota extends JLabel implements ActionListener,Runnable,MouseListener{
    private int diametro = 20;
    private double angulo,velx,vely,x,y;
    Timer timer = new Timer(3,this);
    
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
      x += velx;
      y += vely;
      detener();
      game.setDatos(x,y,diametro);
      game.campo1();
      repaint();
    }
    
    public int time = 650;
    private boolean ban;
    private void detener(){
        if(Math.round(x) == Mx && Math.round(y) == My){
            time = 50;
            ban = true;
        }else
           if(!ban)
                ban = true;
        
        if(velx != 0 && vely != 0 && ban){
            time--;
            if(time == 0){
                velx = vely = 0;
                time = 650;
                ban = false;
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {}

    @Override
    public void mousePressed(MouseEvent me) {}
    
    double Mx=500,My=500;
    @Override
    public void mouseReleased(MouseEvent me) {
        Mx = me.getX() - 10;
        My = me.getY() - 10;
        double a,b,h;    
        if(velx == 0 && vely == 0){
            ban = false;
            a = me.getX() - 10 - x; 
            b =(me.getY() - 10 - y);           
            h = Math.sqrt((Math.pow(a,2) + Math.pow(b,2)));
            angulo = Math.acos((a/h)) * 180/3.1416;
            if(me.getY() > y + 10 ) angulo *= -1;
            grados(Math.toRadians(angulo));
        }
    }
    
    private void grados(double theta){
        velx = Math.cos(theta);
        vely = -Math.sin(theta);
    }

    @Override
    public void mouseEntered(MouseEvent me) {}

    @Override
    public void mouseExited(MouseEvent me) {}
}
