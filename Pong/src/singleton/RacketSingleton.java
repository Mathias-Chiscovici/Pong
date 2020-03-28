package singleton;

import entities.Racket;

public class RacketSingleton {
	private static Racket r = null;
	
	public static Racket getInstance() {
		if(r == null) 
			r = new Racket();
		return r;
	}
}
