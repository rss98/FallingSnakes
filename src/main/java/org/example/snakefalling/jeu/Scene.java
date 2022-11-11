package org.example.snakefalling.jeu;

import org.example.snakefalling.entites.*;
import org.example.snakefalling.rsc.Chrono;
import org.example.snakefalling.rsc.Clavier;
import org.example.snakefalling.rsc.Constantes;

import javax.swing.*;
import java.awt.*;

public class Scene extends JPanel {

    public Vaisseau vaisseau = new Vaisseau();
    public Fraise fraise = new Fraise();
    public Myrtille myrtille = new Myrtille();
    public Bois bois1 = new Bois();
    public Bois bois2 = new Bois();
    public Bois bois3 = new Bois();
    public Piecedor piece = new Piecedor();
    public Tir tir = new Tir();


    public Scene() {
        super();
        this.setFocusable(true);
        this.requestFocusInWindow();
        this.addKeyListener(new Clavier());
        Thread chrono = new Thread(new Chrono());
        chrono.start();
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics g2 = (Graphics2D) g;

        g2.setColor(Color.black);
        g2.fillRect(0, 0, Constantes.LARGEUR_FENETRE, Constantes.HAUTEUR_FENETRE);
        g2.setColor(Color.blue);
        g2.fillRect(30, 530, 535, 5);
        g2.drawImage(this.vaisseau.getImage(), this.vaisseau.deplacementVaisseau(), this.vaisseau.getyPos(), null);
        // g2.drawImage(this.fraise.getImage(),  this.fraise.getxFraise(),  this.fraise.getyFraise(), null);
        g2.drawImage(this.fraise.getImage(), 120, 30, null);
        // g2.drawImage(this.myrtille.getImage(),  this.myrtille.getxMyrtille(),  this.myrtille.getyMyrtille(), null);
        g2.drawImage(this.myrtille.getImage(), 300, 240, null);
        g2.drawImage(this.bois1.getImage(), this.bois1.getxBois(), this.bois1.getyBois(), null);
        g2.drawImage(this.bois2.getImage(), 70, 140, null);
        g2.drawImage(this.bois3.getImage(), 230, 90, null);
        g2.drawImage(this.piece.getImage(), 400, 220, null);
        this.tir.dessinTir(g2);
    }
}
