/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
class Chameleon extends Animal {

	//Variables
	private String sound;
	
	//Basic Constructor
	Chameleon(){
		super();
	}

	//Parameterised Constructors
	Chameleon(String name, double weight, String favouriteFood, int age,String sound){
		super(name,weight,favouriteFood,age);
		setSound(sound);
	}

	//Methods
	public void setSound(String sound){
		this.sound = sound;
	}

	public String makeSound(){
		return this.sound;
	}	
}