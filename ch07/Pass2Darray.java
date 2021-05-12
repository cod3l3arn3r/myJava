/**
  * This program demonstrates methods that accept 2D arrays as an argument
**/

public class Pass2Darray {
	public static void main(String[] args) {

		int [][] numbersTwo = { {10, 20, 30, 40},
								{50, 60, 70, 80},
								{90, 92, 94, 96} };

		// Display the contents of the array
		System.out.println("Here are the values in the array.");
		showArray(numbersTwo);

		// Display the sum of the arrays values
		System.out.println("The sum of the values is: " + 
				arraySum(numbersTwo));

	}

	/**
	  * The showArray method displays the contents of 2D array
	  * @param array, the array to display
	**/
	public static void showArray(int[][] array) {
		for(int row = 0; row < array.length; row++) {
			for(int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + " ");
			}

			System.out.println();

		}

	}

	/**
	  * The show arraySum method returns the sum of the values in 
	  * 2D array
	  * @param array, The array to sum
	  * @return The sum of the array elements
	**/
	public static int arraySum(int[][] array) {
		int total = 0;	// Accumulator variable

		for(int row = 0; row < array.length; row++) {
			for(int col = 0; col < array[row].length; col++) {
				total += array[row][col];
			}

		}

		// Return the total
		return total;
	}

}
