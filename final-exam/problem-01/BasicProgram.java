//problem-01/BasicProgram.java
/*Name: Arpit Garg
Semester : 2
Year: 2019
Id: A1784072 
FCS Final Practical*/
//importing libraries
import java.lang.*;

//class
public class BasicProgram{    

	//sum function
    public int sum(int a, int b){
    	return a+b;							//returning sum
    }

    //div function
    public double div(int a, int b){
    	if(b!=0){							//checking is sum is zero or not
    		double c = (double)a/b;
    		return c;						//returning division
    	}else{
    		throw new UnsupportedOperationException("Not possible division by zero.");					//throwing exception
    	}
    }

    //display array
    public void displayArray(int []array){							
    	if(array.length==0){
    		throw new UnsupportedOperationException("No elements.");	//throwing exception
    	}else{
    		System.out.print("[");
    		for(int i=0;i<array.length;i++){				//printing array
    			if(i!=array.length-1){
    				System.out.print(array[i]+",");
    			}else{
    				System.out.print(array[i]);
    			}
    		}
    		System.out.println("];");
    	}
    }
}