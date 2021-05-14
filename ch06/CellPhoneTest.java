import java.util.Scanner;

/**
  * This program runs a simple test of the CellPhone class
**/

public class CellPhoneTest {
	public static void main(String[] args) {

		String testManu;	// To hold manufacturer
		String testMod;		// To hold model
		Double testPrice;	// to hold a price

		// Create a scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);

		// Get the manufacture's name
		System.out.println("Enter the manufacturer's name: ");
		testManu = keyboard.nextLine();
		
		// Get the phone's model number
		System.out.println("Enter the phone's model number: ");
		testMod = keyboard.nextLine();
		
		// Get the phones's retail price
		System.out.println("Enter the phone's retail price: ");
		testPrice = keyboard.nextDouble();

		// Create an instance of the CellPhone class
		// passing the data that was entered as an arguments
		// to the constructor
		CellPhone phone = new CellPhone(testManu, testMod,
				testPrice);

		// Get the data from the phone and display it
		System.out.println();
		System.out.println("Here are the data you have provided: ");
		System.out.println("Manufacture: " + phone.getManufact());
		System.out.println("Model: " + phone.getModel());
		System.out.println("Retail Price: " +
				phone.getRetailPrice());
	}

}


