/*==================================
Foundations of Computer Science
Student: Arpit Garg
id: A1784072
Semester: 2
Year: 2019    
Practical Exam Number: 5
===================================*/
class Node{

	private Student info;
	private Node next;
	
	//Constructor
	Node(){
		this.info = null;
		this.next = null;
	}

	//Parameterised Constructor
	Node(Student tmpStudent){
		this.info = tmpStudent;
		this.next = null;
	}

	//Accessors and Mutators
	public void setInfo(Student info){
		this.info = info;
	}

	public Student getInfo(){
		return this.info;
	}

	public void setNext(Node next){
		this.next = next;
	}

	public Node getNext(){
		return this.next;
	}
	
}