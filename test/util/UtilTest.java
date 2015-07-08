package util;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Test;

public class UtilTest {
	
	@Test
	public void calculatePrimesShouldFindPrimesFromZeroToMax() {
		assertThat(Util.calculatePrimes(new LinkedList<Integer>(), 43), is(Arrays.asList(
				2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43)));
	}
	
	@Test
	public void calculatePrimesShouldFindPrimesFromMinToMax() {
		LinkedList<Integer> previousPrimes = new LinkedList<Integer>();
		previousPrimes.add(2);
		previousPrimes.add(3);
		previousPrimes.add(5);
		previousPrimes.add(7);
		assertThat(Util.calculatePrimes(previousPrimes, 43), is(Arrays.asList(
				2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43)));
	}
	
	@Test
	public void calculatePrimesShouldFindAllNumberOfRequestedPrimes() {
		assertThat(Util.calculatePrimes(2), is(Arrays.asList(2, 3)));
		assertThat(Util.calculatePrimes(4), is(Arrays.asList(2, 3, 5, 7)));
		assertThat(Util.calculatePrimes(6), is(Arrays.asList(2, 3, 5, 7, 11, 13)));
		assertThat(Util.calculatePrimes(10), is(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)));
	}
	
	@Test
	public void isPrimeShouldReturnTrueForPrimeNumbers() {
		assertThat(Util.isPrime(3), is(true));
		assertThat(Util.isPrime(43), is(true));
		assertThat(Util.isPrime(5), is(true));
		assertThat(Util.isPrime(13), is(true));
		assertThat(Util.isPrime(47), is(true));
	}
	
	@Test
	public void isPrimeShouldReturnFalseForCompoundNumbers() {
		assertThat(Util.isPrime(4), is(false));
		assertThat(Util.isPrime(45), is(false));
		assertThat(Util.isPrime(63), is(false));
		assertThat(Util.isPrime(12), is(false));
		assertThat(Util.isPrime(21), is(false));
	}
	
	@Test
	public void divisorsShouldReturnAllDivisorsForNumber() {
		assertThat(Util.divisors(10), is(Arrays.asList(1, 2, 5, 10)));
		assertThat(Util.divisors(15), is(Arrays.asList(1, 3, 5, 15)));
		assertThat(Util.divisors(20), is(Arrays.asList(1, 2, 4, 5, 10, 20)));
		assertThat(Util.divisors(25), is(Arrays.asList(1, 5, 25)));
		assertThat(Util.divisors(32), is(Arrays.asList(1, 2, 4, 8, 16, 32)));
	}
}
