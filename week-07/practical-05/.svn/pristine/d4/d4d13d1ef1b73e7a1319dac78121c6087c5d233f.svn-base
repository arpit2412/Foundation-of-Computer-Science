/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//Quick Sort
class QuickSort extends MySortAlg{
	public int [] sort(int [] array){
		if(array.length > 1){

			int [] array1 = this.getBigger(array);
			array1 = this.sort(array1);

			int [] array2 = this.getSmaller(array);
			array2 = this.sort(array2);

			return this.concatenate(array1, array[array.length-1], array2);

		} else{
			return array;
		}
	}

	//Conactenate of array  
	public int [] concatenate(int []a1, int pivot, int [] a2){
		int [] nArray = new int[a1.length + 1 + a2.length];
		int j = 0;
		for(int i = 0; i < a1.length; i++){
			nArray[j] = a1[i];
			j++;
		}
		nArray[j] = pivot;
		j++;
		
		for(int i = 0; i < a2.length; i++){
			nArray[j] = a2[i];
			j++;
		}
		return nArray;
	}

	//get smaller part of array 
	public int [] getSmaller(int [] array){
		int count = 0;
		for (int i = 0; i < array.length-1; i++)
			if(array[i] < array[array.length-1])
				count++;
		
		int [] nArray = new int[count];

		int j = 0;
		for(int i = 0; i < array.length -1; i++){
			if(array[i] < array[array.length-1]){
				nArray[j] = array[i];
				j++;
			}
		}
		return nArray;
	}

	//get bigger part of array
	public int [] getBigger(int [] array){
		int count = 0;
		for (int i = 0; i < array.length-1; i++)
			if(array[i] > array[array.length-1])
				count++;
		
		int [] nArray = new int[count];

		int j = 0;
		for(int i = 0; i < array.length -1; i++){
			if(array[i] > array[array.length-1]){
				nArray[j] = array[i];
				j++;
			}
		}
		return nArray;
	}
	
}