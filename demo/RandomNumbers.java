/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//import libraries to accept input from the user.
import java.util.*;
class RandomNumbers{
	public static void main(String[] args) {
		Random ran = new Random();

		//Creating arrays to store 10 rnadom integers.
		int rn[] = new int[10];

		//Creating variables 
		int sum=0;
		double avg=0.0;

		//generating random numbers and add them to array.
		for(int i=0;i<10;i++)
		{
			//Random Number between 0 to 20
			rn[i] = ran.nextInt(20);
			sum+=rn[i];
		} 

		//Averaging or Calculating the mean.
		avg = (double)sum/10;

		//Displaying the Ouptput
		System.out.println("\tThe mean or average of values ");
		for(int i=0;i<10;i++){
			System.out.println("\t" + rn[i]);
		} 	
		System.out.println("\tis "+ avg);
	}
	
}
