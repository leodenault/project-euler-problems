package problems1to9.problem1;

import java.util.LinkedList;
import java.util.List;

public class Problem1 {
	public static void main(String args[]) {
		int sum = 0;
		for (int multiple : findMultiples(1000)) {
			sum += multiple;
		}
		System.out.println(sum);
	}
	
	protected static List<Integer> findMultiples(int max) {
		List<Integer> multiples = new LinkedList<Integer>();
		
		for (int i = 1; i < max; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				multiples.add(i);
			}
		}
		
		return multiples;
	}
}
