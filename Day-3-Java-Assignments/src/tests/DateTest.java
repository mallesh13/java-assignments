package tests;
import org.junit.Test;
import main.Date;
import static org.junit.Assert.*;
public class DateTest
{
	@Test
	public void dateTestToPrintAsString()
	{	
		Date date=new Date(19,9,1997);
		assertEquals("19/9/1997",date.toString());
	}
	@Test
	public void dateTestToPrintAsNotString()
	{	
		Date date=new Date(19,10,1997);
		assertEquals("19/10/1997",date.toString());
	}
	@Test
	public void dateTestToCheckItIsSmaller()
	{
		Date date1=new Date(19,10,1997);
		Date date2=new Date(15,8,1996);
		assertTrue(date1.isSmaller(date2));
	}
	@Test
	public void dateTestToCheckItIsNotSmaller()
	{
		Date date1=new Date(19,10,1995);
		Date date2=new Date(9,10,1996);
		assertFalse(date1.isSmaller(date2));
	}
	@Test
	public void dateTestToCheckDateDiff()
	{
		Date date1=new Date(19,9,1996);
		Date date2=new Date(15,8,1996);
		assertEquals(35,date1.dayDiff(date2));
	}
	   @Test
	public void testCheckDateDiffCheckForDay()
	{
		Date date1=new Date(19,8,1996);
		Date date2=new Date(19,9,1996);
		int array[] = {31,1,0};
		int arr[] = date1.diff(date2);
		assertEquals(array[0],arr[0]);
	}


	@Test
	public void testCheckDateDiffCheckForMonth()
	{
		Date date1=new Date(19,8,1996);
		Date date2=new Date(19,9,1996);
		int array[] = {30,1,0};
		int arr[] = date1.diff(date2);
		assertEquals(array[1],arr[1]);
	}

	@Test
	public void testCheckDateDiffCheckForYear()
	{
		Date date1=new Date(19,8,1996);
		Date date2=new Date(19,9,1996);
		int array[] = {31,1,0};
		int arr[] = date1.diff(date2);
		assertEquals(array[2],arr[2]);
	}



}