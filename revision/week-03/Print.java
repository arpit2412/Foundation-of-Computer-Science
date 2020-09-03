class Print{
	void printArray(int [] array){
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	void printArray(String [] array){
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	void printArray(float [] array){
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}

	int [] reverseArray(int [] array){
		int rev[] = new int[array.length];
		// for(int i = array.length-1;i>=0;i--){
			for(int j=0,i=array.length-1;j<array.length&&i>=0;j++,i--){
				rev[j] = array[i];
			}
		// }
		return rev;
	}
	String [] reverseArray(String [] array){
		String rev[] = new String[array.length];
		for(int j=0,i=array.length-1;j<array.length&&i>=0;j++,i--){
				rev[j] = array[i];
			}
		return rev;
	}
	float [] reverseArray(float [] array){
		float rev[] = new float[array.length];
		// for(int i = array.length-1;i>=0;i--){
			for(int j=0,i=array.length-1;j<array.length&&i>=0;j++,i--){
				rev[j] = array[i];
			}
		// }
		return rev;
	}
	
}