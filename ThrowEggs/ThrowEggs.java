/*
 * Simulates a problem, calculating the probability
 * of eggs been broken when thrown from a window in 
 * a 6 story building
 */
public class ThrowEggs {

	public static void main(String[] args) {
		
		int lower = 0;
		int upper = 0;
		double i = 1.0;

		// Find upper bound from floor by doubling upper limit until an egg breaks;
		while (args[upper].equals("o")) {
			lower = upper;
			upper = new Double(Math.pow(2.0, i++)).intValue();
		}

		// now F lies between 2^i-1 and 2^i so binary search this area
		while (upper - lower > 1) {
			int pos = (upper - lower) / 2 + lower;
			if (args[pos].equals("b"))
				upper = pos;
			else
				lower = pos;
		}

		System.out.println(lower);

	}

}
