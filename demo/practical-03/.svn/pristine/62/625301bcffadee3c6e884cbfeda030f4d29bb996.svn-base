class Lecturer extends Person{
	private double salary;
	private String disciplines[] = new String[3];

	//Basic Constructor
	Lecturer(){
		super();
	}

	Lecturer(String fname, String lname, double salary, String[] disciplines){
		super(fname, lname);
		setSalary(salary);
	}

	public void setSalary(double salary1){
		this.salary = salary1;
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

	public double getSalary(){
		return this.salary*12;
	}	
}