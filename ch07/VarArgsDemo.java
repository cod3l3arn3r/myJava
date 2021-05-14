/**
  * This program demonstrates a method that accepts
  * a variable number of arguments(varargs)
  * which is also knows as variable-length argument list
**/

public class VarArgsDemo {
	public static void main(String[] args) {
		int result;
		result = sum(30, 40);
		System.out.println("The sum is: " +
				result);
		result = sum(10, 20, 30);
		System.out.println("The sum method with 3 args:" +
				result);
		result = sum(10, 20, 30, 40);
		System.out.println("The sum method with 4 args: " +
				result);
	}

	/**
	  * The sum method
	  * @param numbers, the varargs number
	  * @return returns the result 
	**/
	public static int sum(int... numbers) {
		int total = 0;

		for(int index = 0; index < numbers.length; index++) {
			total += numbers[index];
		}

		return total;

	}

}
