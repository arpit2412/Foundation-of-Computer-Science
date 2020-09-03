class Node{

	
			int n;
			Node next;
			Node(){
				int n =0;
				Node next = null;
			}

			Node(int n){
				this.n = n;
				this.next = null;
			}
			Node(int n , Node next){
				this.n = n;
				this.next = next;
			}

			public void setNext(Node next){
				this.next = next;
			}
			public void setN(int n){
				this.n = n;
			}

			public Node getNext(){
				return this.next;
			}
			public int getN(){
				return this.n;
			}
		
}