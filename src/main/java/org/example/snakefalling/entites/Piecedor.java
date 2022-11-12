package org.example.snakefalling.entites;

import javax.swing.*;
import java.awt.*;

public class Piecedor extends Entite {

    private int xPiecedor;
    private int yPiecedor;


    public Piecedor() {
        super.strImage5 = "/images/piecedor.png";
        super.icon = new ImageIcon(getClass().getResource(super.strImage5));
        super.image = this.icon.getImage();
    }

    public int getxPiecedor() {
        return xPiecedor;
    }

    public void setxPiecedor(int xPiecedor) {
        this.xPiecedor = xPiecedor;
    }

    public int getyPiecedor() {
        return yPiecedor;
    }

    public void setyPiecedor(int yPiecedor) {
        this.yPiecedor = yPiecedor;
    }

    public void dessinPiecedor(Graphics g) {
        g.drawImage(this.image, xPiecedor, yPiecedor, null);
    }
}
