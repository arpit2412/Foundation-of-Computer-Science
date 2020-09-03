/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//importing libraries 
import java.util.*;
class detA{

	//Main: Execution starts here
	public static void main(String[] args) {
		try{
			//for input 
			Scanner input = new Scanner(System.in);
			
			//Creating variables
			String a;
			String matrix2 = "2X2";
			String matrix3 = "3X3";
			int b,bt,option =1;
			//creating object
			calcDet c = new calcDet();
			int two[][] = new int[2][2];
			int three[][] = new int[3][3];

			while(option == 1){
				System.out.println("Welcome to Matrix Determinant Calculator!");
				
				//Entering the size of the matrix
				System.out.println("Enetr size of matrix 2X2 or 3X3 ");
				a = input.nextLine();
				System.out.println("Enter the elements of the array !! ");

				//if Matrix size is 2X2		
				if(a.equalsIgnoreCase(matrix2)){
					for(int i =0;i<2;i++){
						for(int j=0;j<2;j++){
							System.out.printf("New Matrix[%d][%d]: \t",i,j  );
							two[i][j] = input.nextInt();
						}
					}
					System.out.println();
					System.out.println("Matrix is: ");
					for(int i=0;i<2;i++){
						for(int j=0;j<2;j++){
							System.out.print(two[i][j] + "\t");						//printing the matrix
						}
						System.out.println();
					}
					b = c.calcDet(two,2);											//calculating 2x2 determinant
					System.out.println("The determinant is: " + b);
				}else if (a.equalsIgnoreCase(matrix3)){								//if Matriz size is 3
					for(int i =0;i<3;i++){
						for(int j=0;j<3;j++){
							System.out.printf("New Matrix[%d][%d]: \t",i,j  );
							three[i][j] = input.nextInt();					
						}
					}
					System.out.println();
					System.out.println("Matrix is: ");
					for(int i=0;i<3;i++){										//printing the matrix
						for(int j=0;j<3;j++){
							System.out.print(three[i][j] + "\t");
						}
						System.out.println();
					}
					bt = c.calcDet(three,3);									//calculating 3x3 determinant
					System.out.println("The determinant is: " + bt);
				}
				System.out.println("Would you like to calculate the determinant of a new matrix? \n1. Yes, 2. No");
				option = input.nextInt();
				input.nextLine();
			}
			System.out.println("Have a nice day!!");
		}catch(Exception e){
			System.out.println("Exception: " + e);
		}
	}
}