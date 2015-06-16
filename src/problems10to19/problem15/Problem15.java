package problems10to19.problem15;

public class Problem15 {
	private static final int SIZE = 20;

	public static void main(String[] args) {
		double[][] grid = new double[SIZE + 1][];
		for (int k = 0; k < grid.length; k++) {
			grid[k] = new double[SIZE + 1];
		}
		
		for (int i = 0; i < SIZE + 1; i++) {
			for (int j = 0; j < SIZE + 1; j++) {
				if (i == 0 && j == 0) {
					grid[i + 1][j] += 1;
					grid[i][j + 1] += 1;
				} else {
					if (i < SIZE) {
						grid[i + 1][j] += grid[i][j];
					}
					
					if (j < SIZE) {
						grid[i][j + 1] += grid[i][j];
					}
				}
			}
		}
		
		System.out.format("%f", grid[SIZE][SIZE]);
	}
}
