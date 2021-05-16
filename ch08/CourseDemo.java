/**
  * This program demonstrates the Course class
**/

public class CourseDemo {
	public static void main(String[] args) {

		// Create an Instructor object
		Instructor myInstructor = new Instructor("Mohamed", "Daud",
				"RH3010");

		// Create a TextBook object
		TextBook myTextBook = new TextBook("Starting out with java",
				"Gaddis", "Pearson");

		// Create a Course object
		Course myCourse = new Course("Intro to Java", myInstructor,
									 myTextBook);

		// Display the Course information 
		System.out.println(myCourse);

	}

}
