class Student extends Person{
	double marks[] = new double[3];
	String disciplines[] = new String[3];
	int sum = 0;
	public void averageMarks(){
		for(int i=0;i<marks.length;i++){
			sum += marks[i];
		}
		System.out.println("Average: " + (float)sum/3);
	}

	public void displayDisciplines(){
		for(int i=0;i<disciplines.length;i++){
			System.out.println(disciplines[i]);
		}
	}

	public void setMarks(double[] marks){
		this.marks = marks;
	}

	public double[] getMarks(){
		return this.marks;
	}
	public void setDisciplines(String[] disciplines){
		this.disciplines = disciplines;
	}
	public String[] getDisciplines(){
		return this.disciplines;
	}
}