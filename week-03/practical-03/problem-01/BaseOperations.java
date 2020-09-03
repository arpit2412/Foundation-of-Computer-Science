/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//import libraries to accept input from the user.
import java.util.*;
class BaseOperations{

	//Main:Execution starts from here
	public static void main(String[] args) {
		try{
			//Creating array to take input from user and to reverse the array
			int [] arrInt = new int[20];
			String arrString[] = new String[20];
			float arrFloat[] = new float[20];
			int revarr [] = new int [20];
			float revf [] = new float[20]; 
			String revString[] = new String[20];

			//Creating Variables
			int n;

			//Scanner for taking input from the user
			Scanner input = new Scanner(System.in);

			//Creating object for Printing array class
			printArray p = new printArray();

			//Creating object for Reversing array class
			reverseArray r = new reverseArray();

			System.out.println("\n");

			System.out.println("Hello Dear User !!!!");
			System.out.println();
			System.out.println("What you want to enter \n a.) Integer \n b.) String \n c.) Float\n");	//User need to select between int string and float
			char a = input.next().charAt(0);  //Taking input as a character from the user
			

			//for integer
			if(a=='a'){
				System.out.println("Enter the number of inputs you want to add: ");
				n = input.nextInt();							//Asking user for how many inputs maximum 20
				System.out.println("Enter integer!!");
				for(int i=0;i<n;i++){
					arrInt[i] = input.nextInt();				//Taking input from the user
				}
				System.out.println();

				//Printing array in order
				System.out.println("Order");
				p.printArray(arrInt,n);

				//Reversing the array
				revarr = r.reverseArray(arrInt,n);
				System.out.println();	

				//Printing the array in reverse order
				System.out.println("Reverse Order");
				p.printArray(revarr,n);
			}else if (a =='b'){																	// for String
				System.out.println("Enter the number of inputs you want to add: ");
				n = input.nextInt();		 //Asking user for how many inputs maximum 20
				input.nextLine();			//for ignoring the last character and we can accept thg desired input
				System.out.println("Enter Strings!!");
				for(int i=0;i<n;i++){					
					arrString[i] = input.nextLine();			//Taking input from the user
				}
				System.out.println();

				//Printing array in order
				System.out.println("Order");
				p.printArray(arrString,n);

				//Reversing the array
				revString = r.reverseArray(arrString,n);
				System.out.println();

				//Printing the array in reverse order
				System.out.println("Reverse Order");
				p.printArray(revString,n);

			}else if (a == 'c'){														//for float
				System.out.println("Enter the number of inputs you want to add: ");
				n = input.nextInt();		//Asking user for how many inputs maximum 20
				System.out.println("Enter Floats!!");
				for(int i=0;i<n;i++){
					arrFloat[i] = input.nextFloat();							//Taking input from user
				}
				System.out.println();

				//Printing array in order
				System.out.println("Order");
				p.printArray(arrFloat,n);

				//Reversing the array
				revf = r.reverseArray(arrFloat,n);
				System.out.println();

				//Printing the array in reverse order
				System.out.println("Reverse Order");
				p.printArray(revf,n);
			}else{
				System.out.println("Wrong Input!!");
			}
		}catch(Exception e){
			System.out.println(e);
		}	
	}
}