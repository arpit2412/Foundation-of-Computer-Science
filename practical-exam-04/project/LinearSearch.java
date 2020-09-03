/*
*   Foundations of Computer Science
*   2018, Semester 01
*   Practical-Exam-04
*
*   student (id): a1784072
*   student (name): Arpit Garg
*
*
* Note: in order to finish your exam you are not required to make any changes in this class
*
*/
class LinearSearch extends Search{    
    public int search(int arr[], int query){
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == query)
                return i;
        }
        return -1;
    }

    public int search(String arr[], String query){
        for(int i = 0; i < arr.length; i ++){
            if(arr[i].compareTo(query)==0)
                return i;
        }
        return -1;
    }

    public int search(float arr[], float query){
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == query)
                return i;
        }
        return -1;
    }
}