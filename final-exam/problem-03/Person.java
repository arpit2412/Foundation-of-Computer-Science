//problem-03/Personjava
/*Name: Arpit Garg
Semester : 2
Year: 2019
Id: A1784072 
FCS Final Practical*/
//class person with parent class as PersonAbstract
class Person extends PersonAbstract{

	//Basic constructor
	Person(){
    	setAge(-99);
    	setName("unknown");
    	setAddress("None");
    }

    //Parameterized constructor
    Person(int age, String name, String address){
    	setAge(age);
    	setName(name);
    	setAddress(address);
    }

    //Mutators
	public void setAge(int _age){
		super.age = _age;					//setting age
	}
    public void setName(String _name){
    	super.name = _name;					//setting name
    }
    public void setAddress(String _address){
    	super.address = _address;			//setting address
    }

    //Accessors
    public int getAge(){
    	return super.age;					//returning age
    }
    public String getName(){
    	return super.name;					//returning name
    }
    public String getAddress(){	
    	return super.address;				//returning address
    }

    //Display funcstion
    public void display(){
    	System.out.println("name: "+ getName() + ", age: "+ getAge() + ", address: "+getAddress() +";");				//Displaying using super for accessing parent
    }
}