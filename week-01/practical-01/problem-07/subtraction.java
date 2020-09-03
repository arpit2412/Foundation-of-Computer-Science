/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/


//importing libraries to accept input from the user.
import java.util.Scanner;

class subtraction{
	public static void main(String[] args) {

		//Creating Variables 		
		int number_a, number_b;
		float number_c=0.0f;

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Subtraction !!!!");

		//Input by User
		System.out.println("Enter the first number");
		number_a = input.nextInt(); //Input 1

		System.out.println("Enter the second number");
		number_b = input.nextInt(); //Input 2

		//Block for subtacting
		number_c = (float)number_b - number_a; //Subtract b from a

		//Displaying the output
		System.out.println("the subraction of " + number_a + " and " + number_b + " is " + number_c);
	}
}
