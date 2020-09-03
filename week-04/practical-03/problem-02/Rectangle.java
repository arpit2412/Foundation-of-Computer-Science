/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
class Rectangle extends Shape{

	private double area;

	//Basic Constructor
	Rectangle(){
		super();
	}

	//Parameterized Constructor 
	Rectangle(double width, double length){
		super.setWidth(width);
		super.setLength(length);
	}

	//Method
	public double area(){
		area = super.getWidth() * super.getLength();
		return area;
	}

}