/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/

//importing libraries to accept input from the user.
import java.util.Scanner;

class student{
	public static void main(String[] args) {

		//Creating Variables
		String name,fav_food;
		int age,height, weight, num_of_sub;
		char grade_m,grade_e;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Student Details Software !!!!");

		//Entering the details of the Student
		System.out.println("Enter the name of the student: ");
		name = input.nextLine(); //name
		System.out.println("Enter the age of the student: ");
		age = input.nextInt(); //age
		input.nextLine();
		System.out.println("Enter the favorite food of the student: ");
		fav_food = input.nextLine(); //favorite food
		System.out.println("Enter the grade of student in maths: ");
		grade_m = input.next().charAt(0); //Grade in Maths
		System.out.println("Enter the grade of the student in english: ");
		grade_e = input.next().charAt(0); //Grade in English 
		System.out.println("Enter the height of the student (in cms): ");
		height = input.nextInt(); //Height
		System.out.println("Enter the weight of the student (in kgs): ");
		weight = input.nextInt(); //Weight
		System.out.println("Enter the number of subjects: ");
		num_of_sub = input.nextInt(); //Number of Subject
		
		//Displaying the details of the Student
		System.out.println("The details of the student are as follows: ");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Favorite Food: "+fav_food);
		System.out.println("Grade in Maths: "+grade_m);
		System.out.println("Grade in English: "+grade_e);
		System.out.println("Height: "+height);
		System.out.println("Weight: "+weight);
		System.out.println("Number of Subjects: "+num_of_sub);
	}
	
}
