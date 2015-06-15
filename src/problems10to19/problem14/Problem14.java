package problems10to19.problem14;



public class Problem14 {
	public static void main(String[] args) {
		CollatzPair max = new CollatzPair(0, 0);
		double current;
		int steps;
		
		for (int i = 1; i < 10000000; i++) {
			current = i;
			steps = 0;
			while (current != 1) {
				steps++;
				if (current % 2 == 1) {
					current = 3 * current + 1;
				}
				current /= 2;
			}
			
			if (max.steps < steps) {
				max = new CollatzPair(i, steps);
			}
		}

		System.out.println(String.format("Seed %d generated %d steps", max.seed, max.steps));
	}
}
