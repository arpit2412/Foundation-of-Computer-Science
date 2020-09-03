public class Cake{
	private String name;
	private float qtSugar;
	private float qtFlour;
	private float qtYeast;
	private double timePrepare;

	Cake(){
		name = null;
		qtSugar = 0.0f;
		qtFlour =0.0f;
		qtYeast = 0.0f;;
		timePrepare=0.0;
	}

	Cake(String name, float qtSugar, float qtFlour, float qtYeast, double timePrepare){
		this.name = name;
		this.qtSugar = qtSugar;
		this.qtFlour =qtFlour;
		this.qtYeast = qtYeast;;
		this.timePrepare= timePrepare;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setqtSugar(float qtSugar){
		this.qtSugar = qtSugar;
	}
	public float getqtSugar(){
		return this.qtSugar;
	}
	public void setqtFlour(float qtFlour){
		this.qtFlour = qtFlour;
	}
	public float getqtFlour(){
		return this.qtFlour;
	}
	public void setqtYeast(float qtYeast){
		this.qtYeast = qtYeast;
	}
	public float getqtYeast(){
		return this.qtYeast;
	}
	public void settimePrepare(double timePrepare){
		this.timePrepare = timePrepare;
	}
	public double gettimePrepare(){
		return this.timePrepare;
	}
}