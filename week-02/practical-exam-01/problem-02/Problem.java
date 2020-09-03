//==================================
// Foundations of Computer Science
// Student: Arpit Garg	
// id: A1784072		
// Semester: Semester 2
// Year: 2019
// Practical Exam Number: 01
//==================================


//class name Problem
class Problem{
	//Main Function execution starts here
	public static void main(String[] args) {
		//Exception Handling
		try{
			//Printing starting square brackets
			System.out.print("[");
			//for loop to print numbers in reverse order from 101 to 89
			for(int i=101;i>88;i--){
				System.out.print(i);
				//At last position comma should not be present so adding a if condition
				if(i!=89){
					System.out.print(", ");
				}
			}
			//Printing ending square brackets
			System.out.println("]");
		}catch(Exception e){
			System.out.println(e);		//Printing exception if occurs
		}
	}	
}