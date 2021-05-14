import java.util.Random;

/**
  * Player class for the game Cho or Han
**/

public class Player {
	private String name;
	private String guess;
	int points;


	// Player(playerName: String)
	/**
	  * Constructor
	  * @param playerName, the name of the player
	**/
	public Player(String playerName) {
		name = playerName;
		guess = "";
		points = 0;
	}

	// makeGuess() : void
	/**
	  * The makeGuess method causes the player to guess
	  * either "Cho (Even)" or "Han (Odd)"
	**/
	public void makeGuess() {
		
		// Create a Random object 
		Random rand = new Random();

		// Get a random number either 0 or 1
		int guessNumber = rand.nextInt(2);

		// Convert the random number to a guess of
		// either "Cho (Even)" or "Han (Odd)"
		if(guessNumber == 0) {
			guess = "Cho (Even)";
		} else {
			guess = "Han (Odd)";
		}

	}

	// addPoints(newPoints : int) : void
	/**
	  * The addPoints method adds specific number of points
	  * to the player's current blance
	  * @param newPoints, The points to be added to the player's
	  * current balance
	**/
	public void addPoints(int newPoints) {
		points = newPoints;
	}

	// getName() : String
	/**
	  * The getName method returns the player's name
	  * @return The player's name field
	**/
	public String getName() {
		return name;
	}

	// getGuess() : String
	/**
	  * The getGuess method gets the players guess
	  * @return The players guess field
	**/
	public String getGuess() {
		return guess;
	}

	// getPoints() : int
	/**
	  * The getPoints method gets the player's current points
	  * @return returns the players current points
	**/
	public int getPoints() {
		return points;
	}

}
	
