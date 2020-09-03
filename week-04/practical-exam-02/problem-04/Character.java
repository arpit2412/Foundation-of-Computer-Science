//==================================
// Foundations of Computer Science
// Student: Arpit Garg
// id: A1784072
// Semester: 02
// Year: 2019
// Practical Exam Number: 02
//===================================

//Class Character
public class Character{
	//Variables
	private String name; //this attribute storage the character name;
	private int age; // this attribute storage the character age;String) 
	private String gender; // this attribute storage the character gender
	private String occupation; // this attribute storage the character occupation
	private String familyRole; // this attribute storage the family role
	private float rate;  // this attribute storage the character overall rate by fans;

	//Basic Constructor
	Character(){
		name = "Unknown";
		age = 0;
		gender = "Unknown";
		occupation = "Unkown";
		familyRole = "Unknown";
		rate = 0.0f;
	}
	//Parameterised Constructor
	Character(String name, int age, String gender,  String occupation, String familyRole, float rate){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.occupation = occupation;
		this.familyRole = familyRole;
		this.rate = rate;
	}

	//Mutators
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public void setOccupation(String occupation){
		this.occupation = occupation;
	}
	public void setfamilyRole(String familyRole){
		this.familyRole = familyRole;
	}
	public void setRate(float rate){
		this.rate = rate;
	}

	//Accessors
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public String getGender(){
		return this.gender;
	}
	public String getOccupation(){
		return this.occupation;
	}
	public String getfamilyRole(){
		return this.familyRole;
	}
	public float getRate(){
		return this.rate;
	}
}