class Queue{
	Node front, rear;
	public static void main(String[] args) {
		Queue q = new Queue();
		int arr[] = {1,2,3,4,6,7,8};
		q.enqueue(arr[0]);
		q.enqueue(arr[1]);
		q.dequeue();
		q.display();
		q.enqueue(arr[2]);
		q.enqueue(arr[3]);
		q.enqueue(arr[4]);
		q.enqueue(arr[5]);
		q.dequeue();
		q.enqueue(arr[6]);
		q.display();
	}

	public void enqueue(int n){
		Node l = new Node(n);
		if(front == null){
			front = rear = l;
			return;
		}else{
			rear.setNext(l);
			rear = l;
		}
	}

	public void dequeue(){
		if(front == null){
			System.out.println("No elements");
		}else{
			front = front.getNext();
		}
	}

	public void display(){

		if(front == rear){
			System.out.println(front.getN());
		}else{
			while(front!=rear){
				System.out.println(front.getN());
				front = front.getNext();
			}
		}
	}
	
}