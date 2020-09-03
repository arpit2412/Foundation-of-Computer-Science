class Contestant extends Competitor{
	private String name, country;
	private int age;
	private float confidence, ambition, authenticity, credibility, grace;

	Contestant(){
		
	}

	Contestant(String name, String country, int age){
		this.name = name;
		this.country = country;
		this.age = age;
	}
	Contestant(String name, String country, int age, float confidence, float ambition, float authenticity, float credibility, float grace){
		this.name = name;
		this.country = country;
		this.age = age;
		this.confidence = confidence;
		this.ambition = ambition;
		this.authenticity = authenticity;
		this.credibility = credibility;
		this.grace = grace;
	}

	public float getMean(){
		float mean = (this.getConfidence() + this.getAmbition() + this.getAuthenticity() + this.getCredibility() + this.getGrace())/5;
		return mean;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setCountry(String country){
		this.country = country;
	}
	public String getCountry(){
		return this.country;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	public void setConfidence(float confidence){
		this.confidence = confidence;
	}
	public float getConfidence(){
		return this.confidence;
	}
	public void setAmbition(float ambition){
		this.ambition = ambition;
	}
	public float getAmbition(){
		return this.ambition;
	}
	public void setAuthenticity(float authenticity){
		this.authenticity = authenticity;
	}
	public float getAuthenticity(){
		return this.authenticity;
	}
	public void setCredibility(float credibility){
		this.credibility = credibility;
	}
	public float getCredibility(){
		return this.credibility;
	}
	public void setGrace(float grace){
		this.grace = grace;
	}
	public float getGrace(){
		return this.grace;
	}
}