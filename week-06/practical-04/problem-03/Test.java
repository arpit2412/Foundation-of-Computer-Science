/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 
* name: Arpit Garg
*
*/
//Importin libraries
import java.util.*;
public class Test{
	public static void main(String[] args){
		//Exception Handling
		try{
			//for user input 
			Scanner input= new Scanner(System.in);
			System.out.println("\n----------------------\n");
			System.out.println("Welcome to Couple Handshakes Game");
			System.out.println("\n----------------------\n");
			
			//Entering the value of temp
			System.out.print("Enter the number of couples want to add:  ");			
			int nCouples =input.nextInt();

			//Calling parameterised constructor
			ShakingPartyConstrained sc = new ShakingPartyConstrained(nCouples);	
			nCouples = sc.getCouples();
			System.out.println("\n----------------------\n");			
			System.out.println("Total number of couples including new couples: "+ nCouples);		
			System.out.println("\n----------------------\n");		
			int handshakes = sc.countHandShakes(nCouples);	
			System.out.println("Total number of handshakes: "+ handshakes);	
			System.out.println("\n----------------------\n");	
		}catch(Exception e){
			System.out.println("Exception: " + e);
		}
	}
}