class Queue{

	Node front;
	Node back;

	public void enqueue(Student tmpStudent){
		Node n = new Node(tmpStudent);
		if(front == null){
			front = back = n;
		}else{
			back.setNext(n);
			back = n;
		}
	}

	public void dequeue(){
		if(front == null){
			System.out.println("No element present!!");
		}else{
			front = front.getNext();
		}
	}

	public void displayQueue(){
		Student n;
		if(front == null){
			System.out.println("No element present in queue!!");
		}else{
			while(front!=back){
				n = front.getInfo();
				System.out.println(n.getName());
				front=front.getNext();
			}
			Student n2 = back.getInfo();
			System.out.println(n2.getName());
		}
	}
	
}