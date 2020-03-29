package drawOld;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

import entities.Settings;
import movement.MovementInputs;
import singleton.DrawBallSingleton;
import singleton.DrawPaddleSingleton;
import singleton.MovementInputsSingleton;

public class GameWindow extends JFrame{
	private static JFrame window = new JFrame("PONG");
	private static int xSize = 600;
	private static int ySize = 400;
	private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private DrawRacket drawRacket = DrawPaddleSingleton.getInstance();
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

		Image background = createImage(xSize, ySize);
		MovementInputs mi = MovementInputsSingleton.getInstance();
		this.drawImage();
		window.setSize(xSize, ySize);
		window.setLocationRelativeTo(null);
		window.getContentPane().setBackground(new Color(Settings.getBgColor().getR(), Settings.getBgColor().getG(), Settings.getBgColor().getB()));
		window.setVisible(true);
		window.setResizable(false);

		while (true) {
			window.add(drawBall);
			window.add(drawRacket);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			mi.mThread();
		}

	}
}
