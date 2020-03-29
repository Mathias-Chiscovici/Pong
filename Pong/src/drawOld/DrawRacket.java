package drawOld;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import entities.Paddle;
import singleton.PaddleSingleton;

public class DrawRacket extends JPanel {
	private Paddle racket = PaddleSingleton.getInstance();

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillRect(10, racket.getY(), Paddle.getRacketSizeX(), Paddle.getRacketSizeY());
		g.setColor(new Color(racket.getColor().getR(), racket.getColor().getG(), racket.getColor().getB()));
	}

	public Paddle getRacket() {
		return racket;
	}

	public void setRacket(Paddle racket) {
		this.racket = racket;
	}

}
