/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//Children class RectangleArea 
class RectangleArea extends Rectangle{
	//Taking input from user
	public void read_input(int width, int height){
		super.setWidth(width);
		super.setHeight(height);
	}
	//Overriden Display
	@Override
	public void display(){
		System.out.println("\n--------------------\n");
		super.display();			//parent display
		System.out.println(super.getWidth() * super.getHeight());	//Area of reactngle
		System.out.println("\n--------------------\n");
	}
	
}