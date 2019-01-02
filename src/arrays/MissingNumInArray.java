package arrays;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 3, 5, 7 };
		int b[] = { 2, 7, 1, 4, 3, 6 };
		findMissingSorted(a);
		findMissingUnsorted(b, 7);
		findUsingBitSet(new int[]{1, 2, 3, 5,4, 9, 8}, 10);

	}

	private static void findUsingBitSet(int[] b, int i) {
		int missingCount = i - b.length;
		BitSet bs = new BitSet(i);
		for (int number : b) {
			bs.set(number - 1);
		}

		System.out.printf("Missing numbers in integer array %s," + " with total number %d is %n", Arrays.toString(b),i);
		int lastMissingIndex = 0;
		for (int j = 0; j < missingCount; j++) {
			lastMissingIndex = bs.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}

	}

	private static void findMissingUnsorted(int[] b, int i) {
		int x = i;
		int sum = x * (x + 1) / 2;
		int actualSum = 0;
		for (int temp : b) {
			actualSum += temp;
		}
		System.out.println("missing : " + (sum - actualSum));
	}

	private static void findMissingSorted(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i + 1] == (a[i] + 1) || (a[i] == a[i + 1])) {
				System.out.println("ok");
			} else
				System.out.println(a[i] + 1);
		}

	}
}
