/*********************************************************************
*
* Class Name: Function_1
* Author/s name: José Carlos Gualo and Ernesto Plata Fernández
* Release/Creation date: 03/03/2020
* Class description: This is a child class from the Bisection one, which is used to calculate the type 1 function 
*
**********************************************************************
*/
public class Function_1 extends Bisection {
	
	/*********************************************************************
	*
	* Method name: Function_1
	* 
	* Description of the Method: This is the constructor method for this class
	*
	* Calling arguments: There are three arguments for this method: Three doubles called ai, bi, and ei
	*
	* Return value: This method does not return any value, it is void
	*
	* Required Files: This method does not require any file
	*
	* No checked exceptions in this method
	*
	*********************************************************************/
	public Function_1(double ai, double bi, double ei) {
		super(ai, bi, ei);
	}

	/*********************************************************************
	*
	* Method name: function
	* 
	* Description of the Method: This method is used to get the value of the function of type 1 for a determined value
	*
	* Calling arguments: The argument for this method is a double x, which is the value for which we want to check the function
	*
	* Return value: This method returns the value of the function for a determined value
	*
	* Required Files: This method does not require any file
	*
	* No checked exceptions in this method
	*
	*********************************************************************/
	public double function(double x) {
		double result;
		result = Math.pow(x, 2) - 2*x - 3;
		return result;
	}
}
