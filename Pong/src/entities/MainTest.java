package entities;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import draw.GameWindow;
import movement.KeyboardInputsENUM;
import singleton.DrawPaddleSingleton;
import singleton.GameWindowSingleton;

public class MainTest {
	public static void main(String[] args) {
		GameWindow gw = GameWindowSingleton.getInstance();
		
		GameWindow.createAndShowGui();
	}
}