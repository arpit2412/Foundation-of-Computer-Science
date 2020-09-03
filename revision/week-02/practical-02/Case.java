import java.util.*;
class Case{
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = new int[10];
		for(int i =0;i<10;i++){
			arr[i] = ran.nextInt(20);
		}
		for (int i=0;i<10;i++){
			System.out.println(arr[i]);
			switch(arr[i]){
				case 0:
				case 1:
				case 2:
				case 3:
				case 4: for(int j=0;j<arr[i];j++){
							System.out.print("o");
						}
						System.out.println();
						break;
				case 5:
				case 6:
				case 7:
				case 8:
				case 9: for(int j=0;j<arr[i];j++){
							System.out.print("x");
						}
						System.out.println();
						break;
				case 10:
				case 11:
				case 12:
				case 13:
				case 14: for(int j=0;j<arr[i];j++){
							System.out.print("s");
						}
						System.out.println();
						break;
				default: for(int j=0;j<arr[i];j++){
							System.out.print("*");
						}
						System.out.println();
						break;
			}
			
		}
	}	
}