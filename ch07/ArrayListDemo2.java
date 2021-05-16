import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {

		// Create an ArrayList to hold some names
		ArrayList<String> nameList = new ArrayList<String>();

		// Add some names to the ArrayList
		nameList.add("Daud");
		nameList.add("Pious");
		nameList.add("Blackie");
		nameList.add("Abdi Rabi");
		
		// Display the items in the nameList, and their indices
		for(int index = 0; index < nameList.size(); index++) {
			System.out.println("Index" + index +": " +
					nameList.get(index));
		}

		// Now remove the item at index 1
		nameList.remove(1);
		System.out.println("The item at index 1 is removed " +
				"here are the items now.");
		
		// Display the items in the nameList, and their indices
		for(int index = 0; index < nameList.size(); index++) {
			System.out.println("Index: " + index +
					nameList.get(index));
		}

		// Now insert an item at index 1
		nameList.add(1, "Bond, James");
		System.out.println("Bond, James was added at the index 1 " +
				"and here are the items again.");

		// Display the items in the nameList, and their indices
		for(int index = 0; index < nameList.size(); index++) {
			System.out.println("Index: " + index +
					nameList.get(index));
		}

		// Replace an item using the set method
		nameList.set(1, "Hudson, Jennifer");

		// Display the items in the nameList, and their indices
		for(int index = 0; index < nameList.size(); index++) {
			System.out.println("Index" + index +": " +
					nameList.get(index));
		}
	}


}
