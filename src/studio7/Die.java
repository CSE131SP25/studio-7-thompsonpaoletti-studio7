package studio7;

public class Die {
	private int numSides;
	
	public Die (int n) {
		this.numSides = n;
	}
	
	public int dieRoll(int n) {
		return (int) (Math.random() * n + 1);
	}
}
