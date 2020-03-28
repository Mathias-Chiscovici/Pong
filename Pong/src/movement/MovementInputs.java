package movement;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;

import draw.DrawBall;
import draw.DrawRacket;
import draw.GameWindow;
import entities.Racket;
import singleton.DrawBallSingleton;
import singleton.DrawRacketSingleton;
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
		DrawRacket dr = DrawRacketSingleton.getInstance();
		DrawBall db = DrawBallSingleton.getInstance();

		if (e.getKeyCode() == up && dr.getRacket().getY() > 0) {
			dr.getRacket().setY(dr.getRacket().getY() - 10);
		} else if (e.getKeyCode() == down && dr.getRacket().getY() < (GameWindow.getWindow().getContentPane().getHeight() - Racket.getRacketSizeY())) {
			dr.getRacket().setY(dr.getRacket().getY() + 10);
		}
		db.repaint();
		dr.repaint();
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
