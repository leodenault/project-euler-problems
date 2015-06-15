package problems10to19.problem12;

import util.Util;


public class Problem12 {
	public static void main(String[] args) {
		int current = 0;
		for (int i = 1;; i++) {
			current += i;
			if (Util.divisors(current).size() > 500) {
				System.out.println(current);
				return;
			}
		}
	}
}
