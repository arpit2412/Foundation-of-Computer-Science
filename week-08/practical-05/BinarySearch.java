/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 
* name: Arpit Garg
*
*/
class BinarySearch extends MySearchAlg{
	public int search(int[] array, int num){
		return this.search(array, num, 0, array.length-1);		//function overloading
	}
	public int search(int [] array, int num, int lower, int upper){
		if(upper < lower)										//array terminate means no element found 
			return -1;
		
		int middle = (int) (lower + upper)/2;
		if(array[middle] == num)								//if element found in the middle
			return middle;							

		if(array[middle] < num)
			return this.search(array, num, middle+1, upper);		//recursion
		else
			return this.search(array, num, lower, middle-1);		//recursion

	}
}