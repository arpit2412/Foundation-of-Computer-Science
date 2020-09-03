public class MyQueue{
	private Node front, rear;

	
	MyQueue(){
		this.front = this.rear = null;
	}


	public void enqueue(Node node){
		Node n = node;
		if(this.rear==null){
			this.front = this.rear = n;
			return;
		}
		this.rear.setNode(n);
		this.rear = n;
	}


	public Node dequeue(){
		if (this.front == null){
            return null; 
		} 
		Node temp = this.front;
		this.front = this.front.getNode();
		if (this.front == null){
            this.rear = null; 
		} 
        return temp; 
	}


	public boolean isEmpty(){
		return (this.front == null);
	}

	public void displayQueue(){
		while(this.front != null){
			System.out.println("Queue:");
			System.out.println(front.getData());
			this.front = this.front.getNode();
		}
	}


	public Node peek(){
		    if (isEmpty() ){
		    	System.out.println("Error Empty!!");
		    }
        return front;
	}
}