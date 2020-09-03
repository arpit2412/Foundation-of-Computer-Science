import java.util.*;
class Prime{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = input.nextInt();
		boolean flag = true;
		for(int i=2;i<n;i++){
			if(n%i==0){
				flag = false;
				break;
			}else{
				flag = true;
			}
		}
		if(flag == true){
			System.out.println("Prime");
		}else{
			System.out.println("Not prime");
		}
	}
}