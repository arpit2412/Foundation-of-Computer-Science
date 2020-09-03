class Shape{
	private double width, height, radius, length;
	
	Shape(){
		width= 0.0; height= 0.0;radius= 0.0; length = 0.0;
	}

	Shape(double width, double height, double radius, double length){
		this.width = width;
		this.height = height;
		this.radius = radius;
		this.length = length;
	}

	public void setWidth(double width){
		this.width = width;
	}

	public void setHeight(double height){
		this.height = height;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}

	public void setLength(double length){
		this.length = length;
	}

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