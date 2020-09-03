/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
class MyStack{
	private Node top; 

	//basic constructor
	public MyStack(){
		this.top = null;
	}


	//push entering elements LIFO
	public void push(Node node){
		Node n = node;
		if(isEmpty()){
			top = n;
		}else{
			n.setNode(top);
			top = n; 			
		}
		print();
	}

	//pop removing elements LIFO
	public Node pop(){
		if(isEmpty()){
			System.out.println("No elements present!!");
			return null;
		}else{
			Node prevTop = top;
			top = top.getNode();
			// System.out.println("Pop");
			print();
			prevTop.printNode();
			return prevTop;
		}

	}

	//returning true if stack empty
	public boolean isEmpty(){
		return this.top == null;
	}

	//Printing 
	public void print(){
		Node t = top;
		while(t != null){
			t = t.getNode();			
		}
	}

	//returning top of the stack
	public Node peek(){
		    if (isEmpty() ){
		    	System.out.println("Error Empty!!");
		    }
        return top;
	}

	
}