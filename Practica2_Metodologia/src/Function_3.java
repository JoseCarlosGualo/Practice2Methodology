/*********************************************************************
*
* Class Name: Function_3
* Author/s name: José Carlos Gualo and Ernesto Plata Fernández
* Release/Creation date: 03/03/2020
* Class description: This is a child class from the Bisection one, which is used to calculate the type 3 function 
*
**********************************************************************
*/
public class Function_3 extends Bisection {
	
	/*********************************************************************
	*
	* Method name: Function_3
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
	public Function_3(double ai, double bi, double ei) {
		super(ai, bi, ei);
	}

	/*********************************************************************
	*
	* Method name: function
	* 
	* Description of the Method: This method is used to get the value of the function of type 3 for a determined value
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
		result = Math.sin(x) - (1 / x);
		return result;
	}
}
