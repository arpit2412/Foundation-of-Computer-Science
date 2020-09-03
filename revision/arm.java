class arm{
	public static void main(String[] args) {
		arm(1234);
	}
	public static void arm(int a){
		int count =0;
		int n =a;
		while(n!=0){
			count++;
			n=n/10;
		}
		System.out.println(count);
	}
	
}