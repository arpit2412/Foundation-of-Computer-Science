import java.util.*;
class Complex{
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter real 1: ");
			int r1 = input.nextInt();
			System.out.println("Enter imag 1: ");
			int c1 = input.nextInt();
			System.out.println("Enter real 2: ");
			int r2 = input.nextInt();
			System.out.println("Enter imag 2: ");
			int c2 = input.nextInt(); 
			add(r1,c1,r2,c2);
			sub(r1,c1,r2,c2);
			mul(r1,c1,r2,c2);
			div(r1,c1,r2,c2);
		}	

	public static void add(int r1,int c1,int r2,int c2){
		int rr = r1 + r2;
		int cc = c1 + c2;
		System.out.println(rr + " " + cc + "i");
	}
	public static void sub(int r1,int c1,int r2,int c2){
		int rr = r1 - r2;
		int cc = c1 - c2;
		System.out.println(rr + " " + cc + "i");
	}
	public static void mul(int r1,int c1,int r2,int c2){
		int rr = r1*r2 - c1*c2;
		int cc = r1*c2 + r2*c1;
		System.out.println(rr + " " + cc + "i");
	}
	public static void div(int r1,int c1,int r2,int c2){
		float rr = (float)(r1*r2 + c1*c2)/(r2*r2 + c2*c2);
		float cc = (float)(r2*c1 - r1*c2)/(r2*r2 + c2*c2);
		System.out.println(rr + " " + cc + "i");
	}
}