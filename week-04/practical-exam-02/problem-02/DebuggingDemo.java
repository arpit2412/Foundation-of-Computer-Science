//==================================
// Foundations of Computer Science
// Student: Arpit Garg
// id: A1784072
// Semester: 02
// Year: 2019
// Practical Exam Number: 02
//===================================

//Class DebuggingDemo
public class DebuggingDemo {

    public void bugMethod() {
         int num[] = {1, 2, 3, 4};
         System.out.println(num[4]);  //Array starts from 0 so its till 4 and in the default program index is given 5 which is not possible so to print the last element index it must be 4 instead of 5.
     }

    public float bugMethod2() {			//return type is float and ans is also of float type so the return type of the method must be float instead of int.
            float ans = 0.0f;			//to preserve precision it must be 0.0f instead of 0.0.
            System.out.println("This method had a bug!");
            return ans;
     }


}