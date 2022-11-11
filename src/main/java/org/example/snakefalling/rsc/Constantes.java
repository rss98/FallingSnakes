package org.example.snakefalling.rsc;

public abstract class Constantes {
    // Dimensions de la fenetre
    public static final int LARGEUR_FENETRE = 600;
    public static final int HAUTEUR_FENETRE = 600;
    public static final int MARGE_FENETRE = 50;

    // Dimensions Vaisseau
    public static final int LARGEUR_VAISSEAU = 39;
    public static final int HAUTEUR_VAISSEAU = 24;
    public static final int LIMITE_GAUCHE = 50;
    public static final int LIMITE_DROITE = 400;


    // Position Vaisseau
    // Comment diminuer la taille d'une image (vaisseau) ?
    public static final int X_POSITION_INITIALE_VAISSEAU = (LARGEUR_VAISSEAU - HAUTEUR_VAISSEAU) / 2;
    public static final int Y_POSITION_VAISSEAU = 350;


    // Unité déplacement Vaisseau
    public static final int D_VAISSEAU = 1;

    // Les tirs
    public static final int LARGEUR_TIR = 3;
    public static final int HAUTEUR_TIR = 13;
    public static final int DY_TIR = 2;

}
