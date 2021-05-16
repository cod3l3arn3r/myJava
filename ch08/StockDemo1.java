/**
  * This program demonstrates the Stock class's 
  * toString method
**/

public class StockDemo1 {
	public static void main(String[] args) {

		// Create a Stock object for the XYZ company
		// The trading symbol is XYZ and the current
		// Price per share is $9.62
		Stock xyzCompany = new Stock("XYZ", 9.63);

		// Display the object's value
		System.out.println("The stock data is:\n" +
				xyzCompany);

	}

}
