/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//import libraries to accept input from the user.
import java.util.*;
class primeNumber{
	public static void main(String[] args) {
		
		//Creating variables
		int n;
		int a = 1;

		//Scanner input
		Scanner input = new Scanner(System.in);
		primeCheck p = new primeCheck();
		
		//Handling Exceptions
		try{
			System.out.println("\nWelcome User!!\n");
			while(a==1){
				System.out.println("\nEnter a number you want to check for Prime:\n");
				n = input.nextInt();							//Taking input from the user
				p.primeCheck(n);
				System.out.println("\nDo you want to check any other number\n");		//Continue checking tto check or exit
				try{
					System.out.println("\n1.) Yes \n2.) Exit\n");
					a = input.nextInt();
				}catch(InputMismatchException e){
					System.err.println("\nEntered value not an integer\n");
					e.printStackTrace();
				}
			}
			System.out.println("\nHave a nice day !!\n");
		}catch(InputMismatchException e){												//If user input String instead of number
			System.err.println("\nEntered value not an integer\n");
			e.printStackTrace();
		}catch(Exception e){															//Catching other exceptions
			System.out.println("Exception: "+ e);
		}
	}	
}