package entites;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Myrtille extends Entite {
	
	private int xMyrtille;
	private int yMyrtille;
	
	
	
	public int getxMyrtille() {
		return xMyrtille;
	}

	public void setxMyrtille(int xMyrtille) {
		this.xMyrtille = xMyrtille;
	}

	public int getyMyrtille() {
		return yMyrtille;
	}

	public void setyMyrtille(int yMyrtille) {
		this.yMyrtille = yMyrtille;
	}

	public Myrtille() {
	    super.strImage3 = "/images/myrtille.png";
	    super.icon = new ImageIcon(getClass().getResource(super.strImage3));
		super.image = this.icon.getImage();
		
		
	}
	
	public void dessinMyrtille(Graphics g) {
		g.drawImage(this.image,  xMyrtille,  yMyrtille,  null);
}
}
