/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//class refree 
class Referee{

	//creating variables 
	public int valid;
	public int count=0 , count1=0;
	public String uinput,choice;

	//Polymorohism
	Player com = new Computer();
	Player human = new Human();

	//name of the user and computer
	public void getName(){
		System.out.println("Player Info: ");
		human.name();
		System.out.println("\n-----------------------------------\n");
		System.out.println("Computer Info: ");
		com.name();
	}

	//select the choice of the user
	public String move(){
		choice = human.performMove();
		return choice;
	}

	//check the validity of the move
	public int valid(String choice){
		if(choice.equalsIgnoreCase("Rock") || choice.equalsIgnoreCase("Paper") || choice.equalsIgnoreCase("Scissor")){
			valid = 1;
		}else{
			valid = 0;
			System.out.println("Error!! Not a valid input....");
			System.out.println("Have a nice day!");
		}
		return valid;
	}	

	//game starts
	public void start(String uinput){
		this.uinput = uinput;						//user input
		String cinput = com.performMove();			//computer random input
		System.out.println(human.getName() + "'s choice: ");
		human.display(uinput);
		System.out.println("\n-----------------------------------\n");
		System.out.println(com.getName() + "'s choice: ");
		com.display(cinput);
		System.out.println("\n-----------------------------------\n");		 
		if(uinput.equalsIgnoreCase(cinput)){
			System.out.println("Tie");				//if both choices are equal then tie
		}else if ( (uinput.equalsIgnoreCase("Rock") && cinput.equalsIgnoreCase("Scissor")) || (uinput.equalsIgnoreCase("Scissor") && cinput.equalsIgnoreCase("Paper")  ) || (uinput.equalsIgnoreCase("Paper") && cinput.equalsIgnoreCase("Rock")) )
		{
			System.out.println(human.getName() + " Wins!");							//user conditions to win
			count++;
		}
		else 																		//computer wins
		{
			System.out.println(com.getName() + " Wins!");
			count1++;
		}
	}

	public void output(){														//final results

		System.out.println("\n-----------------------------------\n");
		System.out.println(human.getName() + ": ");
		System.out.println(count);
		System.out.println(com.getName() + ": ");
		System.out.println(count1);
		System.out.println("\n-----------------------------------\n");
		if(count>count1){
			System.out.println("Final results: " + human.getName() + " is Winner");
		}else if (count1 >count){
			System.out.println("Final results: "+ com.getName() + " is Winner");
		}else if(count == count1){
			System.out.println("Game Tie!! ");
		}
		System.out.println("\n-----------------------------------\n");
	}
}