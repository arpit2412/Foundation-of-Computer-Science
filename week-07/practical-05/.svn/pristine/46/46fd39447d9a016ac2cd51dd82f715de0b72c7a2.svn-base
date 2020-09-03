/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//Insertion sort
public class InsertionSort extends MySortAlg{
	public int[] sort(int[] array){
		int n = array.length;
		int i;
		for(int j = 1; j < n; j++){
			int key = array[j];
			i = j - 1;
			while (( i >= 0) && (array[i] < key )){
				array[i+1] = array[i];
				i--;	
			}
			array[i+1] = key;
		}
		return array;
	}
}