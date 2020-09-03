//https://version-control.adelaide.edu.au/svn/a1784072/2019/s2/fcs/week-07/practical-05/MySortAlg/?p=334
class Student{

	private String name;
	private int physic, chemistry, math;
	private float average;

	
	
	public Student(String name, int physic, int chemistry, int math){
		this.setName(name);
		this.setPhysic(physic);
		this.setChemistry(chemistry);
		this.setMath(math);
		this.average = (this.getPhysic() + this.getChemistry() + this.getMath())/3;
	}

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public int getPhysic(){
		return this.physic;
	}
	public void setPhysic(int physic){
		this.physic = physic;
	}

	public int getChemistry(){
		return this.chemistry;
	}
	public void setChemistry(int chemistry){
		this.chemistry = chemistry;
	}

	public int getMath(){
		return this.math;
	}
	public void setMath(int math){
		this.math = math;
	}

	public float getAverage(){
		return this.average;
	}
}