package singleton;

import draw.DrawRacket;

public class DrawRacketSingleton {
	private static DrawRacket dr = null;
	
	public static DrawRacket getInstance() {
		if(dr == null)
			dr = new DrawRacket();		
		return dr;
	}
}
