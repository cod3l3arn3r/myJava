/**
  * This class stores data about an Instructor
**/

public class Instructor {
	private String lastName;	      // Last name
	private String firstName;	     // First name
	private String officeNumber;	// Office number
// -lastName     : String
// -firstName    : String
// -officeNumber : String

	public Instructor(String lname, String fname, 
				    String office) {
		lastName = lname;
		firstName = fname;
		officeNumber = office;
	}
// +Instructor(lname: String, fname : String, office : String):
	public Instructor(Instructor obj2) {
		lastName = obj2.lastName;
		firstName = obj2.firstName;
		officeNumber = obj2.officeNumber;
	}
// +Instructor(object2 : Instructor):
	public void set(String lname, String fname, String office) {
		lastName = lname;
		firstName = fname;
		officeNumber = office;
	}
// +set(lname : String, fname : String, office : String) : void
	public String toString() {
		
		// Create a string representing the object.
		String str = "Last  name: "       + lastName      +
					 "\nFirst name: "     + firstName     +
					 "\nOffice number: "  + officeNumber;

		// Return the string
		return str;
	}

}

