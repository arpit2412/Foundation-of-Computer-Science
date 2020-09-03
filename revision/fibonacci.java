class fibonacci{
	public static void main(String[] args) {
		System.out.println(fibo(7)); 
	}

	public static int fibo(int a){
		
			if(a==0 || a==1 ){
				return a;
			}else{
				return fibo(a-1) + fibo(a-2);
			}
	}
	
}