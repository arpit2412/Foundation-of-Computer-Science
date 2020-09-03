
/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/


//importing libraries to accept input from the user.
import java.util.Scanner;

class addition{
	public static void main(String[] args) {

		
		//Creating Variables		
		int number_a, number_b, number_c;

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Addition of Number !!!!");

		//Accepting value 1 from the user
		System.out.println("Enter the first number");
		number_a = input.nextInt();

		//Accepting value 2 from the user
		System.out.println("Enter the second number");
		number_b = input.nextInt();

		//Adding the accepted value		
		number_c = number_a + number_b;
		
		//Printing the output
		System.out.println("the sum of " + number_a + " and " + number_b + " is " + number_c);
	}
}
