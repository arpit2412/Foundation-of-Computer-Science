
public class InsertionSort{

	// Sorting in ascending order
	public String [] sort(String []arr){
		String tmpKey;
		int counter_operations = 0;
		for (int j=1; j < arr.length; j++) {
			// temporary variable fixed on J;
			tmpKey = arr[j];
			counter_operations++;

			// Counter of backwards elements;
			int i = j - 1;
			counter_operations++;

			//1. Verify if there are still elements; and,
			//2. Verify whether current element is bigger then key
			while((i >= 0) && (arr[i].compareTo(tmpKey)>0)){
				// Replace bigger element with smaller element
				arr[i+1] = arr[i];
				counter_operations++;
				// Move counter
				i--;
				counter_operations++;
			}
			// Insert smaller element into the first position;
			arr[i+1] = tmpKey;
			counter_operations++;

		}
		System.out.println("Number of operations: " + counter_operations);
		return arr;
	}
}