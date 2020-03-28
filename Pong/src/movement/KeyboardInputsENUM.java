package movement;

public enum KeyboardInputsENUM {
	UP(38), DOWN(40);

	public final int VK;
	
	private KeyboardInputsENUM(int VK) {
		this.VK = VK;
	}
}
