package entites;

import javax.swing.ImageIcon;

import rsc.Constantes;

public class Vaisseau extends Entite{
	public Vaisseau() {
		super.xPos = Constantes.X_POSITION_INITIALE_VAISSEAU;
		super.yPos = Constantes.Y_POSITION_VAISSEAU;
		super.largeur = Constantes.LARGEUR_VAISSEAU;
		super.hauteur = Constantes.HAUTEUR_VAISSEAU;
		super.dx = 0;
		super.dy = 0;
		super.strImage1 = "/images/vaisseau.png";
		super.icon = new ImageIcon(getClass().getResource(super.strImage1));
		super.image = this.icon.getImage();
	}
	
	public int deplacementVaisseau() {
		if(this.dx < 0) {
			if(this.xPos > Constantes.LIMITE_GAUCHE) {
				this.xPos = this.xPos + this.dx;
			}
		} else {
			if(dx > 0) {
				if(this.xPos + this.dx < Constantes.LIMITE_DROITE) {
					this.xPos = this.xPos + this.dx;
				}
			}
		}
		return this.xPos;
	}
}
