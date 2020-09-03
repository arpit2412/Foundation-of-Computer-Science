/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
public class Animal{
	private String name;
	private double weight;
	private String favouriteFood;
	private int age;

	//Basic constructor
	Animal(){
		this.name = "Unknown";
		this.weight = 0.0;
		this.favouriteFood = "Unknown";
		this.age = 0; 
	}

	//Parameterized Constructor 
	Animal(String name, double weight, String favouriteFood, int age){
		setName(name);
		setWeight(weight);
		setFood(favouriteFood);
		setAge(age);

	}

	//Mutators
	public void setName(String name){
		this.name = name;
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}

	public void setFood(String favouriteFood){
		this.favouriteFood = favouriteFood;
	}

	public void setAge(int age){
		this.age = age;
	}

	//Accessors
	public String getName(){
		return this.name;
	}

	public double getWeight(){
		return this.weight;
	}

	public String getFood(){
		return this.favouriteFood;
	}

	public int getAge(){
		return this.age;
	}
}