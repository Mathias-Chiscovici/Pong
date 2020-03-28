package singleton;

import draw.GameWindow;

public class GameWindowSingleton {
	private static GameWindow gw = null;
	
	public static GameWindow getInstance() {
		if(gw == null)
			gw = new GameWindow();
		return gw;
	}
	
}
