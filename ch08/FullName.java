/**
  * This class stores a person's first, last, middle name
  * The class is dangerous because it does not prevent operations
  * on reference field
**/

public class FullName {
	private String lastName;	// Last name
	private String firstName;	// First name
	private String middleName;	// Middle name

	/**
	 * The setLastName method sets the last name field
	 * @param str, The String to set lastName to
	**/
	public void setLastName(String str) {
		lastName = str;
	}
	
	/**
	 * The setFirstName method sets the first name field
	 * @param str, The String to set firstName to
	**/
	public void setfirstName(String str) {
		firstName = str;
	}
	

	/**
	 * The setMiddleName method sets the middleName field
	 * @param str, The String to set middleName to
	**/
	public void setMiddleName(String str) {
		middleName = str;
	}

	/**
	  * The getLength method returns the length of the fullName
	  * @return the length
	**/
	public int getLength() {
		int len = 0;
		if(lastName != null){
			len += lastName.length();
		}
		if(firstName != null) {
			len += firstName.length();
		}
		if(middleName != null) {
			len += middleName.length();
		}

		return len;
	}

	/**
	  * The toString method returns the fullName
	  * @return A reference to String
	**/
	public String toString() {
		return lastName + " " + firstName + " " +
			middleName;
	}

}

