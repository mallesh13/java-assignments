public class Complex{
	
	private float real;
	private float imaginary;
	
	public void setRealAndImaginary(float real,float imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public void displayComplexNumber(){
		System.out.println("complex number = "+ real+ "+" +imaginary+"i");
	}
	
	public Complex sumOfTwoComplexNumbers(Complex number){
		
		Complex complexNumber3= new Complex();
		complexNumber3.real=this.real+number.real;
		complexNumber3.imaginary=this.imaginary+number.imaginary;
		return complexNumber3; 
		
		
	}
	
}