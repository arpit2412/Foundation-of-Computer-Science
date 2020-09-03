/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//parent class bicycle with interface and abstract class
class Bicycle extends VehicleAbstract implements Vehicle{
	boolean is_serviced;
	String inDate;
	String outDate;
	String serviceResponsible;
	int gearChange;

	//Parameterised Constructor
	Bicycle(String color, int year, int numberGears, boolean is_serviced, String inDate, String outDate, String serviceResponsible){
		super(color,year,numberGears);
		setis_Serviced(is_serviced);
		setinDate(inDate);
		setoutDate(outDate);
		setserviceResonsible(serviceResponsible);
	}

	//Mutators
	public void setis_Serviced(boolean is_serviced){
		this.is_serviced = is_serviced;
	}
	public void setinDate(String inDate){
		this.inDate = inDate;
	}
	public void setoutDate(String outDate){
		this.outDate = outDate;
	}
	public void setserviceResonsible(String serviceResponsible){
		this.serviceResponsible = serviceResponsible;
	}

	//Accessors
	public boolean getis_Serviced(){
		return this.is_serviced;
	}
	public String getinDate(){
		return this.inDate;
	}
	public String getoutDate(){
		return this.outDate;
	}
	public String getserviceResonsible(){
		return this.serviceResponsible;
	}

	//Methods
	public void checkoutService(){
		System.out.println("\n----------------------------\n");
		System.out.println("Cleaning at checkout");
	}
	public void setgearChange(int gearChange){
		this.gearChange = gearChange;
	}
	public int changeGear(){
		return this.gearChange;
	}
	public void checkBrakes(){
		System.out.println("\n----------------------------\n");
		if(getserviceResonsible().equalsIgnoreCase("Brakes")){
			System.out.println("\nYes brakes checked");
		}else{
			System.out.println("\nNo brakes checked");
		}
	}
}
