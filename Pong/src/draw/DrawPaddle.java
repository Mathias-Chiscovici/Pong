package draw;

import java.awt.Component;

import entities.Paddle;
import singleton.PaddleSingleton;

public class DrawPaddle {

	private Paddle paddle = PaddleSingleton.getInstance();

	public Paddle getPaddle() {
		return paddle;
	}

	public void setPaddle(Paddle paddle) {
		this.paddle = paddle;
	}

}
