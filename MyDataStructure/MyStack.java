class MyStack{
	private Node top; 

	public MyStack(){
		this.top = null;
	}

	public void push(Node node){
		Node n = node;
		if(isEmpty()){
			top = n;
			//System.out.println("top");
		}else{
			n.setNode(top);
			top = n; 			
		}
		// System.out.println("push");
		print();
	}

	public Node pop(){
		if(isEmpty()){
			System.out.println("No elements present!!");
			return null;
		}else{
			Node prevTop = top;
			top = top.getNode();
			// System.out.println("Pop");
			print();
			return prevTop;
		}

	}

	public boolean isEmpty(){
		return this.top == null;
	}

	public void print(){
		Node t = top;
		while(t != null){
			t = t.getNode();			
		}
	}

	public Node peek(){
		    if (isEmpty() ){
		    	System.out.println("Error Empty!!");
		    }
        return top;
	}

	
}