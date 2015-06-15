package problems1to9.problem2;

import java.util.LinkedList;
import java.util.List;

public class Problem2 {
	public static void main(String args[]) {
		int sum = 0;
		for (int term : findEvenFibonacciTerms(4000000)) {
			sum += term;
		}
		System.out.println(sum);
	}
	
	protected static List<Integer> findEvenFibonacciTerms(int maxValue) {
		List<Integer> terms = new LinkedList<Integer>();
		int last = 1;
		for (int current = 2; current < maxValue;) {
			if (current % 2 == 0) {
				terms.add(current);
			}
			int temp = current;
			current += last;
			last = temp;
			
		}
		return terms;
	}
}
