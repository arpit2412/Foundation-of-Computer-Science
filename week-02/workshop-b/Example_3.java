import java.util.Scanner;
class Example_3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum=0.0,a;
		do{
			System.out.println("Enter a double number");
			a = input.nextDouble();
			sum+=a;
		}while(a!=0.0);
		System.out.println("Sum is "+ sum);
	}
	
}