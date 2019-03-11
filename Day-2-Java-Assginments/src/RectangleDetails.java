import java.util.*;
public class RectangleDetails{

	static public void main(String arg[]){
	
	double length;
	double breadth;
	Scanner sc = new Scanner(System.in);

	length = sc.nextDouble();
	breadth = sc.nextDouble(); 
	Rectangle details1 = new Rectangle(length,breadth);
	details1.areaOfRectangle();
	details1.peremeterOfRectangle();
	System.out.println(details1.toString());

	length = sc.nextDouble();
	breadth = sc.nextDouble(); 
	Rectangle details2 = new Rectangle(length,breadth);
	details2.areaOfRectangle();
	details2.peremeterOfRectangle();
	System.out.println(details2.toString());
	
	if(details1.areaOfRectangle()==details2.areaOfRectangle())
		System.out.println("Areas of rectangles are same");
	else
		System.out.println("Areas of rectangles are not same");

	}
} 