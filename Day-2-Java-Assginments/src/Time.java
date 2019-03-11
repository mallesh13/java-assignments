public class Time{
	
	private int hours;
	private int minutes;
	
	public void setTime(int hours,int minutes){
		this.hours=hours;
		this.minutes=minutes;
	}
	
	public void displayTime(){
		System.out.println("Time = "+ hours+":"+minutes);
	}
	
	public Time sumOfTwoTimes(Time time){
		
		Time Time3= new Time();	
		Time3.minutes=this.minutes+time.minutes;
		Time3.hours = 0;
		if(Time3.minutes >= 60){
			Time3.minutes = Time3.minutes - 60;
			Time3.hours++;
		}
		Time3.hours += this.hours+time.hours;
		return Time3; 
		
		
	}
	
}