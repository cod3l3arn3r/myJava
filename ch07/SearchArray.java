/**
 * This program sequentially searches an int array for
 * specified value
*/

public class SearchArray {
	public static void main(String[] args) {
		int[] tests = {87, 75, 98, 100, 82};
		int results;
		
		// Search the array for the value of 100
		results = sequentialSearch(tests, 100);

		// Determine whether 100 is found and display
		// appropiate message.
		if(results == -1) {
			System.out.println("You did not earn 100 on any test");
		} else {
			System.out.println("You did earn 100 on a test.");
		}


	}

	/**
	 * The sequentialSearch() method searches an array for a value
	 * @param array, the array to search
	 * @param value, the value to search for
	 * @return the subscript of value, if found in the array, or -1
	 */
	public static int sequentialSearch(int[] array, int value) {

		int index;		// Loop control variable
		int element;	// Element the value is found at
		boolean found;	// Flag indicating the search results

		// Element 0 is the starting point of the search
		index = 0;

		// Store the default value element and found
		element = -1;
		found = false;

		// Search the array
		while(!found && index < array.length) {
			if(array[index] == value) {
				found = true;
				element = index;
			}
			index++;
		}

		// Return the element
		return element;
	}


}
