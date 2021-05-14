/**
  * The BankAccount Class simulates a bank account
**/

public class BankAccount {
	private double balance;	// Account Balance

	//BankAccount()
	/**
	  * This Constructor sets the starting balance to zero
	**/
	public BankAccount() {
		balance = 0.0;
	}

	//BankAccount(startBalance : double)
	/**
	  * This constructor sets the starting balance to the
	  * value passed as an argument
	  * @param startBalance, The starting balance
	**/
	public BankAccount(double startBalance) {
		balance = startBalance;
	}

	//BankAccount(str : String)
	/**
	  * This constructor sets the String balance to the value of
	  * the String argument
	  * @param str, The starting balance as string
	**/
	public BankAccount(String str) {
		balance = Double.parseDouble(str);
	}

	//deposit(amount : double) : void
	/**
	  * The deposit method makes a deposit into the account
	  * @param amount, The amount to be deposited
	**/
	public void deposit(double amount) {
		balance += amount;
	}

	//deposit(str : String) : void
	/**
	  * The deposit method set the deposit amount as String
	  * @param str, The amount to be deposited as string
	**/
	public void deposit(String str) {
		balance += Double.parseDouble(str);
	}
	//withdraw(amount : double) : void
	/**
	  * The withdraw method withdraws amount from the balance
	  * @param amount, The amount to withdraw from the account
	**/
	public void withdraw(Double amount) {
		balance -= amount;
	}

	//withdraw(str : String) : void
	/**
	  * The withdraw method withdraws amount as String
	  * @param str, The amout to withdraw from the account
	**/
	public void withdraw(String str) {
		balance -= Double.parseDouble(str);
	}

	/**
	  * The getBalance method gets and displays the accounts balance
	  * @return The accounts current balance
	**/
	public double getBalance() {
		return balance;
	}

}
