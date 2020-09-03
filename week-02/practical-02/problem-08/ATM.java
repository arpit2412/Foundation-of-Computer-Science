/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 
* name: Arpit Garg
*
*/


//import libraries to accept input from the user.

//Using IO package as taking input from console

import java.io.*;
class ATM{
	
	//Main Block
	public static void main(String[] args) {
		//Exception Handling
		try{
			int cash;
			InputStreamReader input = new InputStreamReader(System.in);
			System.out.println("Enter the amount of cash");
			cash = Integer.parseInt(System.console().readLine());
			run(cash);
		}catch(Exception e){
			System.out.println(e);				//Printing exception if occurs
		}
	}

	//Run function to calculate number of notes
	public static void run(int cash) {
		System.out.printf("The amount of cash: %d\n", cash);

		//Creating variables
		int fiftyNote=0, twentyNote=0,remainAmount=0;

		//to calculate number of 20 and 50 notes to withdraw if possible
		if(cash%10 ==0){
			//the values of cash are constrained as these are not hard coded
			if(cash == 10 || cash ==30){
				System.out.println("Sorry, the value you input cannot be withdrew");  //Because only 20 and 50 notes can be used
			}else if((cash/10)%2==1){
				if((cash%100)>=50){
					fiftyNote += (cash/50);
					remainAmount = cash%50;
					twentyNote += (remainAmount/20);
				}else{
					fiftyNote += (cash/50);
					fiftyNote -= 1;
					remainAmount = (cash%50)+50;
					twentyNote += (remainAmount/20);
				}
			}else{
				fiftyNote += (cash/100)*2;
				remainAmount = cash % 100;
				twentyNote += (remainAmount/20);
			}
		}else{
			System.out.println("Sorry, the value you input cannot be withdrew");     // If the value cannot be withdrew using 50$ and 20$ notes then  display the error message  
		}
		if(twentyNote != 0 || fiftyNote != 0){
			System.out.println("twenty "+twentyNote+" fifty "+fiftyNote);
		}
	}	
}
