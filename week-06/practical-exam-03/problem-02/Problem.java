//==================================
// Foundations of Computer Science
// Student: Arpit Garg
// id: A1784072
// Semester: 2
// Year: 2019
// Practical Exam Number: 3
//===================================
import java.util.*;
class Problem extends ProblemAbstract{
	public static void main(String[] args) {
		//exception handling
		try{
			//for input
			Scanner input = new Scanner(System.in);
			
			//string to check pallindrome
			System.out.println("Enter a String: ");
			String palCheck = input.nextLine();
			
			//finding length
			int n = palCheck.length();

			//converting to character array
			char [] pal = palCheck.toCharArray();
			
			// //checking pallindrome
			// ProblemAbstract p = new ProblemAbstract();
			
			//return boolean value
			boolean ans = solve(pal,0,n-1);

			//printing results
			if(ans == true){
				System.out.println("palindrome");
			}else{
				System.out.println("non-palindrome");
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}

}