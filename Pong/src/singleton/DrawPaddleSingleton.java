package singleton;

import draw.DrawPaddle;

public class DrawPaddleSingleton {
	private static DrawPaddle dp = null;
	
	public static DrawPaddle getInstance() {
		if(dp == null)
			dp = new DrawPaddle();		
		return dp;
	}
}
