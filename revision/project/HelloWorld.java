public class HelloWorld{

     public static void main(String []args){
        int[] marks = {89, 90, 85, 75, 77, 60}; //line1
        int mean = 0;                           //line2
    for (int i=0; i<marks.length; i++) {    //line3
    mean += marks[i];                   //line4
    }                                       //line5
    mean /= marks.length; 
        System.out.println(mean);
        }
}