/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//Children class ElectricBike
class ElectricBike extends Bicycle{
	
	//Creating variables
	float battery;

	//Parameterised Constructor
	ElectricBike(String color, int year, int numberGears, boolean is_serviced, String inDate, String outDate, String serviceResponsible,float battery){
		super(color,year,numberGears,is_serviced,inDate,outDate,serviceResponsible);
		setBattery(battery);
	}

	//Mutators
	public void setBattery(float battery){
		this.battery = battery;
	}

	//Accessors
	public float getBattery(){
		return this.battery;
	}

	//methods
	public void chargeBike(){
			System.out.println("\n----------------------------\n");
			if (this.battery >= 25.0f ){
				System.out.println("No need to charge");
			}else{
				System.out.println("Charge the bike");
			}
	}
}