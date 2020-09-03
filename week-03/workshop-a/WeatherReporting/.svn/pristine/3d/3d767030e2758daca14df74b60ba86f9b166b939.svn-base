
//import java libraries
import java.util.*;

class Main{
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			//creating arrays and variabes
			float[] temp = new float [31];
			int[] count = {0,0,0,0,0,0};
			int days;

			System.out.println("Enter the number of days in the month: ");
			days = input.nextInt();
			for(int i=0; i<days ;i++){
				System.out.printf("Enter the maximum temperature of day %d: \n", i+1);
				temp[i] = input.nextFloat();
			}

			//Print Maximum temperature of each days
			System.out.println();
			System.out.println("----------------------------------------");
			for(int i=0;i<days;i++){
				System.out.printf("Maximum temperature of day %d is : %f  \n", i+1, temp[i]);
			}

			//count the number of days according to temperature
			for(int i=0;i<days;i++){
				if(temp[i]>=0.0 && temp[i]<=10.0){
					count[0]++;
				}
				else if(temp[i]>10.0 && temp[i]<=20.0){
					count[1]++;
				}
				else if(temp[i]>20.0 && temp[i]<=30.0){
					count[2]++;
				}
				else if(temp[i]>30.0 && temp[i]<=40.0){
					count[3]++;
				}
				else if(temp[i]>40.0 && temp[i]<=50.0){
					count[4]++;
				}
				else if(temp[i]> 50.0){
					count[5]++;
				}
			}

			//Printing our final output
			System.out.println();
			System.out.println("----------------------------------------");
			System.out.printf("Number of days having temperature between 0-10 are: %d \n" , count[0]);
			System.out.printf("Number of days having temperature between 10-20 are: %d \n" , count[1]);
			System.out.printf("Number of days having temperature between 20-30 are: %d \n" , count[2]);
			System.out.printf("Number of days having temperature between 30-40 are: %d \n" , count[3]);
			System.out.printf("Number of days having temperature between 40-50are: %d \n" , count[4]);
			System.out.printf("Number of days having temperature greater than 50 %d \n" , count[5]);

	}
	
}