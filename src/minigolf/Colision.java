/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minigolf;

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
    private double x,y;
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
    
    public void campo1(){
        marco();
    }
    
    public void campo2(){
        marco();
    }
    
    public void campo3(){
        marco();
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
    }
    
    public void campo5(){
        campo4();
    }
    
    public void campo6(){
        marco();  
        if(y == 543 && x < 320 && x > 83 - diametro)             cambioY();
        if(y == 527 - diametro && x < 320 && x > 83 - diametro)  cambioY();
        if(y > 527 - diametro && y < 543 && x == 320)            cambioX();
        if(y > 527 - diametro && y < 543 && x == 83 - diametro)  cambioX(); 
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
    }
    
    public void campo8(){
        campo7();
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
    }
    
    public void campo10(){
        campo9();
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
    }
    
    public void campo12(){
        campo11();
        
    }
    
    public void campo13(){
        campo11();
    }
    
    public void campo14(){
        marco();
    }
    
    public void campo15(){
        marco();
    }
    
    public void campo16(){
        marco();
    }
    
    public void campo17(){
        marco();    
    }
    
    public void campo18(){
        marco();
    } 
}
