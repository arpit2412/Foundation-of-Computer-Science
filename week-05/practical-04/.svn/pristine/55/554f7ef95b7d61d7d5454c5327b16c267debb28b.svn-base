/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//class human child class of player 
import java.util.*;
class Human extends Player{
	public String input;
	Scanner in = new Scanner(System.in);
	//Overriding the performmove and return the string
	@Override
	public String performMove(){
		//exception handling 
		try{
			System.out.println("\n-----------------------------------\n");
			System.out.println("Select:  \n1.Rock  \n2.Paper \n3.Scissor");
			System.out.println("\n-----------------------------------\n");
			input = in.nextLine();													//users choice
			if(input.equalsIgnoreCase("Rock")){
				return "Rock";
			}else if(input.equalsIgnoreCase("Paper")){
				return "Paper";
			}else if(input.equalsIgnoreCase("Scissor")){
				return "Scissor";
			}else{
				return input;
			}
		}catch (Exception e){									
			System.out.println("Exception: " + e);								//showing exceptions if occurs
			return "Error wrong input!!";
		}
	}
		
}