/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 
* name: Arpit Garg
*
*/
class LinearSearch extends MySearchAlg{
	public int search(int[] array, int num){
		for(int i=0;i<array.length;i++){
			if(array[i]==num){
				return i;			//if element found in array 
			}
		}
		return -1;					// if element not found return -1
	}
}