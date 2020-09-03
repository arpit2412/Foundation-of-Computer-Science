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
		Random ran = new Random();
		InsertionSort in = new InsertionSort();
		MergeSort m = new MergeSort();
		QuickSort q = new QuickSort();
		int count =3;
		boolean check,com;
		char choices='Y';
		//Exception Handling
		try{
			do{
				while(count!=0){
					System.out.println("\n\nChances Left:" + count +"\n\n");
					System.out.println("Enter the numbers of elements: ");
					int n = input.nextInt();
					int[] arr = new int[n];
					int[] result = new int[n];
					int[] ans = new int[n];

					//Generate Random or enter elements
					System.out.println("1.Enter Elements \n2.Generate Random");
					int ch = input.nextInt();
					if(ch==1){
						System.out.println("Enter elements in array: ");
						for(int i=0;i<arr.length;i++) {
							arr[i] = input.nextInt();						
						}
					}else if(ch == 2){
						for(int i=0;i<arr.length;i++){
							arr[i] = ran.nextInt(20);
						}
					}else{
						System.out.println("Wrong choice!!");
					}
					System.out.println("Elements are: ");
					for(int i=0;i<arr.length;i++){
						System.out.println(arr[i]);
					}
					

					//Selection for sorting
					System.out.println("Enter your choice \n1.Insertion \n2.Merge \n3.Quick");
					int choice = input.nextInt();
					if(choice == 1){
						result = in.sort(arr);
						count--;
					}else if(choice == 2){
						result = m.sort(arr);
						count--;
					}else if(choice == 3){
						result = q.sort(arr);
						count--;
					}else{
						System.out.println("Wrong Choice!!");
						break;
					}
					System.out.println("Enter your sorted array: ");
					for(int i=0;i<arr.length;i++){
						ans[i] = input.nextInt();
					}
					check = test(result,ans);
					System.out.println("Sorted: ");
					for(int i=0;i<result.length;i++){
						System.out.println(result[i]);
					}
					System.out.println("Check: "+check);
					
				}

				System.out.println("Do you want to continue further(Y/N): ");
				choices = input.next().charAt(0);
			}while(choices == 'y' || choices == 'Y');
			
			//Comparing elements
			System.out.println("\n\nDo you want to compare elements(Y/N)\n\n");
			char cho = input.next().charAt(0);
			if(cho == 'y' || cho =='Y'){
				System.out.println("\nNow comparing elements!!!!!!!\n");
				System.out.println("Enter the number of elements:");
				int n1 = input.nextInt();
				int[] arr1 = new int[n1];
				int[] arr2 = new int[n1];
				System.out.println("1.Enter Elements \n2.Generate Random");
				int ch1 = input.nextInt();
				if(ch1==1){
					System.out.println("Enter elements in array 1: ");
					for(int i=0;i<arr1.length;i++) {
						arr1[i] = input.nextInt();						
					}
					System.out.println("Enter elements in array 2: ");
					for(int i=0;i<arr2.length;i++) {
						arr2[i] = input.nextInt();						
					}
				}else if(ch1 == 2){
					for(int i=0;i<arr1.length;i++){
						arr1[i] = ran.nextInt(20);
					}
					for(int i=0;i<arr2.length;i++){
						arr2[i] = ran.nextInt(20);
					}
				}else{
					System.out.println("Wrong choice!!");
				}
				System.out.println("Elements in array 1 are: ");
				for(int i=0;i<arr1.length;i++){
					System.out.println(arr1[i]);
				}
				System.out.println("Elements in array 2 are: ");
				for(int i=0;i<arr2.length;i++){
					System.out.println(arr2[i]);
				}

				com = compare(arr1, arr2);
				System.out.println("Comparable: " + com);
			}else{
				System.out.println("Have a nice day!!");
			}


			//Sum of smallest two numbers
			System.out.println("Do you want to find the sum of smallest two number:(Y/N) ");
			char choi = input.next().charAt(0);
			if(choi == 'Y' || choi == 'y'){
				System.out.println("\n\nSmallest\n\n");
				System.out.println("Enter the number of elements: ");
				int no = input.nextInt();
				int arry[] = new int[no];
				System.out.println("1.Enter Elements \n2.Generate Random");
					int ch2 = input.nextInt();
					if(ch2==1){
						System.out.println("Enter elements in array: ");
						for(int i=0;i<arry.length;i++) {
							arry[i] = input.nextInt();						
						}
					}else if(ch2 == 2){
						for(int i=0;i<arry.length;i++){
							arry[i] = ran.nextInt(20);
						}
					}else{
						System.out.println("Wrong choice!!");
					}
					System.out.println("Elements are: ");
					for(int i=0;i<arry.length;i++){
						System.out.println(arry[i]);
					}
				int sum = findSmallestSum(arry);
				System.out.println("Sum: " + sum);
			}else{
				System.out.println("Have a nice day!!");
			}
			System.out.println("Have a nice day!!");
		}catch(Exception e){
			System.out.println("Exception: "+e);
		}

	}

	//test the users answer and computer generated answer
	public static boolean test(int[] result, int[] ans){
		if(result.length != ans.length){
		    return false;
		}else{
		    for (int i = 0; i < result.length; i++) {
		        if (result[i] != ans[i])
		            return false;
		    }
		}
		return true;
	}
	
	//comparing sorting
	public static boolean compare(int[] arr1, int[] arr2){
		InsertionSort in = new InsertionSort();
		if(in.sort(arr1)==in.sort(arr2)){
			return true;
		}
		else{
			return false;
		}
	}
	
	//finding smallest sum 
	public static int findSmallestSum(int[] array){
		MergeSort mm = new MergeSort();
		array = mm.sort(array);
		return (array[array.length-1]+array[array.length-2]);
	}
}