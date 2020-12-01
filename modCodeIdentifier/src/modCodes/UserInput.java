/**
 * 
 */
package modCodes;

import java.util.Scanner;

/**
 * @author Ryan Olsen
 * Ask user to input a modification code
 */
public class UserInput {
	Scanner sc= new Scanner(System.in);

	//method to ask user to provide a modification code: 
	 String AskForInput() {
		 System.out.println("Please enter a modification code. If using letters, please use capitalization.");
		 String userModCode= sc.nextLine();
		 System.out.println("You entered : " + userModCode);
		 return userModCode;

}//end method AskForInput()
	 
}//end class UserInput
