package ds.sorting;

public class InsertionSort {
	static int array[] = new int[] { 3, 4, 10, 8, 0, 12, 6 };

	public static void main(String[] args) {
		printArray(array);
		insertionSort(array);
		printArray(array);
	}

	private static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	private static void insertionSort(int[] array) {
		for(int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i;
			
			while(j>0 && (array[j-1] > temp)) {
				array[j] =  array[j-1];
				j--;
			}	
			
			array[j	] = temp;
		}
	}

	private static void swapValues(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
