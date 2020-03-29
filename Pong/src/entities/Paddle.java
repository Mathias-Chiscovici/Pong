package entities;

import java.awt.Color;

import drawOld.GameWindow;

public class Paddle {
	private int y = (GameWindow.getySize() / 2) - racketSizeY;
	private static final int racketSizeY = (int) GameWindow.getySize() / 7;
	private static final int racketSizeX = (int) GameWindow.getxSize() / 70;
	private Color color = Settings.getEntitiesColor();

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public static int getRacketSizeY() {
		return racketSizeY;
	}

	public static int getRacketSizeX() {
		return racketSizeX;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Racket [y=" + y + ", color=" + color + "]";
	}

	
}
