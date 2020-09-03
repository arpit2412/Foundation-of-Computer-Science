/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
public class Shape{
	private int width;
	private int height;
	private int radius;
	private int length;

	//Basic Constructor
	Shape(){
		this.width = 0;
		this.height = 0;
		this.radius = 0;
		this.length = 0; 
	}

	//Parameterized Constructor 
	Shape(int width, int height, int radius, int length){
		setWidth(width);
		setHeight(height);
		setRadius(radius);
		setLength(length);
	}

	Shape(int width, int height){
		setWidth(width);
		setHeight(height);
	}

	Shape(int radius){
		setRadius(radius);
	}


	//Mutators
	void setWidth(int width){
		this.width = width;
	}

	void setHeight(int height){
		this.height = height;
	}

	void setRadius(int radius){
		this.radius = radius;
	}

	void setLength(int length){
		this.length = length;
	}

	//Accessors
	public int getWidth(){
		return this.width;
	}
	public int getHeight(){
		return this.height;
	}
	public int getRadius(){
		return this.radius;
	}
	public int getLength(){
		return this.length;
	}

}