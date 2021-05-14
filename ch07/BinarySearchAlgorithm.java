public class BinarySearchAlgorithm {

	public static int binarySearch(int[] array, int value) {
		int first;		// First array element
		int last;		// Last array element
		int middle;		// Midpoint of search
		int position;	// Position of search value
		boolean found;	// Flag

		// Set the initial values
		fist = 0;
		last = (array.length - 1);
		position = - 1;
		found = false;

		// Search for the value
		while(!found && first <= last) {

			// Calculate middle point
			midpoint = (first + last) / 2;

			// If value is found at midpoint 
			if(array[middle] == value) {
				found = true;
				position = middle;
			} 
			// Else if the value is in the lower half
			else if(array[middle] > value) {
				last = middle - 1;
			}
			// Else if value is in upper half
			else {
				first = middle + 1;
			}
		}

			// Return the position of the item 
			// of -1, if it was not found
			return position;
	}

}

