package filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Openfile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String fileName = "C:/Users/abhin/OneDrive/Desktop/info.txt";
		
		File textFile = new File(fileName);
		
		Scanner s = new Scanner(textFile);
		
		int value = s.nextInt();
		System.out.println(value);
		
		s.nextLine();
		
		int count=2;
		while(s.hasNextLine()) {
			String line = s.nextLine();
			System.out.println(count +":"+ line);
			count++;
		}
		
		

	}

}
