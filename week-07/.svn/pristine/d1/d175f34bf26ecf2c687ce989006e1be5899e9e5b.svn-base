public class MergeSort{

	public int [] getSubArray(int [] arr, int start, int end){
		int [] ans = new int[end-start];
		int nElement = 0;
		for(int i = start; i < end; i++){
			ans[nElement] = arr[i];
			nElement++;
		}
		return ans;
	}

	public void printArray(int [] arr){
		String ans = "[";
		for(int i = 0; i < arr.length; i++){
			ans += arr[i];
			if(i != arr.length-1)
				ans += ", ";
		}
		ans += "]";
		System.out.println(ans);
	}

	public int [] merge(int [] arr1, int [] arr2){
		int [] ans = new int [arr1.length + arr2.length];
		int [] firstArray;
		int [] secondArray;
		if(arr1[0] < arr2[0]){
			firstArray = arr1;
			secondArray = arr2;
		}else{
			firstArray = arr2;
			secondArray = arr1;
		}
		
		int element = 0;
		for(int i = 0; i < firstArray.length; i++){
			ans[element] = firstArray[i];
			element++;
		}

		for(int i = 0; i < secondArray.length; i++){
			ans[element] = secondArray[i];
			element++;

		}

		return ans;	
	}


	public int [] mergeSort(int[] arr){
		int n = arr.length;
		if(n != 1){
			int n2 =(int) Math.ceil( (double) n / 2);
			int [] firstArray = getSubArray(arr, 0, n2);
			//this.printArray(firstArray);
			int [] sorted1 =  mergeSort(firstArray);


			int [] secondArray = getSubArray(arr, n2, n);
			//this.printArray(secondArray);
			int [] sorted2 = mergeSort(secondArray);

			//System.out.println("returning-array: ");
			//printArray(this.merge(sorted1, sorted2));
			return this.merge(sorted1, sorted2);
		} else{
			//System.out.println("returning: " + arr[0]);
			return arr;
		}
	}

	public int [] sort(int [] arr){
		return this.mergeSort(arr);
	}

	public static void main(String [] args){
		int [] a = new int[] {7,6,5,4,3,2,1};
		int [] sorted = new MergeSort().sort(a);
		new MergeSort().printArray(sorted);
	}

}