/**
 * 
 */
package lambdaExamplePackage;

/**
 * @author Ryan Olsen
 * This program uses an interface (class StringFunc) with two lambda expressions in the demo below. 
 * The first expression replaces each space with a dash '-'
 * The second expression capitalizes all text
 */
public class RemoveSpacesDemo {

	public static void main(String[] args) {
		String initial = "This is a simple example of how to use lambda expressions"; 	//initial string
		String OutStr = "";																//output string
		
		System.out.println("I will replace spaces with dashes. \nHere is the initial string: " + initial);
		
		//Lambda expression to use the interface StringFunc(). Replace spaces with dashes
		StringFunc dashes = (str) -> {
			String result = "";
			
			for(int i = 0; i < str.length(); i++)
				if(str.charAt(i) != ' ') result += "-" + str.charAt(i);
			return result;
		};
		
		//call the above lambda expression and print the result (OurStr) to the screen
		OutStr = dashes.func(initial);
		System.out.println("\nHere is the modified string:\n" + OutStr);
		
		System.out.println("\nNow I will capitalize all letters. \nHere is the initial string again: "
				+ initial);
		
		//Lambda expression number two. This capitalizes all characters in the string
		StringFunc capital = (str) -> {
			String result = "";
			result = str.toUpperCase();
			return result;
		};
		
		//call the above lambda expression and print the result (OurStr) to the screen
		OutStr = capital.func(initial);
		System.out.println("\nHere is the modified string:\n" + OutStr);

	}//end main method
}//end class RemoveSpacesDemo
