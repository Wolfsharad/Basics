package arrays;

public class SpiralOrder {
	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3 }, { 8, 9, 4 }, { 7, 6, 5 } };
		int matrixx[][] = { { 1, 2, 3, 5 }, { 8, 9, 9, 4 }, { 7, 6, 5, 7 } };
		//printSpiral(matrix, 3, 3);
		printSpiral(matrixx, 3, 4);

		 for (int i = 0; i < 3; i++) {
		 System.out.println();
		 for (int j = 0; j < 4; j++) {
		 System.out.print(matrix[i][j] + "\t");
		 }
		 }

	}

	static void printSpiral(int matrix[][], int m, int n) {
		int top, left = 0;
		int bottom = m - 1;
		int right = n - 1;
		int dir = 0;
	}
}
