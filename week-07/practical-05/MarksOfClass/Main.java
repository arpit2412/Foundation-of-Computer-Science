import java.util.*;
import java.io.*;
class Main{
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		String filename = "/users/2/a1784072/Desktop/practical-05/MarksOfClass/students.txt";
		readData(filename);	
	}
	private static void readData(String filename)throws Exception{

		String array = new String[20];
		Scanner inputStream = new Scanner(new FileInputStream(theFile)); 
		String line = inputStream.nextLine(); 
		while (inputStream.hasNextLine()){
		 for (int i = 0; i < array.length; i++){ 
		 array[i] = line;
		 }
		}
		  //dont know what to put here }
	}

}
