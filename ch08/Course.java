/**
  * This program is stores data about class
**/

public class Course {
	// -courseName : String
	private String courseName;
	// -instructor : Instructor
	private Instructor instructor;
	// -textBook   : TextBook
	private TextBook textBook;

	// +Course(name: String, inst : Instructor, text : TextBook):
	public Course(String name, Instructor inst,
				  TextBook text) {
		courseName = name;
		instructor = new Instructor(inst);
		textBook   = new TextBook(text);
	}

	// +getName() : String
	public String getName() {
		return courseName;
	}

	// +getInstructor() : Instructor
	public Instructor getInstructor() {
		return instructor;
	}

	// +getTextBook()   : TextBook
	public TextBook getTextBook() {
		return textBook;
	}

	// +toString()      : String
	public String toString() {

		// Create a String representing the object
		String str ="Course name:  "              + courseName +
					"\nInstructor information:\n" + instructor +
					"\nTextBook information:\n"   + textBook;

		// Return the String
		return str;
	}

}
