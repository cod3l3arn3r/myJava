/**
  * This program uses the Stock class's constructor copy method
**/

public class ObjectCopy1 {
	public static void main(String[] args) {

		// Create a Stock object
		Stock company1 = new Stock("XYZ", 9.26);

		// Create another Stock object that is a copy of 
		// the company1 reference object
		Stock company2 = new Stock(company1);

		// Check if the both values are the same
		if(company1.isEquals(company2)) {
			System.out.println("Both objects are the same.");
		} else {
			System.out.println("Both objects are different.");
		}

	}

}
