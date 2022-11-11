package entites;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Bois extends Entite{
	
	private int xBois;
	private int yBois;
	
	
	public int getxBois() {
		return xBois;
	}

	public void setxBois(int xBois) {
		this.xBois = xBois;
	}

	public int getyBois() {
		return yBois;
	}

	public void setyBois(int yBois) {
		this.yBois = yBois;
	}

	public Bois() {
	    super.strImage4 = "/images/bois.png";
	    super.icon = new ImageIcon(getClass().getResource(super.strImage4));
		super.image = this.icon.getImage();
	}
	
	public void dessinBois(Graphics g) {
			g.drawImage(this.image, this.xPos, this.yPos, null);
	}
}
