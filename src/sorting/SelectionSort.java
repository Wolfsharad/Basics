package sorting;

public class SelectionSort {
	static int array[] = new int[] { 3, 4, 10, 8, 0, 12, 6 };
	public static void main(String[] args) {
		
		printArray(array);
		
		selectionSort(array);
		printArray(array);
	}

	private static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

	private static void selectionSort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			int min = i;
			for(int j =i; j<array.length;j++) {
				if(array[min] > array[j])
					min = j;
			}
			swapValues(i , min);
		}

	}

	private static void swapValues(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
