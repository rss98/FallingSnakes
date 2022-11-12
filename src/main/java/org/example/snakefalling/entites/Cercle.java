package org.example.snakefalling.entites;

import javax.swing.*;
import java.awt.*;

public class Cercle {

    private Couleur couleur;

    private ImageIcon imageIcon;

    private Image image;

    private int xPos, yPos;

    public Cercle(Couleur couleur,int xPos, int yPos ){

        this.couleur=couleur;
        this.xPos=xPos;
        this.yPos=yPos;
        imageIcon= new ImageIcon(getClass().getResource(couleur.getCheminAccesFichier()));
        image= this.imageIcon.getImage();
    }

    private Cercle(){

    }

    public Image getImage() {
        return image;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}
