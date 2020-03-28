package entities;

import java.awt.color.*;

import singleton.ColorSingleton;

public class Settings {
	private static Color bgColor = ColorSingleton.getInstance(0, 0, 0);
	private static Color enititiesColor = ColorSingleton.getInstance(255, 255, 255);
	
	public static Color getBgColor() {
		return bgColor;
	}

	public void setBgColor(Color bgColor) {
		this.bgColor = bgColor;
	}

	public static Color getEnititiesColor() {
		return enititiesColor;
	}

	public void setEnititiesColor(Color enititiesColor) {
		this.enititiesColor = enititiesColor;
	}

	@Override
	public String toString() {
		return "Settings [bgColor=" + bgColor + ", enititiesColor=" + enititiesColor + "]";
	}

}
