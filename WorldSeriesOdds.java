package WorldSeriesOddsProject;

public class WorldSeriesOdds {
	// compute the p by using recursion
	public static double pRec(int i, int j) {
		if (i == 0 && j > 0) {
			return 1;
		} else if (j == 0 && i > 0) {
			return 0;
		} else {
			return (pRec(i - 1, j) + pRec(i, j - 1)) / 2;
		}
	}

	// compute the p by dynamic programming
	public static double pDyn(int i, int j) {
		double[][] arr = new double[j + 1][i + 1];
		for (int a = 1; a <= j; a++) {
			arr[a][0] = 1;
		}
		for (int b = 1; b <= i; b++) {
			arr[0][b] = 0;
		}

		for (int x = 1; x <= i; x++) {
			for (int y = 1; y <= j; y++) {
				arr[y][x] = (arr[y - 1][x] + arr[y][x - 1]) / 2;
			}
		}
		return arr[j][i];
	}

	public static void main(String[] args) {
		long startTime;
		long endTime;

		System.out.println("P(2, 3)");
		startTime = System.currentTimeMillis();
		System.out.println(pDyn(2, 3));
		endTime = System.currentTimeMillis();
		System.out.println("running time = " + (endTime - startTime) / 1000 + "s");

		System.out.println("P(4, 7)");
		startTime = System.currentTimeMillis();
		System.out.println(pDyn(4, 7));
		endTime = System.currentTimeMillis();
		System.out.println("running time = " + (endTime - startTime) / 1000 + "s");

		System.out.println("P(7, 6)");
		startTime = System.currentTimeMillis();
		System.out.println(pDyn(7, 6));
		endTime = System.currentTimeMillis();
		System.out.println("running time = " + (endTime - startTime) / 1000 + "s");

		System.out.println("P(10, 12)");
		startTime = System.currentTimeMillis();
		System.out.println(pDyn(10, 12));
		endTime = System.currentTimeMillis();
		System.out.println("running time = " + (endTime - startTime) / 1000 + "s");

		System.out.println("P(20, 23)");
		startTime = System.currentTimeMillis();
		System.out.println(pDyn(20, 23));
		endTime = System.currentTimeMillis();
		System.out.println("running time = " + (endTime - startTime) / 1000 + "s");

		System.out.println("P(30, 15)");
		startTime = System.currentTimeMillis();
		System.out.println(pDyn(30, 15));
		endTime = System.currentTimeMillis();
		System.out.println("running time = " + (endTime - startTime) / 1000 + "s");

		System.out.println("P(50, 40)");
		startTime = System.currentTimeMillis();
		System.out.println(pDyn(50, 40));
		endTime = System.currentTimeMillis();
		System.out.println("running time = " + (endTime - startTime) / 1000 + "s");
		
		

	}

}
