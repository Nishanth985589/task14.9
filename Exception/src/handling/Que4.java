package handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Que4 {

	public static void main(String[] args) throws FileNotFoundException {
		
		try {
		File file = new File("E://file.txt");	
		FileReader tr = new FileReader(file);
		}
		catch(FileNotFoundException e) {
			System.out.println("File does not available");
		}
	}
}
