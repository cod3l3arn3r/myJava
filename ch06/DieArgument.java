/**
  * This program simulates the rolling of 6 sided die
  * and 20 sided die
**/

public class DieArgument {
	public static void main(String[] args) {
		final int SIX_SIDED = 6;
		final int TWENTY_SIDED = 20;

		// Create SIX SIDED  die
		Die sixDie = new Die(SIX_SIDED);

		// Create TWENTY SIDED die
		Die twentyDie = new Die(TWENTY_SIDED);

		// Roll the dice
		rollDie(sixDie, SIX_SIDED);
		System.out.println();
		rollDie(twentyDie, TWENTY_SIDED);

	}

	/**
	  * The rollDie method simulates rolling a dice
	  * and displays the die's number of sides and value
	  * @param d, The Die object to roll
	**/
	public static void rollDie(Die d, int maxRolls) {
		
		//Display the number of sides
		System.out.println("Rolling a " + d.getSides() + 
				" sides die.");

		// Roll the die 5 times
		for(int i = 0; i < maxRolls; i++) {
			d.roll();

			// Display the dies value
			System.out.print(d.getValue() + " ");

		}
		System.out.println();

	}

}


