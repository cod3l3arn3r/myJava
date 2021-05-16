/**
  * This program stores a data about TextBook Class
**/

public class TextBook {
	
	private String title;		// The book title
	private String author;		// The book's author
	private String publisher;	// The book's publisher

	// TextBook(textTitle : String, auth : String, 
	//						pub : String):
	public TextBook(String textTitle, String auth, 
					String pub) {
		title     = textTitle;
		author    = auth;
		publisher = pub;
	}

	// TextBook(object2 : TextBook):
	public TextBook(TextBook object2) {
		title     = object2.title;
		author    = object2.author;
		publisher = object2.publisher;
	}

	// set(textTitle : String, auth : String,
	//				   pub : String) : void
	public void set(String textTitle, String auth, 
					String pub) {
		title     = textTitle;
		author    = auth;
		publisher = pub;
	}
	
	// +toString() : String
	public String toString() {

		// Create a String representing the object
		String str ="Title: " + title + "\nAuthor: " + author +
			"\nPublisher: " + publisher;

		// Return the String
		return str;

	}

}
