import java.util.*;
class P7{
	public static void main(String[] args) {
		int a,b,y=1;
		int count =0;
		Scanner input = new Scanner(System.in);
		while(y==1){
			if(count == 0){
				System.out.println("1. Sum 2.Exit");
				y = input.nextInt();
				if(y==1){
				System.out.println("Enter 1");
				a = input.nextInt();
				System.out.println("Enter 2");
				b = input.nextInt();
				System.out.println("Sum:" + (a+b));
				count++;
				}
			}else{
				System.out.println("1. Sum Again 2.Exit");
				y = input.nextInt();
				if(y==1){
				System.out.println("Enter 1");
				a = input.nextInt();
				System.out.println("Enter 2");
				b = input.nextInt();
				System.out.println("Sum:" + (a+b));
				count++;
				}
			}
			
		}
		System.out.println("Have a nice day");	
	}
}