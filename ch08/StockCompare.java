/**
  * This program uses the Stock class's isEquals method
  * to compare two Stock objects
**/
public class StockCompare {
	public static void main(String[] args) {

		// Create two Stock objects with the same values
		Stock company1 = new Stock("XYZ", 9.62);
		Stock company2 = new Stock("XYZ", 9.62);
		Stock company3 = new Stock("XYZ", 19.62);

		// Use the isEquals method to compare the objects
		if(company1.isEquals(company2)) {
			System.out.println("Both objects are the same.");
		} else {
			System.out.println("The objects are different.");
		}
		
		// Use the isEquals method to compare the objects
		if(company3.isEquals(company2)) {
			System.out.println("Both objects are the same.");
		} else {
			System.out.println("The objects are different.");
		}

		

	}

}

