/*
*   Foundations of Computer Science
*   2018, Semester 01
*   Practical-Exam-04
*
*   student (id): a111111
*   student (name): John Smitth
*
* Note: in order to finish your exam you need to make changes in this class
* Problem 03
*/
public class Selection extends Sort{

	@Override
	public int [] sortIntByIndex(int [] arr){
		for(int i=0;i<arr.length;i++){
			int min = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min].compareTo(arr[j]))
					min = j;
				int temp = arr[min];
				arr[min] = arr[j];
				arr[j] =temp;
			}
		}
		return arr;
	}

	@Override
	public int [] sortInt(int [] arr){
		throw new java.lang.UnsupportedOperationException("Not implemented yet!");
	}


	@Override
	public int [] sortStringByIndex(String [] arr){
		int index[] = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			int min = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min].compareTo(arr[j])==0)
					min = j;
				String temp = arr[min];
				arr[min] = arr[j];
				arr[j] =temp;
			}
		}
		// for(int i=0;i<arr.length;i++){
		// 	index[i] = arr[i].getIndex(i);
		// }
		return index;
	}

	@Override
	public String [] sortString(String [] arr){
		throw new java.lang.UnsupportedOperationException("Not implemented yet!");
	}
}
