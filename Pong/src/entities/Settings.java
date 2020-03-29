package entities;

import java.awt.Color;
import java.awt.color.*;


public class Settings {
	private static Color bgColor = new Color(0,0,0);
	private static Color entitiesColor = new Color(255,255,255);
	
	public static Color getBgColor() {
		return bgColor;
	}

	public void setBgColor(Color bgColor) {
		this.bgColor = bgColor;
	}

	public static Color getEntitiesColor() {
		return entitiesColor;
	}

	public void setEnititiesColor(Color entitiesColor) {
		this.entitiesColor = entitiesColor;
	}

	@Override
	public String toString() {
		return "Settings [bgColor=" + bgColor + ", entitiesColor=" + entitiesColor + "]";
	}

}
