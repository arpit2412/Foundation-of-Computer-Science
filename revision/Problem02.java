class Problem02{
	public static void main(String[] args) {
		System.out.print("[");
		for(int i=101;i>88;i--){
			if(i!=89){
				System.out.print(i +",");
			}else{
				System.out.print(i);
			}
		}
		System.out.print("]");
	}
}