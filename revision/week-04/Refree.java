class Refree{

	public Refree(){
		Player p1 = new Human();
		Player p2 = new Computer();
		String ch1 = p1.performMove();
		String ch2 = p2.performMove();
		boolean c1 = check(ch1);
		boolean c2 = check(ch2);
		if(c1 == true && c2 == true){
			play(ch1,ch2);
		}
	}

	public boolean check(String ch1){
		if(ch1.equalsIgnoreCase("Rock")||ch1.equalsIgnoreCase("Paper")||ch1.equalsIgnoreCase("Scissor")){
			return true;
		}else{
			return false;
		}
	}

	public void play(String ch1, String ch2){
		if(ch1.equalsIgnoreCase(ch2)){
			System.out.println("Tie");
		}else if((ch1.equalsIgnoreCase("Rock")&&ch2.equalsIgnoreCase("Scissor"))||(ch1.equalsIgnoreCase("Paper")&&ch2.equalsIgnoreCase("Rock"))||(ch1.equalsIgnoreCase("Scissor")&&ch2.equalsIgnoreCase("Paper"))){
			System.out.println("Player Wins");
		}else{
			System.out.println("Computer Wins");
		}
	}
	
}
