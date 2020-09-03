class Lecturer extends Person{
	double salary;
	String disciplines[] = new String[3];

	public void annualSalary(){
		System.out.println("Annual Salary: " + salary*12);
	}

	public void displayDisciplines(){
		for(int i=0;i<disciplines.length;i++){
			System.out.println(disciplines[i]);
		}
	}

	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return this.salary;
	}
	public void setDisciplines(String[] disciplines){
		this.disciplines = disciplines;
	}
	public String[] getDisciplines(){
		return this.disciplines;
	}	
}