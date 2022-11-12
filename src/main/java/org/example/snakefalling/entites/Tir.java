package org.example.snakefalling.entites;

import org.example.snakefalling.rsc.Constantes;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Tir extends Entite {

    private boolean vaisseauTir = false;

    public Tir() {
        super.xPos = 0;
        super.yPos = Constantes.Y_POSITION_VAISSEAU - Constantes.HAUTEUR_TIR;
        super.largeur = Constantes.LARGEUR_TIR;
        super.hauteur = Constantes.HAUTEUR_TIR;
        super.dx = 0;
        super.dy = Constantes.DY_TIR;
        super.strImage1 = "/images/tir.png";
        super.strImage2 = "";
        super.strImage3 = "";
        super.icon = new ImageIcon(getClass().getResource(super.strImage1));
        super.image = this.icon.getImage();
    }

    public boolean isVaisseauTir() {
        return vaisseauTir;
    }

    public void setVaisseauTir(boolean vaisseauTir) {
        this.vaisseauTir = vaisseauTir;
    }

    public int deplacementTir() {
        if (this.vaisseauTir) {
            if (this.yPos > 0) {
                this.yPos = this.yPos - Constantes.DY_TIR;
            } else {
                this.vaisseauTir = false;
            }
        }
        return yPos;
    }

    public void dessinTir(Graphics g, Serpent s) {
        if (this.vaisseauTir) {


            diminuerTailleSerpent(g, s);


            //+50 : centrer le tir au niveau du vaisseau
            g.drawImage(this.image, this.xPos + 50, this.deplacementTir(), null);
        }
    }

    public void diminuerTailleSerpent(Graphics g, Serpent s) {


        if (this.getxPos() == s.getTeteSerpent().getxPos() && this.getyPos() == s.getTeteSerpent().getyPos()) {

            gameOver(g);

        } else {

            if (s.getElementsCorpsSerpent().isEmpty()) {


            } else {

                //Java 8 stream
                // Java 8 method reference

                s.getElementsCorpsSerpent().stream()
                        .filter(c -> this.getxPos() == c.getxPos() && this.getyPos() == c.getyPos())
                        .forEach(c -> {
                            s.effacer(c.getxPos(), c.getyPos(), g);
                        });

                s.getElementsCorpsSerpent().stream()
                        .filter(c -> this.getxPos() == c.getxPos() && this.getyPos() == c.getyPos())
                        .forEach(new ArrayList<Cercle>()::remove);


            }

        }


    }

    private void gameOver(Graphics g) {
        String message = "You Win";
        Font small = new Font("Helvetice", Font.BOLD, 15);
        //FontMetrics met = getFontMetrics(small);
        g.setColor(Color.white);
        g.setFont(small);
        g.drawString(message, (Constantes.LARGEUR_FENETRE - stringWidth(message)) / 2, Constantes.HAUTEUR_FENETRE / 2);
    }

    private int stringWidth(String str) {
        int len = str.length();
        char[] data = new char[len];
        str.getChars(0, len, data, 0);
        return charsWidth(data, 0, len);
    }

    private int charsWidth(char[] data, int off, int len) {
        return stringWidth(new String(data, off, len));
    }


}
