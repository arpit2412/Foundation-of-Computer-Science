/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
class PhysicalBook extends Book{
	
	//Creating variables
	private int shelf;
	private int aisle;
	private int floor;

	//Basic Constructor
	PhysicalBook(){
		super();
	}

	//Parameterised Constructor
	PhysicalBook(String title, int year, String publish, int pages, int shelf,int aisle, int floor){
		super(title,year,publish,pages);
		setFunctions(shelf,aisle,floor);
	}

	//Methods
	public void setFunctions(int shelf, int aisle, int floor){
		this.shelf = shelf;
		this.aisle = aisle;
		this.floor = floor;
	}

	public int getShelf(){
		return this.shelf;
	}
	
	public int getAisle(){
		return this.aisle;
	}

	public int getFloor(){
		return this.floor;
	}
}