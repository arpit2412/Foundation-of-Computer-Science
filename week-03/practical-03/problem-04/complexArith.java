/*
*
* Foundations of Computer Science
* Semester 0.02 Year 20.019
* id: a17840.072 name: Arpit Garg
*
*/
//importing libraries 
import java.util.*;
class complexArith{
	
	//Adding complex number
	public static void add(float r1, float c1, float r2, float c2){
		float rr, cr;
		rr = r1+r2;
		cr = c1+c2;
		System.out.println("Addition of " + r1 +" + " + c1 + "i and " + r2 + " + " + c2  + "i");
		if(cr>=0.0){
			System.out.println("Result: " + rr + " + " +cr +"i");
		}else{
			System.out.println("Result: " + rr + cr +"i");
		}
	}

	//Subtracting complex number
	public static void sub(float r1, float c1, float r2, float c2){
		float rr, cr;
		rr = r1-r2;
		cr = c1-c2;
		System.out.println("Subtraction of " + r1 +" + " + c1 + "i and " + r2 + " + " + c2  + "i");

		if(cr>=0.0){
			System.out.println("Result: " + rr + " + " +cr +"i");
		}else{
			System.out.println("Result: " + rr + cr +"i");
		}
	}

	//Multiplying of complex number
	public static void mul(float r1, float c1, float r2, float c2){
		float rr, cr;
		rr = r1*r2;
		cr = c1-c2;

		rr = r1*r2 - c1*c2;
		cr = c1*r2 + r1*c2;
		System.out.println("Multiplication of " + r1 +" + " + c1 + "i and " + r2 + " + "+ c2  + "i");


		if(cr>=0.0){
			System.out.println("Result: " + rr + " + " +cr +"i");
		}else{
			System.out.println("Result: " + rr + cr +"i");
		}
	}

	//Division of complex number
	public static void div(float r1, float c1, float r2, float c2){
		float x,y,z;


		//if denominator is zero
		if(r2 == 0.0 && c2 == 0.0 ){
			System.out.println(" 0.0+0.0i Divsion not Allowed");
		}
		else{

		System.out.println("Division of " + r1 +" + " + c1 + "i and " + r2 + " + " + c2  + "i");


			//Divsion
			x = r1*r2 + c1*c2;
			y = c1*r2 - r1*c2;
			z = r2*r2 + c2*c2;

			if (x%z == 0.0 && y%z == 0.0)
			{
				if (y/z >= 0.0)
					System.out.printf("Result: %f + %fi\n", x/z, y/z);
				else
					System.out.printf("Result: %f %fi\n", x/z, y/z);
			}else if (x%z == 0.0 && y%z != 0.0){
				if (y/z >= 0.0)
					System.out.printf("Result:Result: %f + %f/%fi\n", x/z, y, z);
				else
					System.out.printf("Result: %f %f/%fi\n", x/z, y, z);
			}else if (x%z != 0.0 && y%z == 0.0){
				if (y/z >= 0.0)
					System.out.printf(" Result: %f/%f + %fi\n", x, z, y/z);
				else
					System.out.printf("Result: %f %f/%fi\n", x, z, y/z);
			}else{
				if (y/z >= 0.0)
					System.out.printf("Result: %f/%f + %f/%fi\n",x, z, y, z);
				else
					System.out.printf("Result: %f/%f %f/%fi\n", x, z, y, z);
			}
		}		
	}


	//Main: Execution starts from here
	public static void main(String[] args) {
		
		//Creating variables
		int a;
		float r1,r2,c1,c2;

		//Scanner for input from user
		Scanner input = new Scanner(System.in);
		

		//Exception Handling
		try{
			//Input from user
			System.out.println("Enter your choice \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Divsion");
			a = input.nextInt();									//Arithmetic operation choice
			System.out.println("Enter real part 1: ");
			r1 = input.nextFloat();									//Real Part 1
			System.out.println("Enter imaginary part 1: ");
			c1 = input.nextFloat();									//Imaginary Part 1
			System.out.println("Enter real part 2: ");		
			r2 = input.nextFloat();									//Real Part 2
			System.out.println("Enter imaginary part 2: ");
			c2 = input.nextFloat();									//Imaginary Part 2
			
			switch(a){
				case 1: add(r1,c1,r2,c2);
				break;
				case 2: sub(r1,c1,r2,c2);
				break;
				case 3: mul(r1,c1,r2,c2);
				break;
				case 4: div(r1,c1,r2,c2);
				break;
				default: System.out.println("Wrong Choice !!");
			}
		}catch(Exception e){								//Catching exception if any
			System.out.println("Exception: " + e);
		}
	}
}
