import java.util.*;
class Great{
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = new int[10];
		int sum =0;
		float average = 0.0f;
		for(int i=0;i<10;i++){
			arr[i] = ran.nextInt(20);
			sum += arr[i]; 
		}
		average = (float)sum/10;
		for(int i=0;i<10;i++){

			if(arr[i]>=10){
				System.out.println(arr[i]+":");
				for (int j=0;j<arr[i];j++){
				System.out.print(">=");
				}
				System.out.println();
			}else{
				System.out.println(arr[i]+":");
				for (int j=0;j<arr[i];j++){
				System.out.print("<");
				}
				System.out.println();
			}
			
		}
		System.out.println("Average:");
		System.out.println(average);
		System.out.println(Math.round(average));
		for (int i=0;i<Math.round(average);i++){
				System.out.print("*");
		}
	}
	
}