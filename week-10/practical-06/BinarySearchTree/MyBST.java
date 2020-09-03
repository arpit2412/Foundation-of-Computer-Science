/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
public class MyBST{

	private Node root;
	
	public MyBST(){
		this.root = null;
	} 

	public void insert(int value){
		insertRec(root,value);
	}

	private void insertRec(Node current, int value){
		if(current == null){
			current = new Node(value);
		}
		if(value < current.getData()){
			insertRec(current.getLeft(),value);
		}else if(value > current.getData()){
			insertRec(current.getRight(),value);
		}else if(value == current.getData()){
			System.out.println("Already present in node");
		}
	}

	public boolean search(int value){
		return searchRec(root,value);
	}

	private boolean searchRec(Node current, int value){
		boolean flag = false;
		if(current.getData() == value){
			flag = true;
		}
		if(value < current.getData()){
			return searchRec(current.getLeft(),value);
		}else if(value > current.getData()){
			return searchRec(current.getRight(),value);
		}
		return flag;
	}
}