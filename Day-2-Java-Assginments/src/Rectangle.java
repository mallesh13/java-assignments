public class Rectangle{

	private double length;
	private double breadth;	
	
	public Rectangle(double length,double breadth){
		
		this.length=length;
		this.breadth=breadth;
	}
	
	public double areaOfRectangle(){
		return length*breadth;
	}
	public double peremeterOfRectangle(){
		return 2*(length+breadth);	
	}
	public String toString(){
		return "Area of rectangle = "+ areaOfRectangle()+"\nperemeter of rectangle = " + peremeterOfRectangle();  
	}
}