
public class SelectionSort{

	// Sorting in ascending order
	public int [] sort(int []arr){
		// get number of elements in our array
		int nElements = arr.length;
		
		// First subArray from 0... N-1
		for(int j = 0; j <  nElements - 1; j++){
			// Set the first smaller as J
			int smallest = j;

			// Second subArray from j+1...N
			for(int i = j + 1; i < nElements; i++){
				
				if (arr[i] < arr[smallest]){
					smallest = i;
				}
			}
		
			// This does not work, we need a temporary key;
			// arr[j] = arr[smallest];
			// arr[smallest] = arr[j];

			int tmpKey = arr[j];
			arr[j] = arr[smallest];
			arr[smallest] = tmpKey;
		}
		return arr;
	}
}