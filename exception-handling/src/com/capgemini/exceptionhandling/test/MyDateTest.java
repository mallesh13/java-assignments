package com.capgemini.exceptionhandling.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.capgemini.exceptionhandling.exceptions.InvalidDayException;
import com.capgemini.exceptionhandling.exceptions.InvalidMonthException;
import com.capgemini.exceptionhandling.model.MyDate;

public class MyDateTest {

	@Test
	public void testtoCheckObjectIsUsingDefaultConstructor() {
		MyDate date = new MyDate();
		assertNotNull(date);
	}
	
	@Test
	public void testToCheckDayIsValid() throws InvalidDayException, InvalidMonthException {
		MyDate date =new MyDate(22,11,1997);
	}
	
	@Test(expected=InvalidDayException.class)
	public void testToCheckDayIsNotValid() throws InvalidDayException, InvalidMonthException {
		MyDate date =new MyDate(35,12,1997);
	}
	
	@Test
	public void testToCheckMonthIsValid() throws InvalidDayException, InvalidMonthException {
		MyDate date =new MyDate(22,11,1997);
	}
	
	@Test(expected=InvalidMonthException.class)
	public void testToCheckMonthIsNotValid() throws InvalidDayException, InvalidMonthException {
		MyDate date =new MyDate(25,18,1997);
	}
}

	


