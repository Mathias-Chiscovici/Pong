package entities;

import java.util.Random;

import draw.GameWindow;

public class Ball {
	private int x;
	private int y;
	private boolean direction; // true = towards right, false = towards left
	private final static int size = (int) ((GameWindow.getySize() / GameWindow.getxSize()) * 10);
	private Color color = Settings.getEnititiesColor();
	private  int speed = 3;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isDirection() {
		return direction;
	}

	public void setDirection(boolean direction) {
		this.direction = direction;
	}

	public static int getSize() {
		return size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override

	public String toString() {
		return "Ball [x=" + x + ", y=" + y + ", direction=" + direction + ", color=" + color + "]";
	}

	public Ball() {
		Random r = new Random();
		this.direction = r.nextBoolean();
		this.x = GameWindow.getxSize() / 2;
		this.y = GameWindow.getySize() / 2;
	}
}
