package tests;
 
import org.junit.Test;
import static org.junit.Assert.*;
import main.Country;
import org.junit.Before;

public class CountryTest{
	
	Country country[];
	
	@Before
	public void setUp(){
			
		country=new Country[5];
		country[0]=new Country("India",1222000,987456);	
		country[1]=new Country("Canada",2562341,74560);	
		country[2]=new Country("Australia",2220009,456023);	
		country[3]=new Country("Japan",3332210,452152);	
		country[4]=new Country("UK",1024523,985201);
	}
	
	@Test
	public void testCountryWithLargestArea(){
		
		Country actualResult=new Country().toFindCountryWithLargestArea(country);
		Country expectedResult=new Country("India",1222000,987456);
		assertEquals(expectedResult.getCountryName(),actualResult.getCountryName());
		assertEquals(expectedResult.getPopulation(), actualResult.getPopulation());
		assertEquals(expectedResult.getArea(),actualResult.getArea());
	
	}
	
	@Test
	public void testCountryWithoutLargestArea(){
		
		Country actualResult=new Country().toFindCountryWithLargestArea(country);
		Country expectedResult=new Country("UK",1024523,985201);
		assertNotEquals(expectedResult.getCountryName(),actualResult.getCountryName());
		assertNotEquals(expectedResult.getPopulation(), actualResult.getPopulation());
		assertNotEquals(expectedResult.getArea(),actualResult.getArea());
	
	}
	
	@Test
	public void testCountryWithLargestPopulation(){
		
		Country actualResult=new Country().toFindCountryWithLargestPopulation(country);
		Country expectedResult=new Country("Japan",3332210,452152);
		assertEquals(expectedResult.getCountryName(),actualResult.getCountryName());
		assertEquals(expectedResult.getPopulation(), actualResult.getPopulation());
		assertEquals(expectedResult.getArea(),actualResult.getArea());
	}

	@Test
	public void testCountryWithLargestPopulationDensity(){
		
		Country actualResult=new Country().toFindCountryWithLargestPopulationDensity(country);
		Country expectedResult=new Country("Canada",2562341,74560);
		assertEquals(expectedResult.getCountryName(),actualResult.getCountryName());
		assertEquals(expectedResult.getPopulation(), actualResult.getPopulation());
		assertEquals(expectedResult.getArea(),actualResult.getArea());
	}


}	