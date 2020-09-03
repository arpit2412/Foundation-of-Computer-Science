/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
class Rectangle extends Shape{

	private int width;
	private int height;
	//Basic Constructor
	Rectangle(){
		super();
	}

	//Parameterized Constructor 
	Rectangle(int width, int height){
		super.setWidth(width);
		super.setHeight(height);
	}

	//method
	public void display(){
		System.out.println(super.getWidth() + " " + super.getHeight());
	}

}