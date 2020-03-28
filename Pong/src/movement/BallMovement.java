package movement;

import entities.Ball;
import singleton.BallSingleton;

public class BallMovement implements Runnable{
	private static Ball b = BallSingleton.getInstance();

	@Override
	public void run() {
		if(b.isDirection())
			b.setX(b.getX()+b.getSpeed());
		else if(!b.isDirection())
			b.setX(b.getX()-b.getSpeed());
	}
}
