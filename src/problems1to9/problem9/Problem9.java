package problems1to9.problem9;

public class Problem9 {
	public static void main(String[] args) {
		long total = 0;
		for (int i = 0; i < 1000; i++) {
			long start = System.currentTimeMillis();
//			bad();
			good();
			long end = System.currentTimeMillis();
			total += end-start;
		}
		System.out.println(String.format("Total time: %fs\nAverage time: %fms", total/1000.0, total/500.0));
	}
	
	private static void bad() {
		for (int c = 1; c < 1000; c++) {
			for (int b = 1; b < 1000; b++) {
				for (int a = 1; a < 1000; a++) {
					if (a+b+c == 1000 && a*a + b*b == c*c) {
						//System.out.println(String.format("%d x %d x %d = %d", a, b, c, a*b*c));
						return;
					}
				}
			}
		}
	}
	
	private static void good() {
		for (int c = 997; c > 333; c--) {
			int b = 1000 - c - 1;
			int a = 1;
			
			while (a < b) {
				if (a+b+c == 1000 && a*a + b*b == c*c) {
					//System.out.println(String.format("%d x %d x %d = %d", a, b, c, a*b*c));
					return;
				}
				
				b--;
				a++;
			}
		}
		
	}
}
