package org.example.snakefalling.entites;

public enum Couleur {

    BLEU("/images/tete.png"),JAUNE("/images/rond.png");

    Couleur(String cheminAccesFichier) {

        this.cheminAccesFichier = cheminAccesFichier;

    }

    private String cheminAccesFichier;

    public String getCheminAccesFichier() {

        return cheminAccesFichier;
    }
}
