package problems1to9.problem5;


public class Problem5 {
	public static void main(String[] args) {
		boolean evenlyDivisible;
		for (int i = 21;; i++) {
			evenlyDivisible = true;
			for (int j = 2; j < 21; j++) {
				if (i % j != 0) {
					evenlyDivisible = false;
					break;
				}
			}
			
			if (evenlyDivisible) {
				System.out.println(i);
				break;
			}
		}
	}
}
