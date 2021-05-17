/**
  * This program creates a FullName object, and then calls
  * the object's getLength method before values are established
  * for its reference field, as result this program will crash
**/

public class NameTester {
	public static void main(String[] args) {
		
		int len;	// To hold the names length

		// Create a FullName object
		FullName name = new FullName();

		// Get the length of the full name
		len = name.getLength();

	}

}
