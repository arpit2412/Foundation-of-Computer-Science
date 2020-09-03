import java.util.*;
class Computer extends Player{
	public String performMove(){
		Random ran = new Random();
		int choice = ran.nextInt(2);
		if(choice == 1){
			return("Rock");
		}else if(choice == 2){
			return("Paper");
		}else{
			return("Scissor");
		}
	}	
	
}