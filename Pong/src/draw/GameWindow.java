package draw;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import entities.Settings;
import singleton.GameWindowSingleton;

public class GameWindow extends JPanel{

	private static final int HEIGHT = 400;
	private static final int WIDTH = 600;
	private static final int TIMER_DELAY = 20;
	private Image background = null;
	private Color color = Settings.getBgColor();


	public void setBackground(Image background) {
		this.background = background;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	public int getHeight() {
		return HEIGHT;
	}


	public int getWidth() {
		return WIDTH;
	}


	public static int getTimerDelay() {
		return TIMER_DELAY;
	}


	public GameWindow() {
		background = createBackground();
		new Timer(TIMER_DELAY, new TimerListener()).start();
	}
	
	
	private Image createBackground() {
		BufferedImage img = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_4BYTE_ABGR);
		Graphics2D g2 = img.createGraphics();
		g2.setColor(color);
		g2.fillRect(0, 0, WIDTH, HEIGHT);
		g2.dispose();
		return img;
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(background != null)
			g.drawImage(background, 0,0,this);
	}
	
	private class TimerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }
	
	public Dimension getPreferredSize() {
		if(isPreferredSizeSet()) {
			return super.getPreferredSize();
		}else {
			return new Dimension(WIDTH, HEIGHT);
		}
	}
	
	public static void createAndShowGui() {
		GameWindow gw = GameWindowSingleton.getInstance();
		JFrame frame = new JFrame("PONG");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(gw);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
