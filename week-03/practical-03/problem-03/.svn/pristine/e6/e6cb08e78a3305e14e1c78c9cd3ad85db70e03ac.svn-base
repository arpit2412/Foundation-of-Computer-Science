/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//import libraries to accept input from the user.
import java.util.*;
class findBig{
	public static void main(String[] args) {
		
		//Creating variables
		int a ,b ;

		//Scanner input
		Scanner input = new Scanner(System.in);
		bigCheck br = new bigCheck();
		//Handling Exceptions
		try{

			System.out.println("Enter a first number: ");  							//Taking input from the user
			a = input.nextInt();
			System.out.println("Enter a second number: ");
			b = input.nextInt();
			br.bigCheck(a,b);
	
		}catch(InputMismatchException e){												//If user input String instead of number
			System.out.println("\nEntered value is not an integer\n");
			System.out.println("Exception: "+e);
		}catch(Exception e){															//Catching other exceptions
			System.out.println( e);
		}
	}	
}