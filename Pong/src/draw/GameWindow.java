package draw;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JPanel;

import entities.Racket;
import entities.Settings;
import movement.MovementInputs;
import singleton.DrawBallSingleton;
import singleton.DrawRacketSingleton;
import singleton.MovementInputsSingleton;

public class GameWindow {
	private static JFrame window = new JFrame("PONG");
	private static int xSize = 600;
	private static int ySize = 400;
	private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private DrawRacket drawRacket = DrawRacketSingleton.getInstance();
	private DrawBall drawBall = DrawBallSingleton.getInstance();

	public static JFrame getWindow() {
		return window;
	}

	public void setWindow(JFrame window) {
		this.window = window;
	}

	public static int getxSize() {
		return xSize;
	}

	public static void setxSize(int xSize) {
		GameWindow.xSize = xSize;
	}

	public static int getySize() {
		return ySize;
	}

	public static void setySize(int ySize) {
		GameWindow.ySize = ySize;
	}

	public Dimension getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(Dimension screenSize) {
		this.screenSize = screenSize;
	}

	public void paint() {

		MovementInputs mi = MovementInputsSingleton.getInstance();
		
		window.setSize(xSize, ySize);
		window.setLocationRelativeTo(null);
		window.getContentPane().setBackground(new Color(Settings.getBgColor().getR(), Settings.getBgColor().getG(), Settings.getBgColor().getB()));
		window.setVisible(true);
		window.setResizable(false);
		// this.drawRacket.paintComponent(g);

		while (true) {
			window.add(drawBall);
			window.add(drawRacket);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			mi.mThread();
		}

	}
}
