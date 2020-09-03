import java.util.*;
class RandomN{
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = new int[10];
		int sum = 0;
		float mean = 0.0f;
		for(int i=0;i<10;i++){
			arr[i] = ran.nextInt(50);
		}
		for(int i=0;i<10;i++){
			sum += arr[i];
		}

		mean = (float)sum/10;
		System.out.println("Mean is: " + mean);
	}
	
}