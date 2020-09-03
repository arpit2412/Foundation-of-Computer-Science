import java.util.*;
class Main{
	public static void main(String[] args) {
		MyStack m = new MyStack();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string for stack:");
		String str = input.nextLine();
		boolean result = bracketsMatching(str);
		System.out.println(result);
		System.out.println("Enter the string for queue:");
		String strr = input.nextLine();
		enterQueue(strr);
		
	}

	public static boolean isMatchingPair(String str1, String str2) 
    { 
       if (str1.equals("(") && str2.equals(")")) 
         return true; 
       else if (str1.equals("{") && str2.equals("}")) 
         return true; 
       else if (str1.equals("[") && str2.equals("]")) 
         return true; 
       else
         return false; 
    } 


	public static boolean bracketsMatching(String input){
		
		boolean result = true;
		String str[] =input.split("") ;
		MyStack m = new MyStack();
		for(int i=0;i<str.length;i++){
			if(str[i].equals("{") || str[i].equals("[") || str[i].equals("(")){
				Node n = new Node();
				n.setData(str[i]);
				m.push(n);
			}else if(str[i].equals("}") || str[i].equals("]") || str[i].equals(")")){
				if(m.isEmpty()){
					return false;
				}else{
					Node prev = m.peek();
					String pre = prev.getData();
					Node del = m.pop();
					result = isMatchingPair(pre, str[i]);
					if(result == false){
						return false;
					}
				}
			}
		}
		return result;
	}

	public static void enterQueue(String strr){
		String str[] =strr.split("") ;
		MyQueue q = new MyQueue();
		MyQueue t = new MyQueue();
		//MyQueue r = reverseQueue(q);
		for(int i=0;i<str.length;i++){
			Node n = new Node();
			n.setData(str[i]);
			q.enqueue(n);
			// t = reverseQueue(q);
		}
		//q.displayQueue();
		//MyQueue t = reverseQueue(q);
		t.displayQueue();
	}	


	public static MyQueue reverseQueue(MyQueue queue){
		
	}
}