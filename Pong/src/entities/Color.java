package entities;

public class Color {
	private int r;
	private int g;
	private int b;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Color(int r, int g, int b) {
		super();
		this.r = r;
		this.g = g;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Color [r=" + r + ", g=" + g + ", b=" + b + "]";
	}

	public Color() {}
	
}
