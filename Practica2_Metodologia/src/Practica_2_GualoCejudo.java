import java.util.*;

/*********************************************************************
 *
 * Class Name: Practica_2_Gualo_Plata Author/s name: José Carlos Gualo and
 * Ernesto Plata Fernández Release/Creation date: 03/03/2020 Class description:
 * This class constains the main method of the program and some other methods
 * for the correct functioning of the program
 *
 **********************************************************************
 */
public class Practica_2_GualoCejudo {

	public static void main(String[] args) {
		final Scanner keyboard = new Scanner(System.in); // Creation of the Scanner object to read from keyboard

		// Creation of an object of each function between the ranges asked in the
		// problem descrption
		Function_1 funcion_1 = new Function_1(0, 4, 0.01);
		Function_1 funcion_1_2 = new Function_1(2, 2.5, 0.01);
		Function_2 funcion_2 = new Function_2(0, 6, 0.01);
		Function_3 funcion_3 = new Function_3(2 * Math.PI, (5 * Math.PI) / 2, 0.01);
		int option; // Integer which stores the value introduced by keyboard by the user
		boolean next = true; // Auxiliar boolean which helps us to continue the program when
								// InputMismatchException is thrown

		do {
			try {// Try-catch structure to deal with InputMismatchException exception
				do {
					menu(); // Display of a menu
					option = keyboard.nextInt(); // Read user's option by keyboard
					switch (option) {
					case 1:
						show_result(funcion_1); // Show the result for the first asked function
						break;
					case 2:
						show_result(funcion_1_2); // Show the result for the second asked function
						break;
					case 3:
						show_result(funcion_2); // Show the result for the third asked function
						break;
					case 4:
						show_result(funcion_3); // Show the result for the fourth asked function
						break;
					case 5:
						System.exit(1); // End of the program when introduced value is 5
						break;
					default:
						System.out.println("Option not valid");
					}
				} while (true);
			} catch (InputMismatchException numEx) { // Catch InputMismatchException, show error message, and ask for a
														// new option
				System.out.println("Sorry, you must insert a number");
				keyboard.next();
			}
		} while (next);

	}

	/*********************************************************************
	 *
	 * Method name: show_result
	 * 
	 * Description of the Method: This method checks if the function fullfills the
	 * bolzano's theorem between the indicated ranges, if so, it shows a message
	 * showing the result, otherwise, it shows a message saying that the function
	 * does not fullfills the bolzano's theorem
	 *
	 * Calling arguments: This method uses as arguments an object of type Bisection
	 *
	 * Return value: This method does not return any value, it is void
	 *
	 * Required Files: This method does not require any file
	 *
	 * No checked exceptions in this method
	 *
	 *********************************************************************/
	public static void show_result(Bisection bisection) {
		if (bisection.checkBolzano()) { // Check if the function fullfills the bolzano's theorem
			// bisection.findRoot(bisection.getA(), bisection.getB(),
			// bisection.getEpsilon()); //Calculate root
			System.out.println("The root is x = "
					+ bisection.findRoot(bisection.getA(), bisection.getB(), bisection.getEpsilon())); // Show message
		} else {
			System.out.println("Bolzano's theorem is not applicable for these ranges in this function"); // Show error
																											// message
		}
	}

	/*********************************************************************
	 *
	 * Method name: menu
	 * 
	 * Description of the Method: This method shows a menu
	 *
	 * Calling arguments: This method has no arguments
	 *
	 * Return value: This method does not return any value, it is void
	 *
	 * Required Files: This method does not require any file
	 *
	 * No checked exceptions in this method
	 *
	 *********************************************************************/
	public static void menu() {
		System.out.println("Select the formula you want to calculate:\n1.x^2-2x-3 in [0,4]\n2.x^2-2x-3"
				+ " in [2,2.5]\n3.2^x-x^2-10 in [0,6]\n4.sin(x)-1/x in [2*PI, 5*PI/2]\n5.Exit Program");
	}

}
