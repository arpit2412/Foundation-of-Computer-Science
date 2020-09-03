import java.util.*;
class Cash{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount:");
		int amount = input.nextInt();
		int t=0,f=0;
		while(amount!=0){	
			if(amount == 10 || amount == 30){
				System.out.println("Cannot be withdrawn!!");
				break;
			}else{
				if(amount%50 == 0){
					f++;
					amount-=50;
				}else if(amount%20 ==0){
					t++;
					amount-=20;
				}else if(amount>50){
					f++;
					amount-=50;
				}else{
					System.out.println("Cannot be withdrawn!!");
					break;
				}
			}
		}
		System.out.println(t+":"+f);
	}
}