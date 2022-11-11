package entites;

import java.awt.Image;

import javax.swing.ImageIcon;

public abstract class Entite {
	protected int largeur, hauteur, xPos, yPos, dx, dy;
	// private int xFraise, yFraise;
	protected int RANDOM_POS;
	// private int max = 20;
	// private int min = 3;
	private boolean pause = false;
	protected boolean vivant;
	protected String strImage1, strImage2, strImage3, strImage4, strImage5, strImage6;
	protected ImageIcon icon;
	protected Image image;
	
	
	/* public int getxFraise() {
		return xFraise;
	}
	public void setxFraise(int xFraise) {
		this.xFraise = xFraise;
	}
	public int getyFraise() {
		return yFraise;
	}
	public void setyFraise(int yFraise) {
		this.yFraise = yFraise;
	} */
	public int getRANDOM_POS() {
		return RANDOM_POS;
	}
	public void setRANDOM_POS(int rANDOM_POS) {
		RANDOM_POS = rANDOM_POS;
	}
	/* public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	} */
	public boolean isPause() {
		return pause;
	}
	public void setPause(boolean pause) {
		this.pause = pause;
	}
	public int getLargeur() {
		return largeur;
	}
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	public int getHauteur() {
		return hauteur;
	}
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	public int getxPos() {
		return xPos;
	}
	public void setxPos(int xPos) {
		this.xPos = xPos;
	}
	public int getyPos() {
		return yPos;
	}
	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	public int getDx() {
		return dx;
	}
	public void setDx(int dx) {
		this.dx = dx;
	}
	public int getDy() {
		return dy;
	}
	public void setDy(int dy) {
		this.dy = dy;
	}
	public boolean isVivant() {
		return vivant;
	}
	public void setVivant(boolean vivant) {
		this.vivant = vivant;
	}
	public String getStrImage1() {
		return strImage1;
	}
	public void setStrImage1(String strImage1) {
		this.strImage1 = strImage1;
	}
	public String getStrImage2() {
		return strImage2;
	}
	public void setStrImage2(String strImage2) {
		this.strImage2 = strImage2;
	}
	public String getStrImage3() {
		return strImage3;
	}
	public void setStrImage3(String strImage3) {
		this.strImage3 = strImage3;
	}
	public ImageIcon getIcon() {
		return icon;
	}
	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}

	
}
