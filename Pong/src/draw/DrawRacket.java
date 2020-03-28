package draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.font.GraphicAttribute;

import javax.swing.JPanel;

import entities.Racket;
import singleton.DrawRacketSingleton;
import singleton.RacketSingleton;

public class DrawRacket extends JPanel {
	private Racket racket = RacketSingleton.getInstance();

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillRect(10, racket.getY(), Racket.getRacketSizeX(), Racket.getRacketSizeY());
		g.setColor(new Color(racket.getColor().getR(), racket.getColor().getG(), racket.getColor().getB()));
	}

	public Racket getRacket() {
		return racket;
	}

	public void setRacket(Racket racket) {
		this.racket = racket;
	}

}
