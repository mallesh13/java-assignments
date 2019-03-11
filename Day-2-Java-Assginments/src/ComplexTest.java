import java.util.*;

public class ComplexTest{
	
	static public void main(String arg[]){
		
	float real;
	float imaginary;
	Scanner s = new Scanner(System.in);
	Complex complexNumber1 = new Complex();
	real = s.nextFloat();
	imaginary = s.nextFloat();
	complexNumber1.setRealAndImaginary(real,imaginary);
	complexNumber1.displayComplexNumber();
	
	Complex complexNumber2 = new Complex();
	real = s.nextFloat();
	imaginary = s.nextFloat();
	complexNumber2.setRealAndImaginary(real,imaginary);
	complexNumber2.displayComplexNumber();
	
	
	Complex complexNumber3 ;	
	complexNumber3=complexNumber1.sumOfTwoComplexNumbers(complexNumber2);	
	complexNumber3.displayComplexNumber();
	
	}
}