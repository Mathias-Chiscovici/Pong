package singleton;

import entities.Ball;
import entities.Color;

public class ColorSingleton {
	private static Color c = null;
	
	public static Color getInstance() {
		if(c == null)
			c = new Color();		
		return c;
	}
	
	public static Color getInstance(int r, int g, int b) {
		if(c == null)
			c = new Color(r, g, b);
		return c;
	}
}
