public abstract class Sort implements SortInterface{
	public int [] sortIntByIndex(int [] arr){
		int [] ans = new int [arr.length];
		for(int i = 0; i < arr.length; i++){
			ans[i] = i;
		}
		return ans;
	}

	public abstract int [] sortInt(int [] arr);
	//public abstract int [] sortInt(int [] arr, boolean returnIndex);

	public int [] sortStringByIndex(String [] arr){
		int [] ans = new int [arr.length];
		for(int i = 0; i < arr.length; i++){
			ans[i] = i;
		}
		return ans;
	}

	
	public int [] sortFloatByIndex(Float [] arr){
		int [] ans = new int [arr.length];
		for(int i = 0; i < arr.length; i++){
			ans[i] = i;
		}
		return ans;
	}

	public int [] getIndex(int value){
		int [] ans = new int [value];
		for(int i = 0; i < value; i++){
			ans[i] = i;
		}
		return ans;
	}

	public void printArray(int [] arr, String info){
		String ans = info + "[";
		for(int i = 0; i < arr.length; i++){
			ans += arr[i];
			if(i == arr.length-1)
				ans += "];";
			else
				ans += ",";
		}
		System.out.println(ans);

	}
}