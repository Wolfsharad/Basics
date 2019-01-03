package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SumPairs {

	public static void main(String[] args) {
		findSumPair(new int[] { 5, 6, 7, 9, 1 }, 10);
		findSumPairOptimal(new int[] { 5, 6, 7, 9, 1 }, 10);
	}

	private static void findSumPairOptimal(int[] is, int i) {
		if(is.length < 2){
            return;
        }
		Arrays.sort(is);
		int left = 0;
		int right = is.length - 1;
		while (left < right) {
			int sum = is[left] + is[right];
			if (sum == i) {
				System.out.println("Pair " + is[left] + " " + is[right]);
				left = left +1;
				right = right - 1;
			}
			
			else if(sum < i)
				left = left + 1;	
			
			else if (sum > i)
				right = right - 1;
			
			
		}
	}

	private static void findSumPair(int[] is, int i) {
		Set set = new HashSet(is.length);
		for (int value : is) {
			int target = i - value;

			// if target number is not in set then add
			if (!set.contains(target)) {
				set.add(value);
			} else {
				System.out.printf("(%d, %d) %n", value, target);
			}
		}
	}

}
