/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
class Patient extends Person{
	private String diagnostic ,inTime , prevTime;

	//Basic Constructor
	Patient(){
		super();
	}

	//Parameterised Constructor
	Patient(String fname, String lname, String diag, String inTime, String prevTime){
		super(fname,lname);
		setAttri(diag,inTime,prevTime);
	}

	void setAttri(String diagnostic, String inTime, String prevTime){
		this.diagnostic = diagnostic;
		this.inTime = inTime;
		this.prevTime = prevTime;
	}

	void getAttri(){
		System.out.println("Diagnostics: " + diagnostic + "\ninTime: " + inTime + "\n Prev Time: " + prevTime);
	}
}