/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//class computer child class of player 	
import java.util.Random;
class Computer extends Player{
	public int choice;
	//Overriding the performmove and return the string
	@Override
	public String performMove(){
		Random random = new Random();				
		choice = random.nextInt(3);					//Randomly generating the choices
       if(choice == 0){
       	return "Rock";
       }else if(choice == 1){
       	return "Paper";
       }else{
       	return "Scissor";
       }
   }

}