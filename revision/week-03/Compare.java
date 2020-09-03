import java.util.*;
class Compare{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = input.nextInt();
		System.out.println("Enter the second number");
		int b = input.nextInt();
		if(a>b){
			System.out.println("A" + a);
		}else{
			System.out.println("B" + b);
		}
	}
}