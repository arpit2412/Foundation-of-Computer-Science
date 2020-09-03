/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//import libraries to accept input from the user.
import java.util.*;
class HoriStairs{
	public static void main(String[] args) {
		//Exception Handling
		try{
			Random ran = new Random();
			System.out.println("Welcome to Horizontal Stairs !!!!");

			//Creating arrays to store 10 random integers.
			int rn[] = new int[10];

			//Creating variables 
			int sum=0;

			//generating random numbers.
			for(int i=0;i<10;i++)
			{
				//Random Number between 0 to 20
				rn[i] = ran.nextInt(20);
			} 

			//Horizontal Stairs formation with displaying of the output.
			System.out.println("\tThe Horizontal Stairs are : ");
			for(int i=0;i<10;i++){
				System.out.print("Number(" + rn[i] + "):\t");
				for (int j=1;j<=rn[i];j++){
					System.out.print("*");
				}
				System.out.println();
			} 
		}catch(Exception e){
			System.out.println(e);				//Printing exception if occurs
		}	
	}	
}
