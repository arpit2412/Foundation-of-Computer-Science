import java.util.*;
class Stack{
	Node top;
	public static void main(String[] args) {
		Stack s = new Stack();
		int arr[] = {1,2,3,4,6,7,8};
		s.push(arr[0]);
		s.push(arr[1]);
		s.pop();
		s.push(arr[2]);
		s.push(arr[3]);
		s.push(arr[4]);
		s.push(arr[5]);
		s.pop();
		s.push(arr[6]);
		s.display();
	}
	public void push(int n){
		Node l = new Node(n);
		if(top==null){
			top = l;
		}else{
			l.setNext(top);
			top = l;
		}
		//display();
	}
	public void pop(){
		if(top==null){
			System.out.println("No element");
		}else{
			top = top.getNext();
		}
		//display();
	}

	public void display(){
		while(top!=null){
			System.out.println(top.getN());
			top = top.getNext();
		}
	}


}