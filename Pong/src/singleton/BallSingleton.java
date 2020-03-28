package singleton;

import entities.Ball;

public class BallSingleton {
	private static Ball b = null;
	
	public static Ball getInstance() {
		if(b == null)
			b = new Ball();
		return b;
	}
}
