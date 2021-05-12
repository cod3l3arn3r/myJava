/**
  * This program uses the length field of two dimensional arrays
  * to display the number of raws, and the number of columns
**/

public class Lengths {
	public static void main(String[] args) {

		// Declare a 2D array with 3 rows and 4 colums
		int[][] numbers = { {1, 2, 3, 4},
							{5, 6, 7, 8},
							{9, 10, 11, 12} };

		// Display the number of rows
		System.out.println("The number of rows are: " +
				numbers.length);

		// Display the number of columns in each row
		for(int index = 0; index < numbers.length; index++) {
			System.out.println("The number of colums in row " +
					index + " is: " + numbers[index].length);
		}

		// Display all the elements in the numbers array
		for(int row = 0; row < numbers.length; row++) {
			for(int col = 0; col < numbers[row].length; col++) {
				System.out.print(numbers[row][col]  + " ");
			}
			System.out.println();
		}

		double totalElements = 0.0;	// Adds all the elements in 2D array
		totalElements = getElementsSum(numbers);
		
		// Display the total of all elements in the array
		System.out.println("The sum of the all elements are: " +
				totalElements);

		// Summing the rows of two dimensional array
		getSumRows(numbers);

		// Summing the columns of two dimensional array
		getSumColumns(numbers);

	}

	/**
	  * The getElementsSum() adds all the elements in 2D array
	  * @param array, the array elements to be added
	  * @return returns the the sum of the elements in the array
	**/
	public static int getElementsSum(int[][] array) {

		int sum = 0; // The accumulator variable

		// Add all the elements
		for(int row = 0; row < array.length; row++) {
			for(int col = 0; col < array[row].length; col++) {
				sum += array[row][col];
			}
		}

		// return the array sum
		return sum;
	}

	/**
	  * The getSumRows() method sums the raws of each row in 2D array
	  * @param array, the array which rows to add the rows
	**/
	public static void getSumRows(int[][] array) {

		int sum;

		for(int row = 0; row < array.length; row++) {
			sum = 0;
			for(int col = 0; col < array[row].length; col++) {
				sum += array[row][col];
			}

			// Display the rows total
			System.out.println("The total row " + row +
					" is: " + sum);
		}

	}
	
	/**
	  * The getSumColumns() method sums the columns of each column in 2D array
	  * @param array, the array which columns to add the columns
	**/
	public static void getSumColumns(int[][] array) {

		int sum;

		for(int col = 0; col < array[0].length; col++) {
			sum = 0;
			for(int row = 0; row < array.length; row++) {
				sum += array[row][col];
			}

			// Display the rows total
			System.out.println("The total column " + col +
					" is: " + sum);
		}

	}

}


