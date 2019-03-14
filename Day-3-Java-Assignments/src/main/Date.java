package main; 
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Date

{
	private int day;
	private int month;
	private int year;
	public Date()
	{
	}
	public Date(int day,int month,int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void setDay(int day) 
	{
		this.day = day;
	}
	public int getDay()
	{
		return day;
	}

	public void setMonth(int month) 
	{
		this.month = month;
	}
	public int getMonth() 
	{
		return month;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	public int getYear() 
	{
		return year;
	}
        public String toString()
	{
		return (day + "/" + month + "/" + year);
	}
	public boolean isSmaller(Date date)
	{
		if(date.year < this.year)
			{
				return true;
                        }
		else if(date.year < this.year && date.month < this.month)
			{
				return true;
                        }
		else if(date.year < this.year && date.month < this.month &&date.day < this.day)
			{
				return true;
                        }
		else
		{
      			return false;
		}
		    
	}
	public long dayDiff(Date date)
	{
		LocalDate dateBefore = LocalDate.of(date.year,date.month,date.day);
		LocalDate dateAfter = LocalDate.of(this.year,this.month,this.day);
		long noOfDays = ChronoUnit.DAYS.between(dateBefore,dateAfter);
		return noOfDays;
	}
	public int[] diff(Date date)
	{
		int arr[] = new int[3];
		int dayDiff = 0;
		int monthDiff = 0;
		int yearDiff = 0;
		if(isSmaller(date))
		{
			yearDiff = this.year - date.year;
			monthDiff = (yearDiff - 1) * 12 + (12-this.month) + (date.month);
			dayDiff = (int) this.dayDiff(date);	
		}
		else
		{
			yearDiff = date.year - this.year;
			monthDiff = (yearDiff - 1) * 12 + (12-this.month) + (date.month);
			dayDiff = (int) date.dayDiff(this);
		}
                arr[0] = dayDiff;
		arr[1] = monthDiff;
		arr[2] = yearDiff;
		return arr;
	}

}















