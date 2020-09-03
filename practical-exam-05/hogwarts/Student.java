/*==================================
Foundations of Computer Science
Student: Arpit Garg
id: A1784072
Semester: 2
Year: 2019    
Practical Exam Number: 5
===================================*/

class Student{

	private String name;
	private int age;
	private int period;

	//Constructor
	Student(){
		this.name = "unknown";
		this.age = 0;
		this.period = 0;
	}

	//Parameterised Constructor
	Student(String tmpName, int tmpAge, int tmpPeriod){
		this.name = tmpName;
		this.age = tmpAge;
		this.period = tmpPeriod;
	}

	//Accessors and Mutators
	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}


	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return this.age;
	}

	public void setPeriod(int period){
		this.period = period;
	}

	public int getPeriod(){
		return this.period;
	}
}