import java.util.*;
class Pallindrome{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = input.nextInt();
		System.out.println(palli(a,0));
		
	}
	public static int palli(int a, int p){
		int n=0;
			if(a==0){
				return p;
			}
			n = a%10;
			p = p*10+n;
			return palli(a/10,p);
		

	}
}