package problems60to69.problem67;

import java.io.IOException;

import util.triangleSum.TriangleSum;

public class Problem67 {
	public static void main(String[] args) throws IOException {
		TriangleSum triangleSum = new TriangleSum("src/problems60to69/problem67/p067_triangle.txt");
		System.out.println(triangleSum.solve());
	}
}
