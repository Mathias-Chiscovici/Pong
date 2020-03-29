package movement;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;

import draw.DrawBall;
import draw.DrawPaddle;
import draw.GameWindow;
import entities.Paddle;
import singleton.DrawBallSingleton;
import singleton.DrawPaddleSingleton;
import singleton.GameWindowSingleton;

public class MovementInputs implements KeyListener, Runnable {
	private static final int up = (int) KeyboardInputsENUM.UP.VK;
	private static final int down = (int) KeyboardInputsENUM.DOWN.VK;
	private Thread t = new Thread(this);

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		DrawPaddle dr = DrawPaddleSingleton.getInstance();
		DrawBall db = DrawBallSingleton.getInstance();
		GameWindow gw = GameWindowSingleton.getInstance();

		if (e.getKeyCode() == up && dr.getPaddle().getY() > 0) {
			dr.getPaddle().setY(dr.getPaddle().getY() - 10);
		} else if (e.getKeyCode() == down && dr.getPaddle().getY() < (gw.getHeight() - Paddle.getRacketSizeY())) {
			dr.getPaddle().setY(dr.getPaddle().getY() + 10);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void run() {
		GameWindow.getWindow().addKeyListener(this);
	}

	public void mThread() {

		this.run();
		try {
			t.wait(10);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		t.start();
	}

}
