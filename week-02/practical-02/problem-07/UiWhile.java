/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//import libraries to accept input from the user.
import java.util.*;
class UiWhile{
	public static void main(String[] args) {
		//Exception Handling
		try{
			Random ran = new Random();
			Scanner input = new Scanner(System.in);

			//Creating variables
			char option;
			int numA,numB,numC,count=0,sum=0;
			boolean flag = false;
			float avg = 0.0f;

			//Creating arrays to store 10 random integers.
			int rn[] = new int[10];
			
			//generating random numbers.
			for(int i=0;i<10;i++){
				//Random Number between 0 to 20
				rn[i] = ran.nextInt(20);
				sum +=rn[i];
			} 

			//Calculating average
			avg = (float) sum/10;

			System.out.println("Welcome dear user!");
			
			//while loop running User Interface
			while (!flag){
				System.out.println("Would you like to:");
				//Select the option
				if(count==0){
					System.out.println("a) Sum");
					System.out.println("b) exit");
				}else{
					System.out.println("a) Sum again");
					System.out.println("b) exit");
				}
				System.out.print("Option: ");
				option = input.next().charAt(0);

				//option a for addition and b for exit
				if (option == 'a'){
					System.out.println("Please, insert the first number: ");
					numA = input.nextInt();
					System.out.println("Please, insert the second number: ");
					numB = input.nextInt();
					numC =numA + numB;
					count++;
					System.out.println("----");
					System.out.printf("Thank you for your enquiry, the sum between %d and %d is %d. \n", numA, numB, numC);
				} else if(option == 'b'){
					System.out.println("Thank you! Have a good day.");
					flag = true;
				}
			}
		}catch(Exception e){
			System.out.println(e);					//Printing Exception if occurs
		}
	}
}