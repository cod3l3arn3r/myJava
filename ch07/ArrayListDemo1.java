import java.util.ArrayList;
import java.util.Scanner;
/**
  * This program demonstrates an ArrayList
**/

public class ArrayListDemo1 {
	public static void main(String[] args) {

		// Create ArrayList to hold some names
		ArrayList<String> nameLists = new ArrayList<String>();

		// Create Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);

		// Add some names to the array list
		for(int i = 0; i < 5; i ++) {
			System.out.println("Enter the " + (i + 1) +
					" name: ");
			String name = keyboard.nextLine();

			// Assign the name to the ArrayList object
			nameLists.add(name);
		}

		// Display the size of the ArrayList
		System.out.println("The arrayList has " + 
				nameLists.size() + " objects stored in it.");

		// Now display the items in the ArrayList object nameLists
		for(String name : nameLists) {
			System.out.println(name);
		}

	}

}

