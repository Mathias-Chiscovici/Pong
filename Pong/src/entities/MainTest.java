package entities;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;

import draw.GameWindow;
import movement.KeyboardInputsENUM;
import singleton.DrawRacketSingleton;
import singleton.GameWindowSingleton;

public class MainTest {
	public static void main(String[] args) {
		GameWindow gw = GameWindowSingleton.getInstance();
		
		gw.paint();
		//ciao
	}
}