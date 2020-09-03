/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
class Circle extends Shape{
	private double area;

	//Basic Constructor
	Circle(){
		super();
	}

	//Parameterized Constructor 
	Circle(double radius){
		super.setRadius(radius);
	}

	//Mutators
	public void setArea(){
		area = super.getRadius() * 3.14159 * super.getRadius();
	}

	//Accessors
	public double getArea(){
		return area;
	}

	
}