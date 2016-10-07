package terning;

public class Dice {
	// roll the die and return the value (1-8)
	public int roll() {
		float d1=(float)Math.random();     // 0-1
		float d2=d1*7;                     // 0-7
		int d3=Math.round(d2);             // 0-7 integer
		return d3 + 1;                     // 1-8		
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=1; i<n; i++) {
			System.out.print(roll() + " ");
		}		
	}
}
