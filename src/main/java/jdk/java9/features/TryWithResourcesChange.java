package jdk.java9.features;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesChange {

	public static void main(String[] args) throws FileNotFoundException {
		String filePath = "myapp-log.txt";
		readFile(filePath);
	}
	
	private static void readFile(String filePath) throws FileNotFoundException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
		
		try (bufferedReader){
			String readLine;
			while((readLine = bufferedReader.readLine()) != null) {
				System.out.println(readLine);
			}
		} catch (IOException e) {
			/* some logger */
		}
	}

}
