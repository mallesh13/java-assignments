public class Distance{
	
	private int feet;
	private float inches;
	
	public void setFeetAndInches(int feet,float inches){
		this.feet=feet;
		this.inches=inches;
	}
	
	public void displayFeetAndInches(){
		System.out.println("distance in feet "+ feet+","+inches+ " inches");
	}	
	public Distance sumOfTwoDistanceVariables(Distance number){
		
		Distance distance3= new Distance();	
		distance3.inches=(this.inches+number.inches);
		distance3.feet = 0;
		if(distance3.inches>=12){
			distance3.inches =distance3.inches-12;
			distance3.feet++;
		}
		distance3.feet = distance3.feet+this.feet+number.feet;
		return distance3; 
		
		
	}
	
}