package patterns;

import java.util.Scanner;

public class GolfScorePattern {
	public static void main(String[] a) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int t[] = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = s.nextInt();
		}
		int v;

		for (int i = 0; i < n; i++) {
			v = t[i];
			int z = (v * 2) - 1;
			int[][] b = p(v, z);
			r(b, z);
		}
	}

	static void r(int[][] a, int z) {
		for (int i = 0; i < z; i++) {
			for (int j = 0; j < z; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int[][] p(int v, int z) {
		int[][] a = new int[z][z];

		for (int w = 0; w < v; w++) {
			for (int i = 0 + w; i < z - w; i++) {
				for (int j = 0 + w; j < z - w; j++) {
					if ((i == 0 + w) || (i == z - 1 - w)) {
						a[i][j] = v - w;
					} else if ((j == 0 + w) || (j == z - 1 - w)) {
						a[i][j] = v - w;
					}
				}
			}
		}

		return a;
	}
}
