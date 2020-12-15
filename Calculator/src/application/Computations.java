/**
 * 
 */
package application;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Ryan Olsen
 * Class containing overloaded methods to handle computations for the calculator
 * Uses BigDecimal class to limit rounding errors
 */
public class Computations {

	String mathType; //declare String for operation type (switch statement)
	BigDecimal result1; //Declares result
	BigDecimal x1, y1; //Declare variables to handle args from method math1()
	
	//New constructor for BigDecimal
	BigDecimal math1(BigDecimal a, BigDecimal b, String s) {
		x1 = a;
		y1 = b;
		mathType = s;
		
		switch(mathType) {
		case "addition":
			result1 = x1.add(y1);
			
			break;
			
		case "subtraction":
			result1 = x1.subtract(y1);
			break;
		
		case "multiply":
			result1 = x1.multiply(y1);			
			break;
			
		case "divide":
			result1 = x1.divide(y1, 15, RoundingMode.CEILING); //divide Bigdecimal class, 15 decimal points
			break;
		}
		
		System.out.println("result1 = " + result1);
		return result1;
		
	} //end method math1()	
} //end class Computations