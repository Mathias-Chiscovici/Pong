package singleton;

import movement.MovementInputs;

public class MovementInputsSingleton {
	private static MovementInputs mi = null;
	
	public static MovementInputs getInstance() {
		if(mi == null)
			mi = new MovementInputs();
		return mi;
	}
}
