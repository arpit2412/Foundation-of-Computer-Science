/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/

//importing libraries to accept input from the user.
import java.util.Scanner;

class dog{
	public static void main(String[] args) {

		//Creating Variables
		String name,fav_food,fav_toy,owners_name;
		int age,height, weight;

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Dog Entry Software !!!!");
	
		//Entering the details of the Dog(poppy)
		System.out.println("Enter the name of the Dog(poppy): ");
		name = input.nextLine(); //name
		System.out.println("Enter the age of the Dog(poppy): ");
		age = input.nextInt(); //age
		input.nextLine();
		System.out.println("Enter the favorite food of the Dog(poppy): ");
		fav_food = input.nextLine(); //favorite food
		System.out.println("Enter the height of the Dog(poppy) (in cms): ");
		height = input.nextInt(); //height
		System.out.println("Enter the weight of the Dog(poppy) (in kgs): ");
		weight = input.nextInt(); //weight
		input.nextLine();
		System.out.println("Enter the favorite toy of the Dog(poppy) : ");
		fav_toy = input.nextLine(); //favorite toy
		System.out.println("Enter the Owner's name of the Dog(poppy)");
		owners_name = input.nextLine(); //Owner's Name
		
		//Displaying the details of the Dog(poppy)
		System.out.println("The details of the Dog(poppy) are as follows: ");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Favorite Food: "+fav_food);
		System.out.println("Height: "+height);
		System.out.println("Weight: "+weight);
		System.out.println("Favorite Toy: "+fav_toy);
		System.out.println("Owner's Name: "+owners_name);
	}
	
}
