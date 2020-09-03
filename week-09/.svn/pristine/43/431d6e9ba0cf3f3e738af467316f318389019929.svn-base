/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
public class MyQueue{
	private Node front, rear;

	//basic  contsructor 
	MyQueue(){
		this.front = this.rear = null;
	}

	//enqueue entering elements FIFO
	public void enqueue(Node node){
		Node n = node;
		if(this.rear==null){
			this.front = this.rear = n;
			return;
		}
		this.rear.setNode(n);
		this.rear = n;
	}

	//dequeue removing elements  FIFO
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


	//if queue is empty return true
	public boolean isEmpty(){
		return (this.front == null);
	}


	//display the queue
	public void displayQueue(){
		while(this.front != null){
			System.out.println("Queue:");
			System.out.println(front.getData());
			this.front = this.front.getNode();
		}
	}
}