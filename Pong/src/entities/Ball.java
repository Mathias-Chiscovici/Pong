package entities;

import java.awt.Color;
import java.util.Random;

import drawOld.GameWindow;

public class Ball {
	private Random r = new Random();
	private int x = GameWindow.getxSize() / 2;
	private int y = GameWindow.getySize() / 2;
	private boolean direction = r.nextBoolean(); // true = towards right, false = towards left
	private final static int size = (int) ((GameWindow.getySize() / GameWindow.getxSize()) * 10);
	private Color color = Settings.getEntitiesColor();
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
}
