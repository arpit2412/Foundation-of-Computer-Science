// creates a parking place of type, vehicle type, 



class ParkingPlace{
	private String owner, address;
	private int price;
	private String type, vehicle;
	int counter =0;

	public void setOwner(String tmpOwner){
		this.owner = tmpOwner;
	}
	public String getOwner(){
		return this.owner;
	}
	public void setAddress(String tmpAddress){
		this.address = tmpAddress;
	}
	public String getAddress(){
		return this.address;
	}
	public void setPrice(int tmpPrice){
		if(type == "off-street"){
			this.price = 15;
		}else{
			if(vehicle == "bike"){
				this.price =  0;
			}else{
				if(counter%2==0){
					this.price =  0;
				}else{
					this.price = 10;
				}
				counter++;
			}
		}
	}
	public int getPrice(){
		
		return this.price;
	}
	public String getType(){
		return this.type;
	}
	public String getVehicleType(){
		return this.vehicle;
	}
	ParkingPlace(String owner, String address, String type, String vehicle){
		this.owner = owner;
		this.address = address;
		this.type = type;
		this.vehicle = vehicle;
	}
}