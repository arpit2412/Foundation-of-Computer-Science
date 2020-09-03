class Bicycle extends VehicleAbstract implements Vehicle{
	boolean is_serviced;
	String inDate,outDate,serviceResponsible;
	int gearChange =0;

	public void setServiced(boolean is_serviced){
		this.is_serviced = is_serviced;
	}
	public boolean getServiced(){
		return this.is_serviced;
	}
	public void setinDate(String inDate){
		this.inDate= inDate;
	}
	public String getinDate(){
		return this.inDate;
	}

	public void setoutDate(String outDate){
		this.outDate= outDate;
	}
	public String getoutDate(){
		return this.outDate;
	}
	public int changeGear(){
		this.gearChange++;
		return this.gearChange;
	}
	public void checkBrakes(){
		System.out.println("Checked");
	}
	public void setserviceResonsible(String serviceResponsible){
		this.serviceResponsible = serviceResponsible;
	}
	public String getserviceResonsible(){
		return this.serviceResponsible;
	}
	Bicycle(String color, int year,int numberGears,boolean is_serviced, String inDate,String outDate,String serviceResponsible){
		super(color, year, numberGears);
		setServiced(is_serviced);
		setinDate(inDate);
		setoutDate(outDate);
		setserviceResonsible(serviceResponsible);
	}
	Bicycle(){
		super();
	}
	public void checkoutService(){
		System.out.println("Cleaning");
	}
}