/**
  * This program sorts an array into ascending order
**/

public class SelectionSort {
	public static void main(String[] args) {
		int[] unSorted = {5, 7, 2, 8, 9, 1};

		// Display the unsorted array
		System.out.println("Displaying the unsorted array.");
		for(int index = 0; index < unSorted.length; index++) {
			System.out.print(unSorted[index] + " ");
		}
		System.out.println();

		int[] sorted = sortSelection(unSorted);

		// Display the sorted array
		System.out.println("Displaying the sorted array.");
		for(int index = 0; index < sorted.length; index++) {
			System.out.print(sorted[index] + " ");
		}
		System.out.println();
	}

	/**
	  * The sortSelection method performs a selection sort on
	  * an integer array, the array that is passed as an arrgument 
	  * is sorted in an ascending order
	  * @param array, The array to be sorted
	**/
	public static int[] sortSelection(int[] array) {
		
		int startScan, index, minIndex, minValue;
		for(startScan = 0; startScan < (array.length - 1); startScan++) {
			minIndex = startScan;
			minValue = array[startScan];
			for(index = (startScan + 1); index < array.length; index++) {
				if(array[index] < minValue) {
					minValue = array[index];
					minIndex = index;
				}
			}

			array[minIndex] = array[startScan];
			array[startScan] = minValue;
		}

		// Return the array
		return array;

	}

}

