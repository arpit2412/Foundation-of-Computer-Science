import java.util.Scanner;
class ATM12{
	public static void run(int cash) {
		System.out.printf("The amount of cash: %d\n", cash);
		int fiftyNote=0, twentyNote=0,remainAmount=0;
		if(cash%10 ==0){
			if(cash == 10 || cash == 30){
				System.out.println("Sorry Cannot be withdrawn");
			}else if((cash/10)%2==1){
				if((cash%100)>=50){
					fiftyNote += (cash/50);
					remainAmount = cash%50;
					twentyNote += (remainAmount/20);
				}else{
					fiftyNote += (cash/50);
					fiftyNote -= 1;
					remainAmount = (cash%50)+50;
					twentyNote += (remainAmount/20);
				}
			}else{
				fiftyNote += (cash*2)/100;
				remainAmount = cash % 100;
				twentyNote += (remainAmount/20);
			}
		}else{
			System.out.println("Sorry cannot be withdrawn");
		}
		System.out.println("twenty "+twentyNote+" fifty "+fiftyNote);
	}
	public static void main(String[] args) {
		int cash;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of cash");
		cash = input.nextInt();
		run(cash);		
	}
	
}
