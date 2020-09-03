public class Person{
	private String name;
	private int age;
	
	
	
	//set value 
	public void setName(String newname){
		name = newname;
	}

	public void setAge(int newage){
		age = newage;
	}

	//get value
	public void getName(){
		System.out.println("Name: "+ name);

	}

	public void getAge(){
		System.out.println("Age: "+ age);
	}
}