/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//importing libraries
import java.util.*;
class Main{

	//Main execution starts from here
	public static void main(String[] args) {
		
		//Exception Handling
		try{
			Scanner input = new Scanner(System.in);
			System.out.println("\n--------------------\n");
			System.out.println("\nWelcome User!!!!\n");
			System.out.println("\n--------------------\n");
			System.out.println("\nEnter the width and height of the retangle separated by space : \n");
			
			String[] arr=input.nextLine().split(" ");					//take string array separated by space " "
		
			int width = Integer.parseInt(arr[0]);
			int height = Integer.parseInt(arr[1]);

			if((height >= 1 && width >=1 ) && (height <=1000 && width <= 1000)){
				RectangleArea r = new RectangleArea();
				r.read_input(width,height);
				r.display();
			}else{
				System.out.println("\nWrong input!! (Out of constraint)\n");
			}
		}catch(Exception e){								//Catch Exception
			System.out.println("\nException: " + e);
		}		
	}
}