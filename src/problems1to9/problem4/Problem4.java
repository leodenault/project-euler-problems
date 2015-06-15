package problems1to9.problem4;

public class Problem4 {
	
	public static void main(String args[]) {
		int max = 0;
		int one = 0;
		int two = 0;
		
		for (int i = 999; i > 0; i--) {
			for (int j = i; j > i - 100 && j > 0; j--) {
				if (isPalindrome(String.valueOf(i*j)) && i*j > max) {
					one = i;
					two = j;
					max = i*j;
				}
			}
		}
		System.out.println(String.format("%d x %d: %d", one, two, max));
	}
	
	protected static boolean isPalindrome(String sequence) {
		return sequence.equals(new StringBuilder(sequence).reverse().toString());
	}
}
