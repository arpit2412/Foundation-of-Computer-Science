/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
class primeCheck{
	void primeCheck(int n){
		
		boolean flag = true;
		for(int i=2;i<n/2;i++){							//Checking for prime
			if(n%i==0){
				flag = false;
			}
		}
		if(flag == true){								//Printing if Prime or not using flag
		System.out.println("\nIt is a Prime Number\n");
		}else{
		System.out.println("\nIt is not a Prime Number (Composite Number)\n");
		}
	}
}