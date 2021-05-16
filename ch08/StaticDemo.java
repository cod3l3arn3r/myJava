/**
  * This progam demonstrates the Countable class
**/

public class StaticDemo {
	public static void main(String[] args) {

		int objectCount;

		// Create three instances of the Countable class
		Countable obj1 = new Countable();
		Countable obj2 = new Countable();
		Countable obj3 = new Countable();
		Countable obj4 = new Countable();
		Countable obj5 = new Countable();
		Countable obj6 = new Countable();

		// Get the number of instances from the class's 
		// static field
		objectCount = obj1.getInstanceCount();
		System.out.println(objectCount + " intances of the class " +
				"were created.");
	}

}
