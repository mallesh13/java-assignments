package tests;

import org.junit.Test;
import static org.junit.Assert.*;
import main.Triangle;

public class TriangleTest{

	@Test
	public void testTriangleIsRighAngled(){
	
		Triangle triangle= new Triangle(3,4,5);
		assertTrue(triangle.isRightAngled());
	
	}
	@Test
	public void testTriangleIsNotRighAngled(){
	
		Triangle triangle= new Triangle(2,4,5);
		assertFalse(triangle.isRightAngled());
	
	}
	
	@Test
	public void testTriangleIsScalene(){
	
		Triangle triangle= new Triangle(1,4,2);
		assertTrue(triangle.isScalene());
	
	}
	@Test
	public void testTriangleIsNotIsScalene(){
	
		Triangle triangle= new Triangle(1,1,2);
		assertFalse(triangle.isScalene());
	
	}
	
	@Test
	public void testTriangleIsNotIsosceles(){
	
		Triangle triangle= new Triangle(1,4,2);
		assertFalse(triangle.isIsosceles());
	
	}
	@Test
	public void testTriangleIsIsosceles(){
	
		Triangle triangle= new Triangle(1,1,2);
		assertTrue(triangle.isIsosceles());
	
	}

	@Test
	public void testTriangleIsNotEquilateral(){
	
		Triangle triangle= new Triangle(1,4,2);
		assertFalse(triangle.isEquilateral());
	
	}
	@Test
	public void testTriangleIsEquilateral(){
	
		Triangle triangle= new Triangle(1,1,1);
		assertTrue(triangle.isEquilateral());
	
	}
	

}