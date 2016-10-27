package terning;

import java.util.Random;

public class Dice {
	// roll the die and return the value (1-8)
	public int roll() {
		Random rng = new Random();
		return rng.nextInt(6) + 1; // 1-6
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=1; i<n; i++) {
			System.out.print(roll() + " ");
		}		
	}
}
