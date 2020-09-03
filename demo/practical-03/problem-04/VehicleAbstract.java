/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//abstract class
abstract class VehicleAbstract{
	String color;
	int year;
	int numberGears;
	//Constructor
	VehicleAbstract(String color, int year, int numberGears){
		this.color = color;
		this.year = year;
		this.numberGears = numberGears;
	}
	//Method
	public void get(){
		System.out.println("\n----------------------------\n");
		System.out.println("Color: " + this.color + "\nYear: " + this.year + "\nnumberGears: " + this.numberGears);
	}
}