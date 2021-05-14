import javax.swing.JOptionPane;

/**
  * This program creates 3 instances of the Rectangle class
**/

public class RoomArea {
	public static void main(String[] args) {
		double number;	// To hold a  number
		double totalArea;	// The total area
		String input;		// To hold user's input


		

		// Create three Rectangle objects
		Rectangle kitchen = new Rectangle();
		Rectangle bedroom = new Rectangle();
		Rectangle den = new Rectangle();
		//Creating an extra room with tha value initialized with
		//the classes constructor
		Rectangle cieling = new Rectangle(22.0, 44.2);
		

		// Get and store the dimensions of the kitchen
		input = JOptionPane.showInputDialog("What is the " +
				"Kitchen's length: ");
		number = Double.parseDouble(input);
		kitchen.setLength(number);
		input = JOptionPane.showInputDialog("What is the " +
				"Kitchen's width: ");
		number = Double.parseDouble(input);
		kitchen.setWidth(number);
		
		// Get and store the dimensions of the bedroom
		input = JOptionPane.showInputDialog("What is the " +
				"Bedroom's length: ");
		number = Double.parseDouble(input);
		bedroom.setLength(number);
		input = JOptionPane.showInputDialog("What is the " +
				"Bedroom's width: ");
		number = Double.parseDouble(input);
		bedroom.setWidth(number);
		
		// Get and store the dimensions of the den
		input = JOptionPane.showInputDialog("What is the " +
				"Den's length: ");
		number = Double.parseDouble(input);
		den.setLength(number);
		input = JOptionPane.showInputDialog("What is the " +
				"Den's width: ");
		number = Double.parseDouble(input);
		den.setWidth(number);

		// Calculate the total areas of the rooms
		totalArea = kitchen.getArea() + bedroom.getArea() +
			den.getArea() + cieling.getArea();
		
		// Display the total areas of the rooms
		JOptionPane.showMessageDialog(null,
				"The total area of the rooms is: " +
				totalArea);
		System.exit(0);

	}

}
