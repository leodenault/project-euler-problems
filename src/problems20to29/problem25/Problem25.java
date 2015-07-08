package problems20to29.problem25;

import java.math.BigInteger;

public class Problem25 {
	public static void main(String[] args) {
		int term = 2;

		BigInteger last = new BigInteger("1");
		BigInteger current = new BigInteger("1");
		BigInteger temp;
		
		while (current.toString().length() < 1000) {
			temp = current;
			current = current.add(last);
			last = temp;
			term++;
		}
		
		System.out.println(term);
	}
}
