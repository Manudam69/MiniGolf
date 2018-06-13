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
    private int x,y,diametro;

    public int getX() {
        return x;
    }

    public void setDatos(int x,int y,int diametro) {
        this.x = x;
        this.y = y;
        this.diametro = diametro;
    }

    public int getY() {
        return y;
    }

    public int getDiametro() {
        return diametro;
    }

    public void marco(/*int x,int y,int diametro*/){
        if(x < 12 || x > 390 - diametro) pelota.setVelx(pelota.getVelx()*-1);
        if(y < 12 || y > 707 - diametro) pelota.setVely(pelota.getVely()*-1);
    }

    private void cambio(){
        pelota.setVely(pelota.getVely()*-1); 
        pelota.setVelx(pelota.getVelx()*-1);
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
        if(y > 527 - diametro && y < 543 && x > 83 - diametro && x < 320) cambio();
        if(y < 439 && y > 423 - diametro && x > 235 - diametro) cambio();
        if(y < 439 && y > 423 - diametro && x < 167) cambio();
        if(y < 381 && y > 144 - diametro && x > 136 - diametro && x < 152) cambio();
        if(y < 381 && y > 144 - diametro && x > 254 - diametro && x < 270) cambio();
    }
    
    public void campo5(){
        campo4();
    }
    
    public void campo6(){
        marco();
        if(y > 527 - diametro && y < 543 && x > 83 - diametro && x < 320) cambio();
    }
    
    public void campo7(){
        marco();
        if(y > 527 - diametro && y < 543 && x > 83 - diametro && x < 320)   cambio();
        if(y < 439 && y > 423 - diametro && x > 235 - diametro)             cambio();
        if(y < 439 && y > 423 - diametro && x < 167)                        cambio();
        if(y < 334 && y > 318 - diametro && x > 84 - diametro && x < 321)   cambio();
        if(y < 111 && x > 245 - diametro)                                   cambio();
        if(y < 111 && x < 162)                                              cambio();
        
    }
    
    public void campo8(){
        campo7();
    }
    
    public void campo9(){
        marco();
        if(y < 237 && y > 221 - diametro && x > 83 - diametro && x < 320) cambio();
        if(x > 90 - diametro && x < 109 && y < 115) cambio();
        if(x > 299 - diametro && x < 316 && y < 116)cambio();
    }
    
    public void campo10(){
        campo9();
    }
    
    public void campo11(){
        marco();
        if(x > 90 - diametro && y > 179 - diametro && x < 106)              cambio();
        if(x > 175 - diametro && y < 549 && x < 191)                        cambio();     
        if(y < 116 && x > 91 - diametro && x < 109)                         cambio();
        if(y > 606 - diametro && x < 191 && x > 175 - diametro)             cambio();
        if(x > 252 - diametro && y > 201 - diametro && x < 268)             cambio();
        if(y < 140 && x > 252 - diametro && x < 268)                        cambio();
        if(x > 326 - diametro && y > 200 - diametro && y < 214)             cambio();
        if(x < 328 && y > 322 - diametro && y < 337 && x > 268 - diametro)  cambio();
        if(y > 429 - diametro && x > 325 - diametro && y < 444)             cambio();
        if(y > 542 - diametro && y < 557 && x < 328 && x > 268 - diametro)  cambio();
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
