/**
 * 
 */
package modCodes;

import java.util.ArrayList;

/**
 * @author Ryan Olsen
 * This program takes an existing file of modification codes, reads the file and converts the file to a 
 * String array. It then prompts the user for the desired modification code. Once entered it uses a 
 * for loop to cycle through all existing codes and find a match. If a match is found it is printed to
 * the screen. If no match is found an error message prints stating this fact. 
 */
public class ModCodesDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args)  {
		String userModCode; //declare variable for user modification code
		ArrayList<String> modificationList; //declare an array list of String type
		modificationList = ReadFile.createList(); //use createlist() method to read file and create String array of mod codes
		int i; //declare counter variable
		
		UserInput userMod = new UserInput(); //create new User Input object
		userModCode = userMod.AskForInput(); //use ASkForInput method to prompt user for desired mod code
		
		 
			//search through String array to find a match to user modification code
			for(i = 0; i < modificationList.size(); i++) {
				if (modificationList.get(i).contains(userModCode)) { 
					System.out.println(modificationList.get(i));
					break;				
				}//end if statement				
			}//end for loop

		
			//This statement will print if no match is found and i equals array size
			if (i == modificationList.size()) {
			System.out.println("Error: Modification Code Not Found");
			}//end if statement
		
		}//end main

	}//end class ModCodesDemo


