package util.triangleSum;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TriangleSumTest {

	@Test
	public void solveShouldReturnMaxSumOfPathsThroughTriangle() {
		TriangleSum triangleSum = new TriangleSum(new int[][] {
			new int[] { 1 },
			new int[] { 2, 3 },
			new int[] { 4, 5, 6 },
		});
		assertThat(triangleSum.solve(), is(10));
		
		triangleSum = new TriangleSum(new int[][] {
				new int[] { 1 },
				new int[] { 3, 2 },
				new int[] { 9, 4, 5 },
		});
		assertThat(triangleSum.solve(), is(13));
		
		triangleSum = new TriangleSum(new int[][] {
				new int[] { 1 },
				new int[] { 2, 3 },
				new int[] { 4, 123, 6 },
		});
		assertThat(triangleSum.solve(), is(127));
	}

}
