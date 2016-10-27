package test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import terning.Dice;

public class DiceTest {
	
	@Before
	public void setUp() throws Exception {}
	
	@After
	public void tearDown() throws Exception {}
	
	@Test
	public void testRoll() {
		Dice die = new Dice();
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int other = 0;
		for (int i = 0; i < 60000; i++){
			int roll = die.roll();
			if (roll == 1) one++;
			else if (roll == 2) two++;
			else if (roll == 3) three++;
			else if (roll == 4) four++;
			else if (roll == 5) five++;
			else if (roll == 6) six++;
			else other++;
		}
		assertTrue((one > 9600) && (one < 10400));
		assertTrue((two > 9600) && (two < 10400));
		assertTrue((three > 9600) && (three < 10400));
		assertTrue((four > 9600) && (four < 10400));
		assertTrue((five > 9600) && (five < 10400));
		assertTrue((six > 9600) && (six < 10400));
		assertTrue(other == 0);
	}
	
}
