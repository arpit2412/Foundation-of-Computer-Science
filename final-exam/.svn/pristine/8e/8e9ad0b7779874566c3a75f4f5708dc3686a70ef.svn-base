//problem-02/Factorial.java
/*Name: Arpit Garg
Semester : 2
Year: 2019
Id: A1784072 
FCS Final Practical*/
//importing libraries
import java.lang.*;
//class factorial
public class Factorial{  
	//find function  
    public int find(int x){
        if(x<0){						//checking for zero	
        	throw new UnsupportedOperationException("Not defined.");	//throwing exception
        }else{
        	if(x==0 || x==1){					//if value is 0 or 1 return 1 
        		return 1;
        	}else{
        		return x*find(x-1);			//recursive function call eg: find(4) so it will be 4*find(3) and so on
        	}
        }
    }
}