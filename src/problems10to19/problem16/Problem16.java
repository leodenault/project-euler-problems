package problems10to19.problem16;

public class Problem16 {
	public static void main(String[] args) {
		final int base = 2;
		final int pow = 1000;
		final int digits = (int)Math.ceil(Math.log(Math.pow(base, pow)));
		int[] result = new int[digits];
		result[0] = 1;
		
		for (int i = 0; i < pow; i++) {
			int carry = 0;
			for (int j = 0; j < digits; j++) {
				int doubled = result[j] * base + carry;
				result[j] = doubled % 10;
				carry = doubled / 10;
				System.out.print("["+result[j]+"]");
			}
			System.out.println();
		}
		
		int sum = 0;
		for (int i = 0; i < digits; i++) {
			sum += result[i];
		}
		System.out.println(sum);
	}
}
