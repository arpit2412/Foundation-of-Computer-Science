import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Print p = new Print();
		String array[] = {"Arpit", "Garg", "FCS", "Semester 2", "A1784072"};
		p.printArray(array);
		array = p.reverseArray(array);
		p.printArray(array);
	}
}