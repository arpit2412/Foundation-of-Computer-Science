//==================================
// Foundations of Computer Science
// Student: Arpit Garg
// id: A1784072
// Semester: 02
// Year: 2019
// Practical Exam Number: 02
//===================================

//Class ParkingPlace
public class ParkingPlace{
	String owner;
	String address;
	String type;
	String vehicle;
	int price;
	//Parameterised constructor
	ParkingPlace(String owner, String address, String type, String vehicle){
		this.owner = owner;
		this.address = address;
		this.type = type;
		this.vehicle = vehicle;
	}  //constructor
	//Mutators and accessors
	void setOwner(String tmpOwner) {
		this.owner = tmpOwner;
	}                        // sets the owner's name of a parking place
	String getOwner(){
		return this.owner;
	}                                      // returns the owner's name of a parking place         
	void setAddress(String tmpAddress){
		this.address = tmpAddress;
	}                     // set the address
	String getAddress(){
		return this.address;
	}                                    // returns the address of a parking place
	String getType(){
		return this.type;
	}                                       // returns the type of a parking place
	String getVehicleType(){
		return this.vehicle;
	}                                // returns the vehicle's type that a parking place may accommodate 
	void setPrice(int tmpPrice){
		this.price = tmpPrice;
	}                             // sets the price of a packing place;
	                                                       // price is to be non-negative integer value
	int getPrice(){  
	return this.price;                                       // returns the price of a packing place
	}
}