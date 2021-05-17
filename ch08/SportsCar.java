/**
  * SportsCar class
**/

public class SportsCar {
	private CarType make;	// The car's make
	private CarColor color;	// The car's color
	private double price;	// The car's price

	/**
	  * The constructor initializes the car's make, color
	  * and the price
	  * @param aMake, The car's make
	  * @param aColor, The car's color
	  * @param aPrice, The car's price
	**/
	public SportsCar(CarType aMake, CarColor aColor,
					 double aPrice) {
		make  = aMake;
		color = aColor;
		price = aPrice;
	}

	/**
	  * The getMake method 
	  * @return The car's make
	**/
	public CarType getMake() {
		return make;
	}

	/**
	  * The getColor method
	  * @return The car's color
	**/
	public CarColor getColor() {
		return color;
	}
	
	/**
	  * The getPrice method
	  * @return The car's price
	**/
	public double getPrice() {
		return price;
	}

	/**
	  * The toString method
	  * @return A String indicating the car's make,
	  *			color, and price
	**/
	public String toString() {

		String str = String.format("Make:  %s\nColor: %s\n" +
				"Price: $%,.2f", make, color, price);

		return str;
	}

}
	


