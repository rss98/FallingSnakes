package org.example.snakefalling.entites;

import org.example.snakefalling.rsc.Constantes;

import javax.swing.*;
import java.awt.*;

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
        if (this.vaisseauTir == true) {
            if (this.yPos > 0) {
                this.yPos = this.yPos - Constantes.DY_TIR;
            } else {
                this.vaisseauTir = false;
            }
        }
        return yPos;
    }

    public void dessinTir(Graphics g) {
        if (this.vaisseauTir == true) {
            g.drawImage(this.image, this.xPos, this.deplacementTir(), null);
        }
    }


}
