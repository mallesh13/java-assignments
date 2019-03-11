import java.util.*;

public class TimeTest{
	
	static public void main(String arg[]){
		
	int hours;
	int minutes;
	Scanner s = new Scanner(System.in);
	Time Time1 = new Time();
	hours = s.nextInt();
	minutes = s.nextInt();
	Time1.setTime(hours,minutes);
	Time1.displayTime();
	
	Time Time2 = new Time();
	hours = s.nextInt();
	minutes = s.nextInt();
	Time2.setTime(hours,minutes);
	Time2.displayTime();
	
	
	Time Time3 ;	
	Time3=Time1.sumOfTwoTimes(Time2);	
	Time3.displayTime();
	
	}
}