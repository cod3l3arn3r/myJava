public class Stock {
	
	  
	// symbol : String
	private String symbol;

    // sharePrice : double
	private double sharePrice;

	/**
	  * Constructor method 
	  * @param sym, The company's symbols
	  * @param price, The company's stock price
	**/
	public Stock(String sym, double price) {

		symbol = sym;
		sharePrice = price;
	}

	/**
	  * Copy Constructor
	**/
	public Stock(Stock obj2) {
		symbol = obj2.symbol;
		sharePrice = obj2.sharePrice;
	}

	/**
	  * The getSymbol method returns the company's logo name
	  * @return the company's logo
	  **/
	public String getSymbol() {
		return symbol;
	}

	/**
	  * The getSharePrice method returns the company's Stock price
	  * @return Return the company's Stock price
	  **/
	public double getSharePrice() {
		return sharePrice;
	}

	/**
	  * The toString method, returns the company's shared price
	  * and the company's symbol
	  * @return The company's logo, and the company's stock price
	**/
	public String toString() {
		// Create a string describing the stock
		String str = "Trading symbol: " + symbol + 
			"\nShare price: " + sharePrice;

		// Return the string
		return str;
	}

	/**
	  * The isEqual method checks whether two objects have 
	  * the same data
	  * @param obj2, The object to be compared with
	**/
	public boolean isEquals(Stock obj2) {

		boolean status;

		// Determine whether this object's symbol and sharePrice
		// field are equal to object's 2 symbol and sharePrice field
		if(symbol.equals(obj2.symbol) && 
				sharePrice == obj2.sharePrice) {
			status = true; // Yes the objects are equal
				} else {
					status = false; // No the objects are not equal
				}

		// Return the value in status
		return status;
	}

	/**
	  * The copy method returns the copy of an object
	  * @return Returns a reference to the new object
	**/
	public Stock copy() {
		
		// Create a new Stock object and initialize it
		// with the same data held by the calling object
		Stock copyObject = new Stock(symbol, sharePrice);

		// Return a reference to the new object
		return copyObject;
	}

}

	  
	  
