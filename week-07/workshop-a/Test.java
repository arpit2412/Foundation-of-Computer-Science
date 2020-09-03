import java.util.Random;

public class Test{
	public static int [] getRandomArray(int numElements){
		Random rand = new Random();
		int [] ans = new int [numElements];
		for(int i = 0; i < numElements; i++){
			ans[i] = rand.nextInt(50);
		}
		return ans;
	}

	public static void printArray(String [] arr){
		String out = "[";
		for(int i = 0; i < arr.length; i++){
			out += arr[i];
			if (i+1 != arr.length){
				out += ", ";
			}
		}
		out += "]";
		System.out.println(out);
	}

	public static void main(String [] args){
	//InsertionSort insertion = new InsertionSort();
		InsertionSort selection = new InsertionSort();
		String [] arr = {"My","name","is","Arpit","Garg"};
		printArray(arr);
		String [] sortedArray = selection.sort(arr);
		printArray(sortedArray);
	}
}