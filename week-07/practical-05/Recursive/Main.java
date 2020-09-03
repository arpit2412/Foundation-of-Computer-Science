/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//import libraries to accept input from the user.
import java.util.*;
class Main{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		//Handling exceptions
		try{
			int num = input.nextInt();
			num++;
			int result = nextHappyNum(num);
			System.out.println("Output: " + result);	
			System.out.println("Do you want to decode string:(Y/N)");
			char ch = input.next().charAt(0);
			input.nextLine();
			if(ch=='y'||ch=='Y'){
				System.out.println("Enter the encoded string: ");
				String s = input.nextLine();
				System.out.println(decodeString(s));
			}else{
				System.out.println("Have a nice day!!");
			}
		}catch(Exception e){
			System.out.println("Exception: " + e);
		}
	}

	//finding next happy num
	public static int nextHappyNum(int num){
		int slow, fast; 
   		
	    //  initialize slow and fast by num 
	    slow = fast = num; 
	    do{ 
	        //  move slow number 
	        // by one iteration 
	        slow = numSquareSum(slow); 
	        //  move fast number 
	        // by two iteration 
	        fast = numSquareSum(numSquareSum(fast));    
	    } while (slow != fast);

	    if(slow==1){
	    	return num;
	    }else{
	    	num++;
	    	return(nextHappyNum(num));
	    }
	}

	//calculating square of the number 
	public static int numSquareSum(int n){ 
	    int squareSum = 0; 
	    while (n!= 0) 
	    { 
	        squareSum += (n % 10) * (n % 10); 
	        n /= 10; 
	    } 
	    return squareSum; 
	}


	//decode string function 
	public static String decodeString(String s){
		Stack<Integer> in = new Stack<>();			//Integer type array Generic type
		Stack<Character> ch = new Stack<>();		//Character type array Generic Type
		int a=0,count=0;					
		String temp = "", result = "";
		char[] cha = s.toCharArray(); 
		for(int i=0;i<cha.length;i++){
			if(Character.isDigit(cha[i])){
				a = Character.getNumericValue(cha[i]);
				in.push(a);
			}else if (cha[i] == '['){ 
                if (Character.isDigit(cha[i-1])) 
                    ch.push(cha[i]); 
                else{ 
                    ch.push(cha[i]); 
                    in.push(1); 
                } 
            }else if (cha[i] == ']'){ 
                temp = ""; 
                count = 0; 
       
                if (!in.isEmpty()){ 
                    count = in.peek(); 
                    in.pop(); 
                } 
       
                while (!ch.isEmpty() && ch.peek()!='[' ){ 
                    temp = ch.peek() + temp; 
                    ch.pop(); 
                } 
       
                if (!ch.empty() && ch.peek() == '[') 
                    ch.pop(); 
       
                // Repeating the popped string 'temp' count 
                // number of times. 
                for (int j = 0; j < count; j++) 
                    result = result + temp; 
       
                // Push it in the character stack. 
                for (int j = 0; j < result.length(); j++) 
                    ch.push(result.charAt(j)); 
     
                result = ""; 
            }else{
                ch.push(cha[i]); 
            }
		}

		 // Pop all the elmenet, make a string and return. 
        while (!ch.isEmpty()){ 
            result = ch.peek() + result; 
            ch.pop(); 
        }  
		return result;
	}
}