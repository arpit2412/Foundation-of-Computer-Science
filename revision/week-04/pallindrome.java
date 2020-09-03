class pallindrome{
	public static void main(String[] args) {
		String str = reverse(ABCBA);
	}

	public static String reverse(String a){
		String str;
		if(a.length==0){
			return str;
		}else{
			str = str+a.charAt(a.length-1);
			a.length = a.length-1;
			reverse(a);
		}
	}

	
}