/**
  * Dealer class for the game Cho-Han
**/

public class Dealer {
	private int die1Value;
	private int die2Value;
	
	 //Dealer();
	 /**
	   * The constructor
	**/
	public Dealer() {
		die1Value = 0;
		die2Value = 0;
	}

	// rollDice(): void
	/**
	  * The rollDice method rolls the dice and saves their values 
	**/
	public void rollDice() {
		
		final int SIDES = 6; // Number of sides of the dice

		// Create the dice, this also rolls them
		Die die1 = new Die(SIDES);
		Die die2 = new Die(SIDES);

		// Record thier value
		die1Value = die1.getValue();
		die2Value = die2.getValue();

	}

	// getChoOrHan() : String
	/**
	  * The getChoOrHan method returns the result of the dice
	  * rolled Cho or Han
	  * @return Either "Cho (even)", or "Han (Odd)"
	**/
	public String getChoOrHan() {

		String result;	// To hold the results

		// Get the sum of the dice
		int sum = die1Value + die2Value;

		// Determine EVEN or ODD
		if(sum % 2 == 0) {
			result = "Cho (Even)";
		} else {
			result = "Han (Odd)";
		}

		// Return the result
		return result;
	}

	// getDie1Value() : int
	/**
	  * The getDie1Value returns the value of die # 1
	  * @return The value of die # 1 field
	**/
	public int getDie1Value() {
		return die1Value;
	}
	// getDie2Value() : int
	/**
	  * The getDie2Value returns the value of die # 2
	  * @return The value of the die # 2 value field
	**/
	public int getDie2Value() {
		return die2Value;
	}

}

