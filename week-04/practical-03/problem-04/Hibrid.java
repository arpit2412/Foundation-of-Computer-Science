/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//Children class hibrid
class Hibrid extends Bicycle{

	//Creating variables
	String suspension;	
	
	//Parameterised Constructor
	Hibrid(String color, int year, int numberGears, boolean is_serviced, String inDate, String outDate, String serviceResponsible, String suspension){
		super(color,year,numberGears,is_serviced,inDate,outDate,serviceResponsible);
		setSuspension(suspension);
	}

	//Mutators
	public void setSuspension(String suspension){
		this.suspension = suspension;
	}

	//Accessors
	public String getSuspension(){
		return this.suspension;
	}

}