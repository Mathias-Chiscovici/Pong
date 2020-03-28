package draw;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

import entities.Ball;
import entities.Racket;
import entities.Settings;
import singleton.BallSingleton;
import singleton.RacketSingleton;

public class DrawBall  extends JPanel{
	private Ball ball = BallSingleton.getInstance();
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillArc(ball.getX(), ball.getY(), Ball.getSize(), Ball.getSize(), 0, (int)(2*Math.PI));
		g.setColor(new Color(ball.getColor().getR(), ball.getColor().getG(), ball.getColor().getB()));
	}

	public Ball getBall() {
		return ball;
	}

	public void setBall(Ball ball) {
		this.ball = ball;
	}
}
