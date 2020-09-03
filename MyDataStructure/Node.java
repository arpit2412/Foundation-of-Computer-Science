public class Node{
	private String  data;
	private Node next;

	Node(){
		this.setData(null);
		this.setNode(null);
	}

	Node(String data){
		this.setData(data);
		this.setNode(null);
	}

	Node(String data , Node next){
		this.setData(data);
		this.setNode(next);
	}

	public void setData(String data){
		this.data = data;
	}

	public void setNode(Node next){
		this.next = next;
	}

	public String getData(){
		return this.data;
	}

	public Node getNode(){
		return this.next;
	}

	public void printNode(){
		System.out.println("Node data: " + this.data );
	}
}