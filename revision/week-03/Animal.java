class Animal{
	private String name, favouriteFood;
	private int age;
	private double weight;

	public Animal(){
		name = null;
		weight = 0.0;
		favouriteFood = null;
		age =0;
	}
	public Animal(String name, double weight, String favouriteFood, int age){
		this.name = name;
		this.weight = weight;
		this.favouriteFood = favouriteFood;
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	public double getWeight(){
		return this.weight;
	}
	public void setfavouriteFood(String favouriteFood){
		this.favouriteFood = favouriteFood;
	}
	public String getfavouriteFood(){
		return this.favouriteFood;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	
}