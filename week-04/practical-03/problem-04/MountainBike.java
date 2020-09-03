/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//Childern class MountainBike
class MountainBike extends Bicycle{
	
	//Creating variables
	String suspension; 
	String forks; 

	//Parameterised Constructor
	MountainBike(String color, int year, int numberGears, boolean is_serviced, String inDate, String outDate, String serviceResponsible, String suspension, String forks){
		super(color,year,numberGears,is_serviced,inDate,outDate,serviceResponsible);
		setSuspension(suspension);
		setForks(forks);
	}

	//Mutators
	public void setSuspension(String suspension){
		this.suspension = suspension;
	}
	public void setForks(String forks){
		this.forks = forks;
	}

	//Accessors
	public String getSuspension(){
		return this.suspension;
	} 
	public String getForks(){
		return this.forks;
	}
}