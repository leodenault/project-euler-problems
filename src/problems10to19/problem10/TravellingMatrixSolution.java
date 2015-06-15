package problems10to19.problem10;

import util.Solution;

public class TravellingMatrixSolution implements Solution<Integer> {

	private int[][] grid;
	
	public TravellingMatrixSolution(int[][] grid) {
		this.grid = grid;
	}
	
	@Override
	public Integer solve() {
		int product = 0;
		for (int i = 0; i < grid.length - 3; i++) {
			for (int j = 0; j < grid[i].length - 3; j++) {
				int current = computeMatrix(i, j);
				if (product < current) {
					product = current;
				}
			}
		}
		
		return product;
	}

	private int computeMatrix(int i, int j) {
		int row = grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3];
		int col = grid[i][j] * grid[i + 2][j] * grid[i + 2][j] * grid[i + 3][j];
		int diagRight = grid[i][j] * grid[i + 1][j + 1] * grid[i + 2][j + 2] * grid[i + 3][j + 3];
		int diagLeft = grid[i][j + 3] * grid[i + 1][j + 2] * grid[i + 2][j + 1] * grid[i + 3][j];
		
		int max1 = row > col ? row : col;
		int max2 = diagRight > diagLeft ? diagRight : diagLeft;
		
		return max1 > max2 ? max1 : max2;
	}
}
