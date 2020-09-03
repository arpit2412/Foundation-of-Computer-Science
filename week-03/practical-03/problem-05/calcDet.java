
/*
*
* Foundations of Computer Science 
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
class calcDet{

	public int calcDet(int array[][], int n){
		//creating variables 
		int d=0,x,y,z;

		//Calculating determinant of matrix size 2
		if(n == 2){
			d = (array[0][0]*array[1][1] - array[0][1]*array[1][0]);

		}else if(n==3){																//calculating determinant of matrix size 3 
			x = (array[1][1] * array[2][2]) - (array[2][1] * array[1][2]);
			y = (array[1][0] * array[2][2]) - (array[2][0] * array[1][2]);
			z = (array[1][0] * array[2][1]) - (array[2][0] * array[1][1]);
			d = (array[0][0] * x) - (array[0][1] * y) + (array[0][2] * z);
			
		}
		return d;									//returning the value of determinant
	}
}