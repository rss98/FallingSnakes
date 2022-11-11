package org.example.snakefalling.jeu;

import org.example.snakefalling.rsc.Constantes;

import javax.swing.*;


public class Main {
    public static Scene scene;

    public static void main(String[] args) {
        // Creation de la fenetre
        JFrame fenetre = new JFrame("Falling snake");
        fenetre.setSize(Constantes.LARGEUR_FENETRE, Constantes.HAUTEUR_FENETRE);
        fenetre.setResizable(false);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setAlwaysOnTop(true);
        // fenetre.setBackground(Color.black);
        scene = new Scene();
        fenetre.setContentPane(scene);
        fenetre.setVisible(true);
    }
}
