package singleton;

import entities.Paddle;

public class PaddleSingleton {
	private static Paddle r = null;
	
	public static Paddle getInstance() {
		if(r == null) 
			r = new Paddle();
		return r;
	}
}
