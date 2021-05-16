public class Rectangle {
	
	private double length;
	private double width;

	public Rectangle() {
	}

	/**
	  * Constructor
	  * @param len, the length of the rectangle
	  * @param w, the widh of the rectangle
	**/
	public Rectangle(double len, double w) {
		length = len;
		width = w;
	}

	// setLength
	public void setLength(double len) {
		length = len;
	}

	// setWidth method
	public void setWidth(double w) {
		width = w;
	}

	// getLength method
	public double getLength() {
		return length;
	}

	// getWidth
	public double getWidth() {
		return width;
	}

	// getArea
	public double getArea() {
		return length * width;
	}

	// getPerimeter
	public double getPerimeter() {
		return 2 * (length + width);
	}

}
