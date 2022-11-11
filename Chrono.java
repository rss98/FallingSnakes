package rsc;

import jeu.Main;

public class Chrono implements Runnable{
	private final int pause = 5;
	public static int compteTours = 0;
	
	@Override
	public void run() {
		while(true) {
			Main.scene.repaint();
			try {
				Thread.sleep(pause);
			}
			catch(InterruptedException e) {
			}
		}
	}
}
