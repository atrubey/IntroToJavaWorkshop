package Level0Practice;

public class BubbleSortAlgorithm {
	public static void main(String[] args) {

		int array[] = { 6, 2, 3, 10, 23, 5, 1, 73, 2 };

		printArray(array);

		bubbleSort(array);

		printArray(array);
	}

	private static void bubbleSort(int[] array) {
		boolean madeASwap;
		int temp;

		do {
			madeASwap = false;

			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					madeASwap = true;
				}
			}

		} while (madeASwap);
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
	}

}
