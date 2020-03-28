package entities;

public class Player {
	private String username;
	private int hashCodedPassword;
	private int wins;
	private int losses;
	private double winrate;
	private Settings playerSettings;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setHashCodedPassword(String password) {
		this.hashCodedPassword = (int) password.hashCode();
	}

	public int getWins() {
		return wins;
	}

	public void setWinsLosses(boolean win) {
		if (win)
			this.wins += 1;
		else if (!win)
			this.losses += 1;
	}

	public int getLosses() {
		return losses;
	}

	public double getWinrate() {
		return winrate;
	}

	public void calculateWinrate() {
		this.winrate = Math.round((getWins() / getLosses()) * 10) / 10.0;
	}

	public Settings getPlayerSettings() {
		return playerSettings;
	}

	public void setPlayerSettings(Settings playerSettings) {
		this.playerSettings = playerSettings;
	}

	@Override
	public String toString() {
		return "Player [username=" + username + ", wins=" + wins + ", winrate=" + winrate + "]";
	}
}
