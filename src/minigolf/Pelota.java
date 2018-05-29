/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minigolf;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author MD
 */
public class Pelota extends JLabel {
    private int x,y;

    public Pelota(int x, int y) {
        this.x = x;
        this.y = y;
        this.setSize(405,720);
    }
    
    public void paint(Graphics g){
        ImageIcon Img = new ImageIcon(getClass().getResource("/minigolf/pelota.png"));
        g.setColor(Color.white);
        g.drawImage(Img.getImage(),x,y, 28, 28,null);
    }
    
}
