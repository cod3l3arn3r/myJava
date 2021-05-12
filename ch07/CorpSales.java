import java.util.Scanner;

/**
  * This program demonstrates two dimensional arrays
**/

public class  CorpSales {
	public static void main(String[] args) {

		final int DIVS = 3;	// Three divisions in the company
		final int QTRS = 4; // Four quarters
		double totalSales = 0.0;	// Accumulator

		// Create an array to hold the sales for each division
		// for each quarter
		double[][] sales = new double[DIVS][QTRS];

		// Create Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);

		// Display an introduction
		System.out.println("This program will calculate, the total " +
				"sale of all the company's divisions.");
		System.out.println("Enter the following sales data: ");

		// Nasted loop to fill the array with quarterly sales
		// figure for all the divisions
		for(int div = 0; div < DIVS; div++) {
			for(int qtr = 0; qtr < QTRS; qtr++) {
				System.out.printf("Division %d, quarter %d: $",
						(div + 1), (qtr + 1));
				sales[div][qtr] = keyboard.nextDouble();
			}

			System.out.println();	// Print Blank line
		}

		// Nested loop to add all the elements in the array
		for(int div = 0; div < DIVS; div++) {
			for(int qtr = 0; qtr < QTRS; qtr++) {
				totalSales += sales[div][qtr];
			}

		}
			// Display the total sales
			System.out.printf("Total company sales: $%,.2f\n",
					totalSales);

	}

}

