/*********************************************************************
 *
 * Class Name: Bisection Author/s name: José Carlos Gualo and Ernesto Plata
 * Fernández Release/Creation date: 03/03/2020 Class description: This is an
 * abstract class used to model a function, check if that function fullfills
 * bolzano's theorem, and calculate a root of that function between a range of
 * values
 *
 **********************************************************************
 */
public abstract class Bisection {
	private double a, b, epsilon, root;// Limit on the left, Limit on the right, Error desviation

	/*********************************************************************
	 *
	 * Method name: Bisection
	 * 
	 * Description of the Method: This is the constructor method for this class
	 *
	 * Calling arguments: There are three arguments for this method: Three doubles
	 * called ai, bi, and ei
	 *
	 * Return value: This method does not return any value, it is void
	 *
	 * Required Files: This method does not require any file
	 *
	 * No checked exceptions in this method
	 *
	 *********************************************************************/
	public Bisection(double ai, double bi, double ei) {
		this.a = ai;
		this.b = bi;
		this.epsilon = ei;
	}

	/*********************************************************************
	 *
	 * Method name: getRoot
	 * 
	 * Description of the Method: This is the getter of the attribute root
	 *
	 * Calling arguments: No arguments needed
	 *
	 * Return value: This method returns the attribute root of the bisection object
	 * who is calling it
	 *
	 * Required Files: This method does not require any file
	 *
	 * No checked exceptions in this method
	 *
	 *********************************************************************/
	public double getRoot() {
		return this.root;
	}

	/*********************************************************************
	 *
	 * Method name: getA
	 * 
	 * Description of the Method: This is the getter of the attribute a
	 *
	 * Calling arguments: No arguments needed
	 *
	 * Return value: This method returns the attribute a of the bisection object who
	 * is calling it
	 *
	 * Required Files: This method does not require any file
	 *
	 * No checked exceptions in this method
	 *
	 *********************************************************************/
	public double getA() {
		return a;
	}

	/*********************************************************************
	 *
	 * Method name: getB
	 * 
	 * Description of the Method: This is the getter of the attribute b
	 *
	 * Calling arguments: No arguments needed
	 *
	 * Return value: This method returns the attribute b of the bisection object who
	 * is calling it
	 *
	 * Required Files: This method does not require any file
	 *
	 * No checked exceptions in this method
	 *
	 *********************************************************************/
	public double getB() {
		return b;
	}

	/*********************************************************************
	 *
	 * Method name: getEpsilon
	 * 
	 * Description of the Method: This is the getter of the attribute epsilon
	 *
	 * Calling arguments: No arguments needed
	 *
	 * Return value: This method returns the attribute epsilon of the bisection
	 * object who is calling it
	 *
	 * Required Files: This method does not require any file
	 *
	 * No checked exceptions in this method
	 *
	 *********************************************************************/
	public double getEpsilon() {
		return epsilon;
	}

	/*********************************************************************
	 *
	 * Method name: checkBolzano
	 * 
	 * Description of the Method: This method is used to check that a Bisection
	 * object fullfills bolzano's theorem
	 *
	 * Calling arguments: No arguments needed
	 *
	 * Return value: This method returns a boolean value, true if fullfills
	 * bolzano's theorem, or false if not
	 *
	 * Required Files: This method does not require any file
	 *
	 * No checked exceptions in this method
	 *
	 *********************************************************************/
	public boolean checkBolzano() {
		boolean bolzano = false;

		if ((function(this.a) * function(this.b)) < 0) { // If the graphic representation changes the sign in the
															// interval, we can apply bolzano's rule
			bolzano = true;
		}

		return bolzano;
	}

	/*********************************************************************
	 *
	 * Method name: function
	 * 
	 * Description of the Method: This is an abstract method used in the child
	 * classes of this class to check the value of a function for a x value
	 *
	 * Calling arguments: The argument for this method is a double x, which is the
	 * value for which we want to check the function
	 *
	 * Return value: This method returns the value of the function for a determined
	 * value
	 *
	 * Required Files: This method does not require any file
	 *
	 * No checked exceptions in this method
	 *
	 *********************************************************************/
	abstract public double function(double x);

	/*********************************************************************
	 *
	 * Method name: findRoot
	 * 
	 * Description of the Method: This method is used to calculate the root of a
	 * function given a limit on the left and on the right, and an error desviation
	 *
	 * Calling arguments: There are three arguments for this method: Three doubles
	 * called a, (which is the llimit on the left), b, (which is the limit on the
	 * right), and epsilon, (which is the error desviation)
	 *
	 * Return value: This method return the value of the root as double
	 *
	 * Required Files: This method does not require any file
	 *
	 * No checked exceptions in this method
	 *
	 *********************************************************************/
	public double findRoot(double a, double b, double epsilon) {

		double c = (a + b) / 2; // we calculate the intermediate point

		if ((function(c) == 0) || (b - a) < epsilon) { // if the error desviation is enough and c is a root, we assign c
														// to root
			this.root = c;
		} else if ((function(a) * function(c)) < 0) { // If the graphic representation changes the sign
			b = c; // we assign the value of the middle point to b
			c = findRoot(a, b, epsilon); // call the function recursively
		} else if ((function(a) * function(c)) > 0) { // If the graphic representation does not change the sign
			a = c; // we assign the value of the middle point to a
			c = findRoot(a, b, epsilon); // call the function recursively
		}

		return c;
	}

}
