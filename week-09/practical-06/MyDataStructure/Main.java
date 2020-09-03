/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
import java.util.*;
class Main{
	public static void main(String[] args) {
		MyStack m = new MyStack();
		Scanner input = new Scanner(System.in);
		System.out.println("\n\nWELCOME TO STACK QUEUE GAME\n\n");
		System.out.println("Enter the string for stack:");
		String str = input.nextLine();
		boolean result = bracketsMatching(str);
		System.out.println("\n\n"+result);
		System.out.println("\n\n------------------------\n\n");
		System.out.println("Enter the string for queue:");
		String strr = input.nextLine();
		enterQueue(strr);
		
	}

	//Matching the brackets
	public static boolean isMatchingPair(String str1, String str2) 
    { 
       if (str1.equals("(") && str2.equals(")")) 								//calculating the brackets 
         return true; 
       else if (str1.equals("{") && str2.equals("}")) 
         return true; 
       else if (str1.equals("[") && str2.equals("]")) 
         return true; 
       else
         return false; 
    } 

    //matching brackets function
	public static boolean bracketsMatching(String input){
		
		boolean result = true;	
		String str[] =input.split("") ;
		MyStack m = new MyStack();
		for(int i=0;i<str.length;i++){
			if(str[i].equals("{") || str[i].equals("[") || str[i].equals("(")){
				Node n = new Node();
				n.setData(str[i]);
				m.push(n);								//push to stack
			}else if(str[i].equals("}") || str[i].equals("]") || str[i].equals(")")){
				if(m.isEmpty()){
					return false;
				}else{
					Node prev = m.peek();
					String pre = prev.getData();
					Node del = m.pop();							//poping the elements 
					result = isMatchingPair(pre, str[i]);
					if(result == false){
						return false;
					}
				}
			}
		}
		return result;
	}

	//queue
	public static void enterQueue(String strr){
		String str[] =strr.split("") ;
		MyQueue q = new MyQueue();										//making queue
		MyQueue t = new MyQueue();
		
		for(int i=0;i<str.length;i++){
			Node n = new Node();
			n.setData(str[i]);
			q.enqueue(n);
			
		}
		
		t.displayQueue();
		Main.reverseQueue(q);
	}	

	//reverse queue
	public static MyQueue reverseQueue(MyQueue queue){
      MyQueue queue2 = new MyQueue();
      MyStack st = new MyStack();
      
      while(queue.isEmpty() == false) {						
        System.out.print("Elements in queue: ");
        Node tmpo = queue.dequeue();
        String tmp = tmpo.getData();
        Node ntmp = new Node(tmp);
        System.out.println(tmp);
        st.push(ntmp);
      }

           
        while(st.isEmpty() == false){
      
        Node tmp1 = st.pop();
        tmp1.setNode(null);
        
        queue2.enqueue(tmp1);
      }
      
      System.out.println("Reversing the Queue: ");
      queue2.displayQueue();
      return queue2;
      
  } 	
}