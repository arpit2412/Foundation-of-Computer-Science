import java.util.Scanner;

class Problem04 {
	public static void main(String[] args) {
		
		int number_a, number_b, number_c;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number");
		number_a = input.nextInt();

		System.out.println("Enter the second number");
		number_b = input.nextInt();

		number_c = number_a + number_b;

		System.out.println("the sum of " + number_a + " and " + number_b + " is " + number_c);
	}
}