package util;
import java.util.LinkedList;
import java.util.List;


public class Util {
	public static List<Integer> calculatePrimes(int numPrimes) {
		List<Integer> primes = new LinkedList<Integer>();
		boolean isPrime;
		
		for (int i = 2; primes.size() < numPrimes; i++) {
			isPrime = true;
			
			for (Integer prime : primes) {
				if (i % prime == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				primes.add(i);
			}
		}
		
		return primes;
	}
	
	public static List<Integer> calculatePrimes(List<Integer> previousPrimes, int max) {
		int current = previousPrimes.isEmpty() ? 2 : previousPrimes.get(previousPrimes.size() - 1) + 1;
		
		boolean isPrime;
		for (; current <= max; current++) {
			isPrime = true;
			for (int prime : previousPrimes) {
				if (current % prime == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				previousPrimes.add(current);
			}
		}
		
		return previousPrimes;
	}
	
	public static boolean isPrime(int number) {
		return isPrime(new LinkedList<Integer>(), number);
	}
	
	public static boolean isPrime(List<Integer> previousPrimes, int number) {
		calculatePrimes(previousPrimes, number);
		return number == previousPrimes.get(previousPrimes.size() - 1);
	}
	
	public static List<Integer> divisors(int number) {
		LinkedList<Integer> divisors1 = new LinkedList<Integer>();
		LinkedList<Integer> divisors2 = new LinkedList<Integer>();
		double sqrt = Math.sqrt(number);
		
		for (int i = 1; i < sqrt; i++) {
			if (number % i == 0) {
				divisors1.add(i);
				divisors2.add(0, number / i);
			}
		}
		
		if (sqrt % 1 == 0) {
			divisors1.add((int)sqrt);
		}
		
		divisors1.addAll(divisors2);
		return divisors1;
	}
}
