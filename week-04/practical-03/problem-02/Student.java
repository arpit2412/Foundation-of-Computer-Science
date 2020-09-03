/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
class Student extends Person{
	private double marks[] = new double[5];
	private String disciplines[] = new String[3];

	//Basic Constructor
	Student(){
		super();
	}

	//Parameterized Constructor
	Student(String fname, String lname, int age, double[] marks, String[] discilpines){
		super(fname,lname,age);
		setMarks(marks);
		setDisciplines(disciplines);
	}

	//Mutators
	public void setMarks(double marks[]){
		for(int i=0;i<5;i++){
			this.marks[i] = marks[i];
		}
	}

	//Set Disciplines
	public void setDisciplines(String dis[]){
		for(int i=0;i<3;i++){
			this.disciplines[i] = dis[i];
		}
		displayDisciplines(disciplines);
	}

	//Display function
	public void displayDisciplines(String disc[]){
		System.out.println("Disciplines: ");
		for(int i=0;i<3;i++){
			System.out.println(disc[i]);
		}
	}

	//Average Marks 
	public double averageMarks(double marks[]){
		double sum = 0;
		for(int i=0;i<5;i++){
			this.marks[i] = marks[i];
			sum += marks[i];
		}
		double avg = sum/5;
		return avg;
	}

	//Acessor
	public double[] getMarks(){
		return this.marks;
	}
}