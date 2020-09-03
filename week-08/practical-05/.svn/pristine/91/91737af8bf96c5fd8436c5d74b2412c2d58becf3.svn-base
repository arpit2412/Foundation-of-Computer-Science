/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 
* name: Arpit Garg
*
*/
import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		BinarySearch b = new BinarySearch();	//for binary search
		LinearSearch l = new LinearSearch();	//for linear search
		Random ran = new Random(); // creating Random object
		int result=0,ans=0,result1=0;
		char count='y';
		int count1=3;
		try{
			do{
				while(count1!=0){					//running atleast 3 times 
					System.out.println("How many numbers should be there?");
					int n = input.nextInt();				//enter number of elements
					int[] arr = new int[n];
					int[] tmp = new int[n];
					int[] index = new int[n];
					System.out.println("1.Enter elements \n2.Generate random");	//enter elemts or generate random elemnts 
					int ch = input.nextInt();	
					if(ch==1){											//if user wants to enter elemnts in array
						System.out.println("Enter elements in array: ");
						for (int i = 0; i < arr.length; i++){
				        arr[i] = input.nextInt(); 
				        
			     		}
					}else if(ch == 2){									//if user wants to generate random elements
						for (int i = 0; i < arr.length; i++){
					        arr[i] = ran.nextInt(20); 
					        index[i] = i;
				     	}
				    }else{
				    	System.out.println("Wrong choice!!");
				    }
			     	System.out.println("Entered elements are: ");				//printing the elements
			     	for (int i = 0; i < arr.length; i++){
				       System.out.println(arr[i]);   
			     	}
			     	System.out.println("Enter the number you want to search for?");				//enter the choice user want to search in array
			     	int num = input.nextInt();
			     	
			     	System.out.println("Enter your choice: \n1.Linear Search \n2.Binary Search");		//select the searching algorithm 
			     	int choice = input.nextInt();
			     	if(choice == 1){
			     		result = l.search(arr,num);
			     		count1--;
			     	}else if(choice == 2){
			     		tmp = arr;								//for binary search elements must be in sorted order 
			     		int nn = tmp.length;					//tmp array created for sorted array
        				for (int i = 0; i < nn-1; i++){ 
				            for (int j = 0; j < nn-i-1; j++){ 
				                if (arr[j] > arr[j+1]){ 
				                     // swap arr[j+1] and arr[i] and index also
				                    int temp = arr[j]; 
				                    int temp1 = index[j];
				                    arr[j] = arr[j+1];
				                    index[j] = index[j+1]; 
				                    arr[j+1] = temp;
				                    index[j+1] = temp1; 
				                }
				            } 
				        }
			     		result1 = b.search(arr,num);
			     		if(result1==-1){
			     			System.out.println("Element not found");
			     			break;
			     		}else{
			     	 		result = index[result1];
			     		}
			     		count1--;
			     		
			     	}else{
			     		System.out.println("Wrong choice!!");
			     	}
			     	System.out.println("Enter your answer:");					// enter trhe users choice
			     	ans = input.nextInt();
			     	if(result!=-1){
			     		System.out.println("Element found at index: " + result);
			     	}else{
			     		System.out.println("Element not found!!");
			     	}
		     	
			     	boolean res = test(result,ans);							// if the users choice and computer choice is same or not 
			     	if(res == true){
			     		System.out.println("True");
			     	}else{
			     		System.out.println("False");
			     	}
		     	}
		     	System.out.println("Do you want to calculate the maximum?(Y/N)");		//want to calculate the maximum
		     	char in = input.next().charAt(0);
		     	if(in=='y'||in=='Y'){
		     		System.out.println("How many numbers should be there?");
					int no = input.nextInt();
					int[] arro = new int[no];
					System.out.println("Enter the elements in array: ");				//first increasing then decreasing order
					for (int i = 0; i < arro.length; i++){
				        arro[i] = input.nextInt(); 
			     	}
			     	System.out.println("Entered elements are: ");
			     	for (int i = 0; i < arro.length; i++){
				       System.out.println(arro[i]);   
			     	}
			     	int max = findMaxVal(arro);
			     	if(max!=-1){
			     		System.out.println("The maximum element is:" + max);			//finding maximum
			     	}
		     	}else if (in=='n'||in=='N'){
		     		System.out.println("Have a nice day!!");
		     	}else{
		     		System.out.println("Wrong choice!!");
		     	}
		     	System.out.println("Do you want to continue:(Y/N):");			// if users wich to continue after 3 times
		     	count = input.next().charAt(0);
	     	}while(count=='y'|| count=='Y');
	     	System.out.println("Have a nice Day!!");
     	}catch(Exception e){
     		System.out.println("Exception: "+e);
     	}	 	
    }
    
    //test
    private static boolean test(int result, int ans){						//test if user ans and result is same or not and return boolean
    	if(result == ans){
    		return true;
    	}else{
    		return false;
    	}
    }

    //maximum
    private static int findMaxVal(int array[]){							//finding maximum value
    	int accept=1;
    	int size = array.length;
    	for (int i = 0; i < size; i++)  								//if two same elemnts in array cannot continue
        { 
            for (int j = i + 1; j < size; j++)  
            { 
                if (array[i] == array[j])  
                accept =0;
            } 
        }
        if(accept == 1){
        	if ( array == null || array.length == 0 ) return -1; 			// null or empty

  			int max = 0;
			for ( int i = 1; i < array.length; i++ )
			{
			  if ( array[i] > array[max] ) 
			  	max = i;
			}
			return max;
        }else{
        	System.out.println("Same elements present cannot continue SORRY!!");
        	return -1;
        } 
    }
}