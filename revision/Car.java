public class Car{
	private String model;
	private int numGears;
	private float literTank;
	private int yearManufacture;
	Car(){
		this.model = null;
		this.numGears = 0;
		this.literTank = 0.0f;
		this.yearManufacture=0;
	}
	Car(String model, int numGears, float literTank, int yearManufacture){
		this.model = model;
		this.numGears = numGears;
		this.literTank = literTank;
		this.yearManufacture=yearManufacture;
	}

	public void setModel(String model){
		this.model = model;
	}
	public String getModel(){
		return this.model;
	}

	public void setnumGears(int numGears){
		this.numGears = numGears;
	}
	public int getnumGears(){
		return this.numGears;
	}

	public void setLiterTank(float literTank){
		this.literTank = literTank;
	}
	public float getLiterTank(){
		return this.literTank;
	}

	public void setYearManufacture(int yearManufacture){
		this.yearManufacture = yearManufacture;
	}
	public int getYearManufacture(){
		return this.yearManufacture;
	}

}