package entites;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Fraise extends Entite{
	
	private int xFraise;
	private int yFraise;
	 
	
	public int getxFraise() {
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
	}

	public Fraise() {
		super.strImage2 = "/images/fraise.png";
		super.icon = new ImageIcon(getClass().getResource(super.strImage2));
		super.image = this.icon.getImage();
	}
	
	
	public void dessinFraise(Graphics g) {
		g.drawImage(this.image,  xFraise,  yFraise,  null);
}
}
