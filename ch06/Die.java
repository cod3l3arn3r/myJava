import java.util.Random;

/**
  * The Die class Simulates a six-sided die
**/

public class Die {

	private int sides;		// The sides of the die
	private int value;		// The value returned by the die

	/**
	  * Constructor performs the initial roll of the die 
	  * @param numSides, The number sides that the die has
	**/
	public Die(int numSides) {
		sides = numSides;
		roll();
	}

	/**
	  * The roll method simulates the rolling of the die
	**/
	public void roll() {
		// Create a Random object 
		Random rand = new Random();

		// Get the random value of the die.
		value = rand.nextInt(sides) + 1;
	}

	/**
	  * The getSides
	  * @return, The number of sides for this  Die.
	**/
	public int getSides() {
		return sides;
	}

	/**
	  * The getValue method
	  * @return, The value retuned by the Die.
	**/
	public int getValue() {
		return value;
	}

}

