package org.example.snakefalling.rsc;

import org.example.snakefalling.jeu.Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Clavier implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Main.scene.vaisseau.setDx(Constantes.D_VAISSEAU);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            Main.scene.vaisseau.setDx(-Constantes.D_VAISSEAU);
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if (Main.scene.tir.isVaisseauTir() == false) {
                Main.scene.tir.setyPos(Constantes.Y_POSITION_VAISSEAU - Constantes.HAUTEUR_TIR);
                Main.scene.tir.setxPos(Main.scene.vaisseau.getxPos() + Constantes.LARGEUR_VAISSEAU / 2 - 1);
                Main.scene.tir.setVaisseauTir(true);

            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        Main.scene.vaisseau.setDx(0);
    }
}
