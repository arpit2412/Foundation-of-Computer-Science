/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//import libraries to accept input from the user.
import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String valid;
		String option;
		System.out.println("\n-----------------------------------\n");
		System.out.println("Enjoy the Game!!");
		System.out.println("\n-----------------------------------\n");
		
		//Refree 
		Referee r = new Referee();
		r.getName();		//get the name of the user and computer
		
		//Exception Handling
		try{
			do{
				valid = r.move();			//perform move
				System.out.println("\n-----------------------------------\n");
				int validity = r.valid(valid);				//Check the validity 
				if (validity==1){
					r.start(valid);			//game starts 
				}else{
					break;
				}
				System.out.println("\n-----------------------------------\n");
				System.out.println("Do you want to continue!! (Y/N)");
				option = input.nextLine();
				System.out.println("\n-----------------------------------\n");
				if(option.equalsIgnoreCase("Y") || option.equalsIgnoreCase("N"));
				else{
					System.out.println("Wrong Choice!!");
				}
			}while(option.equalsIgnoreCase("Y"));				//Continue y or n

			r.output();
		}catch(Exception e){							
			System.out.println("Exception: " + e);				//Showing exception if exists
		}
	}
}