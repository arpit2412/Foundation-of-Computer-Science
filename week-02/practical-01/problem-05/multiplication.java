/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/


//importing libraries to accept input from the user.
import java.util.Scanner;

class multiplication{
	public static void main(String[] args) {

		//Creating Variables		
		int number_a, number_b, number_c;

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Multiplication of number !!!!");

		//User Input 1
		System.out.println("Enter the first number");
		number_a = input.nextInt();

		//User Input 2
		System.out.println("Enter the second number");
		number_b = input.nextInt();
		
		//Multiplying the inputs
		number_c = number_a * number_b;

		//Printing the output
		System.out.println("The multiplication of " + number_a + " and " + number_b + " is " + number_c);
	}
}
