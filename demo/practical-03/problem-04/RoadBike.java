/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//Children class RoadBike
class RoadBike extends Bicycle{
	
	//Creating Variables	
	String tyres;	

	//Parameterised Constructor
	RoadBike(String color, int year, int numberGears, boolean is_serviced, String inDate, String outDate, String serviceResponsible, String tyres){
		super(color,year,numberGears,is_serviced,inDate,outDate,serviceResponsible);
		setTyres(tyres);
	}

	//Mutators
	public void setTyres(String tyres){
		this.tyres = tyres;
	}

	//Accessors
	public String getTyres(){
		return this.tyres;
	}
}