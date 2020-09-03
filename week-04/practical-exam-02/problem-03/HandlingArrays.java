//==================================
// Foundations of Computer Science
// Student: Arpit Garg
// id: A1784072
// Semester: 02
// Year: 2019
// Practical Exam Number: 02
//===================================

//Class Handling Arrays
public class HandlingArrays {
	//Print the arrays in same order
    public static void printArray(double [] testArray) {
          System.out.print("[");
          for(int i=0;i<testArray.length;i++){
          	System.out.print(testArray[i]);
          	if(i!=testArray.length-1){
          		System.out.print(",");
          	}
          }
          System.out.print("]");
          System.out.println();
     }
     //returning the difference of the arrays
    public static double[] sumElements(double [] firstArray, double [] secondArray) {
          if(firstArray.length != secondArray.length){
          	throw new RuntimeException("Error - Arrays different shape");
          }else{
        	double sum[] = new double[firstArray.length];
          	for(int i=0;i<firstArray.length;i++){
          		sum[i] = firstArray[i] + secondArray[i];
          	}
          	return sum;
          }
     }
    //returning the reverse of the arrays
    public static double[] reverseArray(double [] testArray) {
          double rev[] = new double[testArray.length];
          for(int i= testArray.length-1; i >= 0; i--){
          	for(int j=0;j<testArray.length;j++){
          		rev[j] = testArray[i];
          	}
          }
          return rev;
     }
}