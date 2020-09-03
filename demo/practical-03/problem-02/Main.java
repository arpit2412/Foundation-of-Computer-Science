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
		//Exception Handling
		try{
			//Default Constructor
			System.out.println("Default Values Basic Constructor");
			System.out.println("Name: "+pp.getgivenName()+" "+pp.getlastName() +"\nAge: "+pp.getAge()+"\nGender: "+ pp.getGender()+"\nCitizenship: "+pp.getCitizenship());
			System.out.println("Width: "+ ss.getWidth() + "\nHeight: " + ss.getHeight() + "\nLength: " + ss.getLength() + "\nRadius: "+ ss.getRadius());
			System.out.println("Title: "+ bb.getTitle() + "\nYear: " + bb.getYear() + "\nPublisher: " + bb.getPublish() + "\nPages: " + bb.getPages());
			System.out.println("Name: " + aa.getName() + "\nWeight: " + aa.getWeight() +"\nFavourite Food: " + aa.getFood() +"\nAge: " + aa.getAge());
			System.out.println("------------------------------");

			System.out.println("Problem 1 or 2: ");
			int at = input.nextInt();
			if(at ==1 ){
				System.out.println("Which details you want to enter: \n1. Person \n2. Shape \n3. Book \n4. Animal \n");
				option = input.nextInt();

				//Person
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

					//Shape
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

					//Book
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

					//Animal
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
			}else if (at ==2 ){
				
				//Part 2 Child Classes
				System.out.println("Enter \n1. Student \n2. Doctor \n3. Patient \n4. Lecturer \n5. Rectangle \n6. Circle \n7. Triangle \n8. Ebook \n9. Physical Book \n10. Lion \n11. Turle \n12. Chameleon");
				int apt = input.nextInt();
				input.nextLine();
				
				//Student
				if(apt == 1){
					Student s = new Student();
					System.out.println("Enter the first name: ");
					String sname = input.nextLine();
					s.setgivenName(sname);
					System.out.println("Enter the last name: ");
					String lname = input.nextLine();
					s.setlastName(lname);
					System.out.println("Enter age: ");
					int sage = input.nextInt();
					s.setAge(sage);
					input.nextLine();
					System.out.println("Enter marks: ");
					double marks[] = new double[5];
					for(int i=0;i<5;i++){
						marks[i] = input.nextDouble();
					} 
					input.nextLine();
					String dis[] = new String[3];
					System.out.println("Enter disciplines: ");
					for(int i=0;i<3;i++){
						dis[i] = input.nextLine();
					}
					System.out.println("Name: " + s.getgivenName() + " " + s.getlastName() + "\nAge: " + s.getAge());
					s.setMarks(marks);
					double sum = 0;
					marks = s.getMarks();
					double avg = s.averageMarks(marks);
					System.out.println("Average: " + avg );
					s.displayDisciplines(dis);
				}else if(apt == 2){											//Doctor
					Doctor dc = new Doctor();
					System.out.println("Enter the first name: ");
					String dname = input.nextLine();
					dc.setgivenName(dname);
					System.out.println("Enter the last name: ");
					String dlname = input.nextLine();
					dc.setlastName(dlname);
					System.out.println("Enter the speciality: ");
					String spec = input.nextLine();
					dc.setSpeciality(spec);
					System.out.println("Name: " + dc.getgivenName() + " " + dc.getlastName() + "\nSpeciality: " + dc.getSpeciality());
				}else if(apt == 3){											//Patient
					Patient pa = new Patient();
					System.out.println("Enter the first name: ");
					String dname = input.nextLine();
					pa.setgivenName(dname);
					System.out.println("Enter the last name: ");
					String dlname = input.nextLine();
					pa.setlastName(dlname);
					System.out.println("Enter diagnostics: ");
					String diag = input.nextLine();
					System.out.println("Enter in Time: ");
					String inTime = input.nextLine();
					System.out.println("Enter previous Time: ");
					String prev = input.nextLine();
					pa.setAttri(diag, inTime, prev);
					pa.getAttri();
				}else if(apt == 4){											//Lecturer
					Lecturer lr = new Lecturer();
					System.out.println("Enter the first name: ");
					String dname = input.nextLine();
					lr.setgivenName(dname);
					System.out.println("Enter the last name: ");
					String dlname = input.nextLine();
					lr.setlastName(dlname);
					System.out.println("Enter Salary: ");
					double salary = input.nextDouble();
					lr.setSalary(salary);
					input.nextLine();
					String dis[] = new String[3];
					System.out.println("Enter disciplines: ");
					for(int i=0;i<3;i++){
						dis[i] = input.nextLine();
					}
					System.out.println("Name: " + lr.getgivenName()+" " + lr.getlastName() + "\nSalary: " + lr.getSalary());
					lr.displayDisciplines(dis);
				}else if(apt == 5){												//Rectangle
					System.out.println("Enter the length: ");
					double length = input.nextDouble();
					System.out.println("Enter the width: ");
					double width = input.nextDouble();
					Rectangle rec = new Rectangle(length,width);
					System.out.println("Area is : " + rec.area());
				}else if (apt == 6){											//Circle
					System.out.println("Enter the radius: ");
					double radius = input.nextDouble();
					Circle cir = new Circle(radius);
					cir.setArea();
					System.out.println("Area is: " +  cir.getArea());
				}else if(apt == 7){												//Triangle
					System.out.println("Enter the base: ");
					double base = input.nextDouble();
					System.out.println("Enter the height: ");
					double height = input.nextDouble();
					Triangle tr = new Triangle(base,height);
					tr.setArea();
					System.out.println("Area is:  " + tr.getArea());
				}else if(apt == 8){												//Ebook
					System.out.println("Enter title of the book: ");
					String tt = input.nextLine();
					System.out.println("Enter year: ");
					int year = input.nextInt();
					input.nextLine();
					System.out.println("Enter publisher: ");
					String publish = input.nextLine();
					System.out.println("Enter number of pages: ");
					int pages = input.nextInt();
					input.nextLine();
					System.out.println("Enter the url: ");
					String url = input.nextLine();
					EBook ee = new EBook(tt,year,publish,pages,url);
					System.out.println("Title: "+ ee.getTitle() + "\nYear: " + ee.getYear() + "\nPublisher: " + ee.getPublish() + "\nPages: " + ee.getPages());
					System.out.println("Url is: " + ee.getUrl());
				}else if (apt == 9){											//Physical Book
					System.out.println("Enter title of the book: ");
					String tt = input.nextLine();
					System.out.println("Enter year: ");
					int year = input.nextInt();
					input.nextLine();
					System.out.println("Enter publisher: ");
					String publish = input.nextLine();
					System.out.println("Enter number of pages: ");
					int pages = input.nextInt();
					System.out.println("Enter the shelf number: ");
					int shelf = input.nextInt();
					System.out.println("Enter the aisle number: ");
					int aisle = input.nextInt();
					System.out.println("Enter the floor number: ");
					int floor = input.nextInt();
					PhysicalBook pb = new PhysicalBook(tt,year,publish,pages,shelf,aisle,floor);
					System.out.println("Title: "+ pb.getTitle() + "\nYear: " + pb.getYear() + "\nPublisher: " + pb.getPublish() + "\nPages: " + pb.getPages() + "\nShelf: " + pb.getShelf() + "\nAisle: " + pb.getAisle() + "\nFloor: " + pb.getFloor());
				}else if (apt == 10){											//Lion
					System.out.println("Enter name: ");		
					String an = input.nextLine();
					System.out.println("Enter Weight: ");
					int we = input.nextInt();
					input.nextLine();
					System.out.println("Enter favourite food: ");
					String foo = input.nextLine();
					System.out.println("Enter age: ");
					int ag = input.nextInt();
					input.nextLine();
					System.out.println("Enter sound: ");
					String sound = input.nextLine();
					Lion li = new Lion(an,we,foo,ag,sound);		//Parameterised Constructor

					//Mutator
					System.out.println("Name: " + li.getName() + "\nWeight: " +li.getWeight() +"\nFavourite Food: " +li.getFood() +"\nAge: " + li.getAge() + "\nSound: " + li.makeSound());
				}else if(apt == 11){										//Turtle
					System.out.println("Enter name: ");
					String an = input.nextLine();
					System.out.println("Enter Weight: ");
					int we = input.nextInt();
					input.nextLine();
					System.out.println("Enter favourite food: ");
					String foo = input.nextLine();
					System.out.println("Enter age: ");
					int ag = input.nextInt();
					input.nextLine();
					System.out.println("Enter sound: ");
					String sound = input.nextLine();
					Turtle tu = new Turtle(an,we,foo,ag,sound);		//Parameterised Constructor

					//Mutator
					System.out.println("Name: " + tu.getName() + "\nWeight: " +tu.getWeight() +"\nFavourite Food: " +tu.getFood() +"\nAge: " + tu.getAge() + "\nSound: " + tu.makeSound());
				}else if (apt == 12){									//Chameleon
					System.out.println("Enter name: ");
					String an = input.nextLine();
					System.out.println("Enter Weight: ");
					int we = input.nextInt();
					input.nextLine();
					System.out.println("Enter favourite food: ");
					String foo = input.nextLine();
					System.out.println("Enter age: ");
					int ag = input.nextInt();
					input.nextLine();
					System.out.println("Enter sound: ");
					String sound = input.nextLine();
					Chameleon ch = new Chameleon(an,we,foo,ag,sound);		//Parameterised Constructor

					//Mutator
					System.out.println("Name: " + ch.getName() + "\nWeight: " +ch.getWeight() +"\nFavourite Food: " + ch.getFood() +"\nAge: " + ch.getAge() + "\nSound: " + ch.makeSound());
				}
			}
		}catch(Exception e){
			System.out.println("Exception: " + e);
		}
	}
}