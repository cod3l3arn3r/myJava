/**
  * This program uses the Stock class's copy method
**/

public class ObjectCopy {
	public static void main(String[] args) {

		// Create a Stock object
		Stock company1 = new Stock("XYZ", 9.26);

		// Declare a Stock variable
		Stock company2;

		// Make company2 reference a copy of the object
		// referenced by compay 1
		company2 = company1.copy();

		// Display the contents of both objects
		System.out.println("Company 1:\n" + company1);
		
		System.out.println();
		// Display the contents of both objects
		System.out.println("Company 2:\n" + company2);
		
		// Confirm that we actually have two objects
		if(company1.isEquals(company2)) {
			System.out.println("The company1 and company2 " +
					"variables reference the same object.");
		} else {
			System.out.println("The company1 and company2 " +
					"variables reference different objects.");
		}

	}

}


