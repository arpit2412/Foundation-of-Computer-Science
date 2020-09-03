/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//import libraries to accept input from the user.
import java.util.*;

class Main{
	public static void main(String[] args) {

		int option;
		
		Scanner input = new Scanner(System.in);
		Person pp = new Person();
		Shape ss = new Shape();
		Book bb = new Book();
		Animal aa = new Animal();
		//Handling Exceptions
		try{
			//Default Constructor
			System.out.println("Default Values Basic Constructor");
			System.out.println("Name: "+pp.getgivenName()+" "+pp.getlastName() +"\nAge: "+pp.getAge()+"\nGender: "+ pp.getGender()+"\nCitizenship: "+pp.getCitizenship());
			System.out.println("Width: "+ ss.getWidth() + "\nHeight: " + ss.getHeight() + "\nLength: " + ss.getLength() + "\nRadius: "+ ss.getRadius());
			System.out.println("Title: "+ bb.getTitle() + "\nYear: " + bb.getYear() + "\nPublisher: " + bb.getPublish() + "\nPages: " + bb.getPages());
			System.out.println("Name: " + aa.getName() + "\nWeight: " + aa.getWeight() +"\nFavourite Food: " + aa.getFood() +"\nAge: " + aa.getAge());
			System.out.println("------------------------------");


			System.out.println("Which details you want to enter: \n1. Person \n2. Shape \n3. Book \n4. Animal \n");
			option = input.nextInt();

			if(option == 1){

				System.out.println("Enter the details of the Person: ");
				input.nextLine();

				System.out.println("Enter the first name of the person");

				String fname = input.nextLine();

				System.out.println("Enter the last name of the person");

				String lname = input.nextLine();

				System.out.println("Enter the age of the person: ");

				int age = input.nextInt();

				System.out.println("Enter the gender of the people: ");

				input.nextLine();
				String gender = input.nextLine();

				System.out.println("Enter the citizenship of people:  ");

				String citizenship = input.nextLine();

				Person p = new Person(fname,lname,age,gender,citizenship);		//Parameterized Constructor

				//Mutators
				System.out.println("Name: "+p.getgivenName()+" "+p.getlastName() +"\nAge: "+ p.getAge()+"\nGender: "+ p.getGender()+"\nCitizenship: "+ p.getCitizenship());

				//Accessors
				System.out.println("Do you want to change the name of the person:(Y/N) ");
				String option1 = input.nextLine();										
				if(option1.equals("Y")){
					System.out.println("Enter the first name again: ");
					String nameAg = input.nextLine();
					System.out.println("Enter the last name again: ");
					String lastAg = input.nextLine();
					p.setgivenName(nameAg);
					p.setlastName(lastAg);
					System.out.println("Now the name changes to: " + p.getgivenName() + " " + p.getlastName());
				}else{
					System.out.println("Have a nice day!!");
				}


			}else if(option == 2){

				System.out.println("Enter the width: ");
				double width = input.nextDouble();
				System.out.println("Enter the length: ");
				double length = input.nextDouble();
				System.out.println("Enter the radius: ");
				double radius = input.nextDouble();
				System.out.println("Enter the height: ");
				double height  = input.nextDouble();

				Shape s = new Shape(width ,height, radius, length);		//Parameterised Constructor

				//Mutators
				System.out.println("Width: "+ s.getWidth() + "\nHeight: " + s.getHeight() + "\nLength: " + s.getLength() + "\nRadius: "+ s.getRadius());
				input.nextLine();
				System.out.println("Do you want to change the width of the shape:(Y/N) ");
				String option1 = input.nextLine();

				//Accessors
				if(option1.equals("Y")){
					System.out.println("Enter the length again: ");
					double leng = input.nextInt();
					
					s.setLength(leng);
					
					System.out.println("Now the length changes to: " + s.getLength());
				}else{
					System.out.println("Have a nice day!!");
				}


			}else if(option == 3){
				input.nextLine();
				System.out.println("Enter title of the book: ");
				String tt = input.nextLine();
				System.out.println("Enter year: ");
				int year = input.nextInt();
				input.nextLine();
				System.out.println("Enter publisher: ");
				String publish = input.nextLine();
				System.out.println("Enter number of pages: ");
				int pages = input.nextInt();

				Book b = new Book(tt, year, publish, pages);		//Prameterised Constructor
				
				//Mutator
				System.out.println("Title: "+ b.getTitle() + "\nYear: " + b.getYear() + "\nPublisher: " + b.getPublish() + "\nPages: " + b.getPages());
				input.nextLine();
				System.out.println("Do you want to change the title:(Y/N) ");
				String option1 = input.nextLine();

				//Accessor
				if(option1.equals("Y")){
					System.out.println("Enter the title again: ");
					String titleAg = input.nextLine();
					b.setTitle(titleAg);

					System.out.println("Now Title is: " + b.getTitle());
				}else{
					System.out.println("Have a nice day!!");
				}
			}else if (option == 4){
				input.nextLine();
				System.out.println("Enter name: ");
				String an = input.nextLine();
				System.out.println("Enter Weight: ");
				int we = input.nextInt();
				input.nextLine();
				System.out.println("Enter favourite food: ");
				String foo = input.nextLine();
				System.out.println("Enter age: ");
				int ag = input.nextInt();
				Animal a = new Animal(an,we,foo,ag);		//Parameterised Constructor

				//Mutator
				System.out.println("Name: " + a.getName() + "\nWeight: " +a.getWeight() +"\nFavourite Food: " +a.getFood() +"\nAge: " + a.getAge());
				input.nextLine();
				System.out.println("Do you want to change the name:(Y/N) ");
				String option1 = input.nextLine();

				//Accessor
				if(option1.equals("Y")){
					System.out.println("Enter the name again: ");
					String nameAg = input.nextLine();
					a.setName(nameAg);
					System.out.println("Now the name changes to: " + a.getName());
				}else{
					System.out.println("Have a nice day!!");
				}
			}else{
				System.out.println("Wrong option !!");
			}
		}catch(Exception e){
			System.out.println("Exception: " + e);
		}
	}
}