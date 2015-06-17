package util.triangleSum;

import java.io.IOException;

import util.Solution;

public class TriangleSum implements Solution<Integer> {
	
	private int[][] triangle;
	
	public TriangleSum(int[][] triangle) {
		this.triangle = triangle;
	}
	
	public TriangleSum(String file) throws IOException {
		TriangleParser parser = new TriangleParser(file);
		triangle = parser.parse();
	}
	
	public Integer solve() {
		int[][] sums = new int[triangle.length][];
		for (int i = 0; i < sums.length; i++) {
			sums[i] = new int[i + 1];
		}
		
		for (int j = 0; j < sums.length; j++) {
			for (int k = 0; k < sums[j].length; k++) {
				sums[j][k] = Math.max(leftParentSum(sums, j, k), rightParentSum(sums, j, k)) + triangle[j][k];
			}
		}
		
		int max = 0;
		for (int l = 0; l < sums[sums.length - 1].length; l++) {
			if (max < sums[sums.length - 1][l]) {
				max = sums[sums.length - 1][l];
			}
		}
		return max;
	}
	
	private int leftParentSum(int[][] sums, int row, int col) {
		return row > 0 && col > 0 ? sums[row - 1][col - 1] : 0;
	}
	
	private int rightParentSum(int[][] sums, int row, int col) {
		return row > 0 && col < row ? sums[row - 1][col] : 0;
	}
}
