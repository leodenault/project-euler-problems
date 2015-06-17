package problems10to19.problem18;

public class Problem18 {
	private static final int[][] TRIANGLE = new int[][] {
			new int[] { 75, },
			new int[] { 95, 64 },
			new int[] { 17, 47, 82 },
			new int[] { 18, 35, 87, 10 },
			new int[] { 20, 04, 82, 47, 65 },
			new int[] { 19, 01, 23, 75, 03, 34 },
			new int[] { 88, 02, 77, 73, 07, 63, 67 },
			new int[] { 99, 65, 04, 28, 06, 16, 70, 92 },
			new int[] { 41, 41, 26, 56, 83, 40, 80, 70, 33 },
			new int[] { 41, 48, 72, 33, 47, 32, 37, 16, 94, 29 },
			new int[] { 53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14 },
			new int[] { 70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57 },
			new int[] { 91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48 },
			new int[] { 63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31 },
			new int[] { 04, 62, 98, 27, 23,  9, 70, 98, 73, 93, 38, 53, 60, 04, 23 }
	};
	
	public static void main(String[] args) {
		int[][] sums = new int[TRIANGLE.length][];
		for (int i = 0; i < sums.length; i++) {
			sums[i] = new int[i + 1];
		}
		
		for (int j = 0; j < sums.length; j++) {
			for (int k = 0; k < sums[j].length; k++) {
				sums[j][k] = Math.max(leftParentSum(sums, j, k), rightParentSum(sums, j, k)) + TRIANGLE[j][k];
				System.out.print(sums[j][k] + " ");
			}
			System.out.println();
		}
		
		int max = 0;
		for (int l = 0; l < sums[sums.length - 1].length; l++) {
			if (max < sums[sums.length - 1][l]) {
				max = sums[sums.length - 1][l];
			}
		}
		System.out.println(max);
	}
	
	private static int leftParentSum(int[][] sums, int row, int col) {
		return row > 0 && col > 0 ? sums[row - 1][col - 1] : 0;
	}
	
	private static int rightParentSum(int[][] sums, int row, int col) {
		return row > 0 && col < row ? sums[row - 1][col] : 0;
	}
}
