package problems10to19.problem10;

import java.util.LinkedList;
import java.util.List;

import util.Util;

public class Problem10 {
	public static void main(String[] args) {
		List<Integer> primes = Util.calculatePrimes(new LinkedList<Integer>(), 2000000);
		long sum = 0;
		System.out.println("Calculated primes...");
		for (Integer prime : primes) {
			sum += prime;
		}
		System.out.println(sum);
	}
}
