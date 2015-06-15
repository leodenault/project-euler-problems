package problems1to9.problem3;


public class Problem3 {
	
	public static void main(String args[]) {
		System.out.println(largestPrimeFactor(600851475143l));
	}
	
	protected static int extractSmallestMultiple(long number) {
		int i = 2;
		for (; i < number; i++) {
			if (number % i == 0) {
				break;
			}
		}
		return i;
	}
	
	protected static int largestPrimeFactor(long number) {
		int factor;
		while ((factor = extractSmallestMultiple(number)) != number) {
			number /= factor;
		}
		return (int)number;
	}
}
