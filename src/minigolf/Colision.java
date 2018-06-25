/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minigolf;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jafet
 */
public class Colision{
    private Pelota pelota;
    public Colision(Pelota pelota){
        this.pelota = pelota;
    }
    private int diametro;
    private double x,y,velx,vely;
    public double getX() {
        return x;
    }

    public void setDatos(double x,double y,int diametro) {
        this.x = (int)x;
        this.y = (int)y;
        this.diametro = diametro;
    }

    public Colision() {
    }
    
    public void marco(){
        if(x < 12 || x > 392 - diametro) pelota.setVelx(pelota.getVelx()*-1);
        if(y < 12 || y > 707 - diametro) pelota.setVely(pelota.getVely()*-1);
    }

    private void cambioX(){
        pelota.setVelx(pelota.getVelx()*-1);
    }
    private void cambioY(){
        pelota.setVely(pelota.getVely()*-1); 
    }
    
    public void Hoyo(int cx,int cy){
        if(Math.sqrt(Math.pow(cx - Math.abs(x+10),2) + (Math.pow(cy - Math.abs(y+10),2))) < 21){
            JFrame frame = new JFrame("Nivel completado");
            pelota.timer.stop();
            JOptionPane.showMessageDialog(frame,"Golpes realizados: " + pelota.cont + ".");
            System.exit(0);
        }
    }
    
    
    public void campo1(){
        marco();
        Hoyo(202,48);
    }
    
    public void campo2(){
        marco();
        if(y < 552 - diametro && y > 499 || y < 462 - diametro && y > 409 || y < 366 - diametro && y > 313 || y < 272 - diametro && y > 219 || y < 175 - diametro && y > 122){
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(Colision.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        Hoyo(202,48);
    }
    
    public void campo3(){
        marco();
        if(x > 12 && y > 12 && x < 319 - diametro && y < 707 - diametro)
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(Colision.class.getName()).log(Level.SEVERE, null, ex);
            }
        Hoyo(202,48);
    }
 
    public void campo4(){
        marco();
        if(y == 543 && x < 320 && x > 83 - diametro)             cambioY();
        if(y == 527 - diametro && x < 320 && x > 83 - diametro)  cambioY();
        if(y > 527 - diametro && y < 543 && x == 320)            cambioX();
        if(y > 527 - diametro && y < 543 && x == 83 - diametro)  cambioX(); 
            
        if(y < 439 && y > 423 - diametro)
            if (x == 167 || x == 235 - diametro)    cambioX();
        if(y == 439 || y == 423 - diametro)
            if(x < 167 || x > 235 - diametro)       cambioY();
        
        if(y > 144 - diametro && y < 381){
            if(x == 152 || x == 136 - diametro)     cambioX();
            if(x == 254 - diametro || x == 270)     cambioX();
        }
        if(y == 381 || y == 144 - diametro){
            if (x > 136 - diametro && x < 152)      cambioY();
            if (x > 254 - diametro && x < 270)      cambioY();
        }
        Hoyo(202,48);
    }
    
    public void campo5(){
        campo4();
        if(x < 136 - diametro && y < 423 && y > 145 -diametro || x > 270 && y < 423 && y > 145 - diametro){
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(Colision.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Hoyo(202,48);
    }
    
    public void campo6(){
        marco();  
        if(y == 543 && x < 320 && x > 83 - diametro)             cambioY();
        if(y == 527 - diametro && x < 320 && x > 83 - diametro)  cambioY();
        if(y > 527 - diametro && y < 543 && x == 320)            cambioX();
        if(y > 527 - diametro && y < 543 && x == 83 - diametro)  cambioX();
        if(x < 136 - diametro && y < 423 && y > 145 -diametro || x > 270 && y < 423 && y > 145 - diametro)
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(Colision.class.getName()).log(Level.SEVERE, null, ex);
            }   
        Hoyo(202,48);
    }
    
    public void campo7(){
        marco();
        if(y < 439 && y > 423 - diametro)
            if (x == 167 || x == 235 - diametro)    cambioX();
        if(y == 439 || y == 423 - diametro)
            if(x < 167 || x > 235 - diametro)       cambioY();
        
        if(x == 83 - diametro || x == 320){
            if(y < 543 && y > 527 - diametro) cambioX();
            if(y < 334 && y > 318 - diametro) cambioX();
        }
        if(x > 84 - diametro && x < 321)
            if(y == 334 || y == 318 - diametro || y == 527 - diametro || y == 543) cambioY();
        
        if( y == 110)
            if(x < 162 || x > 245 - diametro) cambioY(); 
        if( y < 110)  
            if(x == 162 || x == 245 - diametro) cambioX();
        Hoyo(202,48);
    }
    
    public void campo8(){
        campo7();
        if(y < 317 - diametro && x > 85 - diametro && x < 100 ||y < 317 - diametro && x > 114 - diametro && x < 130 ||y < 317 - diametro && x > 144 - diametro && x < 159)
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(Colision.class.getName()).log(Level.SEVERE, null, ex);
            }
        if(y < 317 - diametro && x > 245 - diametro && x < 260 ||y < 317 - diametro && x > 275 - diametro && x < 290 ||y < 317 - diametro && x > 304 - diametro && x < 320)
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(Colision.class.getName()).log(Level.SEVERE, null, ex);
            }
        Hoyo(202,48);
    }
    
    public void campo9(){
        marco();
        
        if(x > 83 - diametro && x < 320)
            if (y == 237 || y == 221 - diametro) cambioY();
        if(y > 221 - diametro && y < 237)
            if(x == 320 || x == 83 - diametro) cambioX();
        
        if(y < 117)
            if(x == 316 || x == 299 - diametro|| x == 108 || x == 91 - diametro) cambioX();
        if(y == 114){
            if(x > 91 - diametro && x < 108) cambioY();
            if(x > 299 - diametro && x < 316) cambioY();
        }
        Hoyo(202,48);
    }
    
    public void campo10(){
        campo9();
        if(y < 142 - diametro && x > 107 && x < 300)
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(Colision.class.getName()).log(Level.SEVERE, null, ex);
            }   
        Hoyo(202,48);
    }
    
    public void campo11(){
        marco();
        if(x > 90 - diametro && x < 106)
            if(y == 179 - diametro || y < 115) cambioY();
            
        if(x == 90 - diametro || x == 106)
            if (y > 179 - diametro || y < 115) cambioX();
           
        if(x == 175 - diametro || x == 191)
            if(y < 548 || y > 607 - diametro) cambioX();
        
        if(x > 175 - diametro && x < 191)
            if(y == 607 - diametro || y == 549) cambioY();
        
        if(x == 252 - diametro || x == 268)
            if(y > 201 - diametro || y < 140) cambioX();
        
        if(x < 268 && x > 253 - diametro)
            if( y == 201 - diametro || y == 140) cambioY();
        
        
        if(x > 326 - diametro)
            if(y == 199 - diametro || y == 213 || y == 429 - diametro || y == 443) cambioY();
        
        if(x == 326 - diametro){
            if(y > 199 - diametro && y < 213) cambioX();
            if(y > 429 - diametro && y < 443) cambioX();
        }
        
        if(x < 328 && x > 268 - diametro)
            if( y == 322 - diametro || y == 337 || y == 542 - diametro || y == 557) cambioY();
        
         if(x == 328){
            if(y > 542 - diametro && y < 557) cambioX();
            if(y > 322 - diametro && y < 337) cambioX();
         }
         Hoyo(349,659);
    }
    
    public void campo12(){
        campo11();
        if(y < 114 - diametro && x < 91 ){
            pelota.setX(40);
            pelota.setY(668);
            pelota.setVelx(0);
            pelota.setVely(0);
        }
        
        if(y > 606 && x < 175 - diametro && x > 106){
            pelota.setX(40);
            pelota.setY(668);
            pelota.setVelx(0);
            pelota.setVely(0);
        }
        
        if(y < 138 - diametro && x > 191 && x < 391){
            pelota.setX(40);
            pelota.setY(668);
            pelota.setVelx(0);
            pelota.setVely(0);
        }
        
        if(y < 197 - diametro && x > 327){
            pelota.setX(40);
            pelota.setY(668);
            pelota.setVelx(0);
            pelota.setVely(0);
        }
        Hoyo(349,659);    
    }
    
    public void campo13(){
        marco();
        if(y < 453 - diametro && y > 291 && x < 163 || y < 453 - diametro && y > 291 && x > 234 - diametro){
            pelota.setX(192);
            pelota.setY(668);
            pelota.setVelx(0);
            pelota.setVely(0);
        }
        Hoyo(202,48);
    }
    
    public void campo14(){
        if(x > 27 - 10 && y > 27 && x < 90 && y < 693 -10 || x > 318 - diametro && y > 27 && y < 697 - 10){
        }else{
            pelota.setX(40);
            pelota.setY(668);
            pelota.setVelx(0);
            pelota.setVely(0);
        }
        if(x > 38 && y < 105 - diametro && x < 79 - diametro && y > 38){
            pelota.setVelx(pelota.getVelx()*-1);
            pelota.setVely(pelota.getVely()*-1);
            pelota.setX(341);     
            pelota.setY(73);
        }
        marco();
        Hoyo(349,659);  
    }
    
    public void campo15(){
        marco();
        if(y < 252|| y > 451 && x > 320 - diametro && x < 381){
        }else{
          pelota.setX(192);
          pelota.setY(231);
          pelota.setVelx(0);
          pelota.setVely(0); 
        }
        
        if(x > 312 && x < 354 - diametro && y < 104 - diametro && y > 37){
            pelota.setVelx(pelota.getVelx()*-1);
            pelota.setVely(pelota.getVely()*-1);
            pelota.setX(340);     
            pelota.setY(497);  
        }
        if(x > 183 && x < 225 - diametro && y < 104 - diametro && y > 37 || x > 55 & x < 96 - diametro && y < 104 - diametro && y > 37){
          pelota.setX(192);
          pelota.setY(231);
          pelota.setVelx(0);
          pelota.setVely(0);    
        }
        Hoyo(349,659);  
    }
    
    public void campo16(){
        marco();
        if(x < 171 - diametro || x > 233){
            pelota.setX(192);
            pelota.setY(668);
            pelota.setVelx(0);
            pelota.setVely(0);
        }
    }
    
    public void campo17(){
        marco();    
        if(x > 74 && y > 74 && x < 311 - diametro){
            pelota.setX(40);
            pelota.setY(668);
            pelota.setVelx(0);
            pelota.setVely(0); 
        }
        Hoyo(349,659);
    }
    
    public void campo18(){
        if(x > 75 && x < 117 - diametro && y > 87 || x > 218 && x < 255 - diametro && y < 586 - diametro || x > 302 && x < 326 - 10 && y > 87){
            pelota.setX(40);
            pelota.setY(668);
            pelota.setVelx(0);
            pelota.setVely(0);
        }   
        marco();
        Hoyo(349,659);
    } 
}