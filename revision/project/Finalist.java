class Finalist extends Contestant{
	private String moto;
	private Finalist next;
	private Contestant info;

	public void setMoto(String moto){
		this.moto = moto;
	}
	public String getMoto(){
		return this.moto;
	}

	public Finalist getNext(){
		return this.next;
	}
	public void setNext(Finalist next){
		this.next = next;
	}
	public void setInfo(Contestant info){
		this.info = info; 
	}

	public Contestant getInfo(){
		return this.info;
	}

	Finalist(Contestant info){
		this.info = info;
	}
	public void display(){
		System.out.println("Contestant: " + super.getName() +", " + super.getAge() + " from " + super.getCountry());
		System.out.println("Confidence: " + super.getConfidence());
		System.out.println("Ambition: " + super.getAmbition());
		System.out.println("Credibility: " + super.getCredibility());
		System.out.println("Grace: " + super.getGrace());
		System.out.println("Authenticity: " + super.getAuthenticity());
		System.out.println("Mean: " + super.getMean());
		System.out.println("Moto: " + this.getMoto());
	}
	
}