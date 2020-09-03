class Book{
	private String title, publish;
	private int year, pages;

	public Book(){
		this.title = null;
		this.publish = null;
		this.year = 0;
		this.pages = 0;
	}

	public Book(String title, int year, String publish, int pages){
		this.title = title;
		this.year = year;
		this.publish = publish;
		this.pages = pages;
	}


	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	public int getYear(){
		return this.year;
	}
	public void setPublish(String publish){
		this.publish = publish;
	}
	public String getPublish(){
		return this.publish;
	}
	public void setPages(int pages){
		this.pages = pages;
	}
	public int getPages(){
		return this.pages;
	}
}