package singleton;

import draw.DrawBall;

public class DrawBallSingleton {
	private static DrawBall db = null;
	
	public static DrawBall getInstance() {
		if(db == null)
			db = new DrawBall();
		return db;
	}
}
