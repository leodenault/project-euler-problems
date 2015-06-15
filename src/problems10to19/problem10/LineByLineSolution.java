package problems10to19.problem10;

import util.Solution;

public class LineByLineSolution implements Solution<Integer> {

	private int[][] grid;
	
	public LineByLineSolution(int[][] grid) {
		this.grid = grid;
	}
	
	@Override
	public Integer solve() {
		int columnsResult = columns();
		int rowsResult = rows();
		int diagonalsResult = diagonals();
		return columnsResult > rowsResult ?
				(diagonalsResult > columnsResult ? diagonalsResult : columnsResult) :
					(diagonalsResult > rowsResult ? diagonalsResult : rowsResult);
	}

	private int columns() {
		int product = 0;
		for (int i = 0; i < grid.length - 3; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				int current = grid[i][j] * grid[i+1][j] * grid[i+2][j] * grid[i+3][j];
				if (current > product) {
					product = current;
				}
			}
		}
		return product;
	}
	
	private int rows() {
		int product = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length - 3; j++) {
				int current = grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+3];
				if (current > product) {
					product = current;
				}
			}
		}
		return product;
	}
	
	private int diagonals() {
		int right = diagonalRight();
		int left = diagonalLeft();
		return right > left ? right : left;
	}
	
	private int diagonalRight() {
		int product = 0;
		int i = grid.length - 3;
		int j = 0;
		
		// Bottom left half
		while (i > 0) {
			int k = i;
			int l = j;
			
			while (k < grid.length - 3) {
				int current = grid[k][l] * grid[k+1][l+1] * grid[k+2][l+2] * grid[k+3][l+3];
				if (current > product) {
					product = current;
				}
				k++;
				l++;
			}
			
			i--;
		}
		
		// Top right half
		while (j < grid[0].length - 3) {
			int k = i;
			int l = j;
			
			while (l < grid[i].length - 3) {
				int current = grid[k][l] * grid[k+1][l+1] * grid[k+2][l+2] * grid[k+3][l+3];
				if (current > product) {
					product = current;
				}
				k++;
				l++;
			}
			
			j++;
		}
		return product;
	}
	
	private int diagonalLeft() {
		int product = 0;
		int i = 0;
		int j = 3;
		
		// Top left half
		while (j < grid[i].length - 1) {
			int k = i;
			int l = j;
			
			while (l > 2) {
				int current = grid[k][l] * grid[k+1][l-1] * grid[k+2][l-2] * grid[k+3][l-3];
				if (current > product) {
					product = current;
				}
				k++;
				l--;
			}
			
			j++;
		}
		
		// Bottom right half
		while (i < grid.length - 3) {
			int k = i;
			int l = j;
			
			while (k < grid.length - 3) {
				int current = grid[k][l] * grid[k+1][l-1] * grid[k+2][l-2] * grid[k+3][l-3];
				if (current > product) {
					product = current;
				}
				k++;
				l--;
			}
			
			i++;
		}
		return product;
	}
}
