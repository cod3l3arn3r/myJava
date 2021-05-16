import java.util.ArrayList;

/**
  * This program demonstrates how to store BankAccount object
  * into an ArrayList
**/

public class ArrayListDemo3 {
	public static void main(String[] args) {

		// Create an ArrayList to hold BankAccount objects
		ArrayList<BankAccount> accountList = 
			new ArrayList<BankAccount>();

		// Add 3 BankAccount objects to the ArrayList
		accountList.add(new BankAccount(100.00));
		accountList.add(new BankAccount(500.00));
		accountList.add(new BankAccount(1500.00));

		// Display each item
		for(int index = 0; index < accountList.size(); index++) {

			BankAccount account = accountList.get(index);
			System.out.println("Account at index " + index + ": " +
					"\nBalance: " + account.getBalance());
		}

	}

}


