package problems1to9.problem6;

public class Problem6 {
	public static void main(String[] args) {
		int sumSquares = 1;
		int sum = 1;
		for (int i = 2; i < 101; i++) {
			sum += i;
			sumSquares += i * i;
		}
		
		System.out.println(sum * sum - sumSquares);
	}
}
