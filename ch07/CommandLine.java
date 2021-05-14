/**
  * This program displays the arguments passed to if from the
  * operating system commandline
**/

public class CommandLine {
	public static void main(String[] args) {
		for(int index = 0; index < args.length; index++) {
			System.out.println(args[index]);
		}

	}

}
