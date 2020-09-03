/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
public class Shape{
	private double width;
	private double height;
	private double radius;
	private double length;

	//Basic Constructor
	Shape(){
		this.width = 0;
		this.height = 0;
		this.radius = 0;
		this.length = 0; 
	}

	//Parameterized Constructor 
	Shape(double width, double height, double radius, double length){
		setWidth(width);
		setHeight(height);
		setRadius(radius);
		setLength(length);
	}

	//Mutators
	void setWidth(double width){
		this.width = width;
	}

	void setHeight(double height){
		this.height = height;
	}

	void setRadius(double radius){
		this.radius = radius;
	}

	void setLength(double length){
		this.length = length;
	}

	//Accessors
	public double getWidth(){
		return this.width;
	}
	public double getHeight(){
		return this.height;
	}
	public double getRadius(){
		return this.radius;
	}
	public double getLength(){
		return this.length;
	}

}