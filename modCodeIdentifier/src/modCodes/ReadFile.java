/**
 * 
 */
package modCodes;



import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Ryan Olsen
 * Read file, create an array of all modification codes. Each code is a new string in the array
 * "C:\\Users\\Ryan Olsen\\Documents\\PartNumber\\Mods.txt"
 */
public class ReadFile {
	
	static ArrayList<String> createList()  {
	ArrayList<String> modList = new ArrayList<>(); //create array list
	 
	//Read the file. Each new line is adds a new string to the array modList
	try (FileReader f = new FileReader("C:\\Users\\Ryan Olsen\\git\\repository\\modCodeIdentifier\\Mods.txt")) {
	    StringBuffer sb = new StringBuffer();
	    while (f.ready()) {
	        char c = (char) f.read();
	        if (c == '\n') {
	        	modList.add(sb.toString());
	            sb = new StringBuffer();
	        } else {
	            sb.append(c);
	        }
	    }
	    if (sb.length() > 0) {
	    	modList.add(sb.toString());
	    }
	} catch (IOException exc) {
		System.out.println("File Input/Output Error: " + exc);
	}
	
	return modList;

} //end method createList()
} //end class ReadFile
	

