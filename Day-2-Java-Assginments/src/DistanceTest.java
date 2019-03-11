import java.util.*;

public class DistanceTest{
	
	static public void main(String arg[]){
		
	int feet;
	float inches;
	Scanner s = new Scanner(System.in);
	Distance distance1 = new Distance();
	feet = s.nextInt();
	inches = s.nextFloat();
	distance1.setFeetAndInches(feet,inches);
	distance1.displayFeetAndInches();
	
	Distance distance2 = new Distance();
	feet = s.nextInt();
	inches = s.nextFloat();
	distance2.setFeetAndInches(feet,inches);
	distance2.displayFeetAndInches();
	
	
	Distance distance3 ;	
	distance3=distance1.sumOfTwoDistanceVariables(distance2);	
	distance3.displayFeetAndInches();
	
	}
}