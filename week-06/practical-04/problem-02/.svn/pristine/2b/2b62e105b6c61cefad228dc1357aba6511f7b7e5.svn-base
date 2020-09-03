/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 
* name: Arpit Garg
*
*/
//import libraries to accept input from the user
import java.util.*;
class Test{
	public static void main(String[] args) {	
		//Exception Handling
		try{
			//for user input 
			Scanner input = new Scanner(System.in);
			System.out.println("\n----------------------\n");
			System.out.println("Welcome to Handshakes Game");
			System.out.println("\n----------------------\n");
			
			//Entering the value of temp
			System.out.println("Enter the value of new People: ");
			int nTmp = input.nextInt();

			//Calling parameterised constructor
			ShakingParty sp = new ShakingParty(nTmp);
			int nPeople = sp.getPeople();						//Getting total number of people
			System.out.println("\n----------------------\n");
			System.out.println("Toal number of people including new People: " + nPeople);
			System.out.println("\n----------------------\n");
			System.out.println("Total number of Hand Shakes: " + sp.countHandShakes(nPeople));
			System.out.println("\n----------------------\n");
		}catch(Exception e){
			System.out.println("Exception: " + e);
		}
	}	
}