public class LengthDemo {
	public static void main(String[] args) {
		// Creata a rectangle object and assign its address
		// to the box variable
		Rectangle box = new Rectangle();

		// Indicate what is going on
		System.out.println("Sending the value 10.0 " +
				"to the setLength method.");
		
		// Call the box object's setLength method
		box.setLength(10.0);
		
		// Indicate what is going on
		System.out.println("Sending the value 20.0 " +
				"to the setWidth method.");
		
		// Call the box object's setWidth method
		box.setWidth(20.0);
		
		// Indicate what is going on
		System.out.println("Getting the value with  " +
				"getLength method.");
		
		// Call the box object's setLength method
		System.out.println(box.getLength());
		
		// Indicate what is going on
		System.out.println("Getting the value with " +
				"the getWidth method.");
		
		// Call the box object's setLength method
		System.out.println(box.getWidth());
		
		// Indicate what is going on
		System.out.println("Getting the area of  " +
				"the with getArea method.");
		
		// Call the box object's setLength method
		System.out.println(box.getArea());
		
		// Indicate what is going on
		System.out.println("Getting perimetervalue  " +
				"with getPerimeter method.");
		
		// Call the box object's setLength method
		System.out.println(box.getPerimeter());

	}

}


