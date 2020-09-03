/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/


//importing libraries to accept input from the user.
import java.util.Scanner;

class division{
	public static void main(String[] args) {

		//Creating Variables		
		int number_a, number_b;
		float number_c=0.0f;

		//Input by user
		Scanner input = new Scanner(System.in); 
		System.out.println("Welcome to Division of a number !!!!");

		//Input 1
		System.out.println("Enter the first number (Dividend)");
		number_a = input.nextInt();	

		//Input 2		
		System.out.println("Enter the second number (Divisor)");
		number_b = input.nextInt(); 

		//Dividing and printing the ouput
		if(number_b!=0){
			number_c = (float)number_a / number_b;
			System.out.println("The divison of " + number_a + " and " + number_b + " is " + number_c);

		}else{
			System.out.println("Undefined (Divisor cannot be zero)");  //Divisor can't be zero otherwise undefiend.
		}
	}
}
