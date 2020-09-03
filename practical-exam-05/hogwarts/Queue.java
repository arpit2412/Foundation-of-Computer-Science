/*==================================
Foundations of Computer Science
Student: Arpit Garg
id: A1784072
Semester: 2
Year: 2019    
Practical Exam Number: 5
===================================*/

class Queue{
	private Node back;

	//Entering
	public void enqueue(Student tmpStudent){
		Node st = new Node(tmpStudent);
		try{
			if(this.back==null){
				this.back = new Node(st.getInfo());
				return;
			}
			this.back.setNext(st);
			this.back = st;			
		}catch(Exception e){
			System.out.println(e);
		}
	} 
	//Removing 
	public void dequeue(){
		if(this.back == null){
			System.out.println("Sorry! No element present");
		}else{
			this.back.getNext();
			return;
		}

	}
	//Displaying
	public void displayQueue(){
		int counter = 1;
		Student s = back.getInfo();
		while(back.getNext() != null){
			if(s.getPeriod() == 1){
				System.out.println("#" + counter + " " + s.getName() + "," + s.getAge() +" years old, " +s.getPeriod() + "st year in Hogwarts" );				
			}else if(s.getPeriod() == 2){
				System.out.println("#" + counter + " " + s.getName() + "," + s.getAge() +" years old, " +s.getPeriod() + "nd year in Hogwarts" );				
			}else{
				System.out.println("#" + counter + " " + s.getName() + "," + s.getAge() +" years old, " +s.getPeriod() + "rd year in Hogwarts" );				
			}
			counter++;
		}
	}
}
