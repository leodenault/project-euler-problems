package problems20to29.problem23;

import java.util.LinkedList;
import java.util.List;

import util.Util;

public class Problem23 {
	// All numbers greater than this are the sum of two abundant numbers
	private static final int ABUNDANT_BASELINE = 28123;
	
	public static void main(String[] args) {
		Integer[] abundantNumbers = computeAbundantNumbers(ABUNDANT_BASELINE);
		// If true, the index of the element is the sum of two abundant numbers
		boolean[] abundantSums = new boolean[ABUNDANT_BASELINE + 1];
		
		for (int i = 0; i < abundantNumbers.length; i++) {
//			System.out.println(abundantNumbers[i]);
			for (int j = i;
					j < abundantNumbers.length
					&& abundantNumbers[i] + abundantNumbers[j] <= ABUNDANT_BASELINE;
					j++) {
				abundantSums[abundantNumbers[i] + abundantNumbers[j]] = true;
			}
		}
		
		int sum = 0;
		for (int k = 0; k < abundantSums.length; k++) {
			if (!abundantSums[k]) {
				System.out.println(k);
				sum += k;
			}
		}
		System.out.println(sum);
	}
	
	private static Integer[] computeAbundantNumbers(int max) {
		LinkedList<Integer> abundantNumbers = new LinkedList<Integer>();
		for (int i = 12; i <= max; i++) {
			List<Integer> divisors = Util.divisors(i);
			divisors.remove(divisors.size() - 1);
			
			int sum = 0;
			for (int divisor : divisors) {
				sum += divisor;
				if (sum > i) {
					abundantNumbers.add(i);
					break;
				}
			}
		}
		Integer[] array = new Integer[abundantNumbers.size()];
		return abundantNumbers.toArray(array);
	}
}
