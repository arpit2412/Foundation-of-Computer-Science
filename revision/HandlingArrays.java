public class HandlingArrays{

    public static void printArray(double [] testArray) {
    		System.out.print("[");
          for(int i=0;i<testArray.length;i++){
          	if(i!=testArray.length-1){
          		System.out.print(testArray[i]+",");
          	}else{
          		System.out.print(testArray[i]);
          	}
          	System.out.print("]");
          }
     }

    public static double[] sumElements(double [] firstArray, double [] secondArray) {
         double sum[] = new double[firstArray.length];
         if(firstArray.length == secondArray.length){
         	
         	for(int i=0;i<firstArray.length;i++){
         		sum[i] = firstArray[i] + secondArray[i];
         	}
         	System.out.print("{");
          for(int i=0;i<sum.length;i++){
          	if(i!=sum.length-1){
          		System.out.print(sum[i]+",");
          	}else{
          		System.out.print(sum[i]);
          	}
          	System.out.print("}");
          
          }	

         }else{
         	throw new RuntimeException("Error - Arrays different shape");

         }
        	 return sum; 
     }

    public static double[] reverseArray(double [] testArray) {
          double reverse[] = new double[testArray.length];
          for(int i=testArray.length-1, j=0;i>=0&&j<reverse.length;i--,j++){
          	reverse[j] = testArray[i];
          }

          System.out.print("{");
          for(int i=0;i<reverse.length;i++){
          	if(i!=reverse.length-1){
          		System.out.print(reverse[i]+",");
          	}else{
          		System.out.print(reverse[i]);
          	}
          	System.out.print("}");
          }
          return reverse;
     }

}