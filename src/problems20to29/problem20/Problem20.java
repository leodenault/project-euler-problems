package problems20to29.problem20;

import java.math.BigInteger;

public class Problem20 {
	public static void main(String[] args) {
		BigInteger number = new BigInteger("1");
		
		for (int i = 2; i <= 100; i++) {
			BigInteger eye = new BigInteger(String.valueOf(i));
			number = number.multiply(eye);
		}
		
		long sum = 0;
		for (char c : number.toString().toCharArray()) {
			sum += Integer.parseInt(String.valueOf(c));
		}
		System.out.println(sum);
	}
}
