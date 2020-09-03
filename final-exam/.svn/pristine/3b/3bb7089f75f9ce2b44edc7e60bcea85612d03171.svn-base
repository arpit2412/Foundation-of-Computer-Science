//problem-04/DataStructure.java
/*Name: Arpit Garg
Semester : 2
Year: 2019
Id: A1784072 
FCS Final Practical*/
//importing libraries
import java.lang.*;
import java.util.*;
//class DataStructure implementing Structurable
class DataStructure implements Structurable{

	//Implementing sorting of array with return type array of int
	public int [] sort(int [] array){
		if(array.length==0){
			throw new UnsupportedOperationException("No elements.");			//throwing exceptions
		}else{															
			int n = array.length;												//Insertion Sort
			for(int i=1;i<n;i++){
				int j = i-1;
				int key=array[i];
				while(j>=0 && array[j]<=key){
					array[j+1] = array[j];
					j=j-1;
				}
				array[j+1] = key;
			}	
		}
		return array;															//returning array
	}

	//Implementing search in string of array and we we need to search string value
	public int search(String [] array, String value){
		int n = array.length;
		if(n==0){
			throw new UnsupportedOperationException("No elements.");		//throwing exception
		}else{
			for(int i=0;i<n;i++){	
				if(array[i].equals(value)){								//using s1.equals(s2) to compare strings
					return i;											//returning index
				}		
			}
			return -99;													//if element not found returning -99
		}
	}
}

