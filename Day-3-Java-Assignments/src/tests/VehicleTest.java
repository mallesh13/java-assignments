package tests;

import main.Vehicle;
import org.junit.Test;
import static org.junit.Assert.*;


public class VehicleTest{
	
	@Test
	public void testOwnerName(){
		Vehicle actualResult=new Vehicle("john",40,12.5);
		Vehicle expectedResult= new Vehicle("john",95,12.5);
		assertEquals(expectedResult.getOwnerName(),actualResult.getOwnerName());
		actualResult.toString();
	}
	@Test
	public void testVehicleOwnerNameIsNotNull(){
		Vehicle actualResult=new Vehicle("john",45,12.5);
		assertNotNull(actualResult.getOwnerName());
		actualResult.toString();
	}
	
	
	@Test
	public void testVehicleChangeSpeedChangedOrNot(){
		Vehicle actualResult=new Vehicle("john",95,12.5);
		actualResult.changeSpeed(25);
		assertEquals(70,actualResult.getCurrentSpeed());
		actualResult.toString();
	}	

	@Test
	public void testVehicleIsStoped(){
		Vehicle result= new Vehicle();
		result.stopVehicle();
		assertEquals(0,result.getCurrentSpeed());
		result.toString();
	}
	
	@Test
	public void testWhetherVehicleTurnedLeft(){
	
		Vehicle actualResult=new Vehicle("john doe",100,20);
		assertEquals("Vehicle Turn_left",actualResult.vehicleTurn(30));
	}
	@Test
	public void testWhetherVehicleNotTurnedLeft(){
	
		Vehicle actualResult=new Vehicle("john doe",110,20);
		assertNotEquals("Vehicle Turn_right",actualResult.vehicleTurn(30));
	}
	@Test
	public void testWhetherVehicleTurnedRight(){
		Vehicle actualResult=new Vehicle("john doe",103,90);
		assertEquals("Vehicle Turn_right",actualResult.vehicleTurn(30));
	}
	
	@Test
	public void testVehicleInConstantState(){
		Vehicle actualResult=new Vehicle("john doe",125,20);
		assertEquals("Constant",actualResult.vehicleTurn(0));
	}
	
	@Test
	public void testVehiclesHighestIdentificationNumber(){
		Vehicle vehicles[]=new Vehicle[3];
		vehicles[0]=new Vehicle("john doe",100,20);
		vehicles[1]=new Vehicle("john",95,12.5);
		vehicles[2]=new Vehicle("adam",60,50);
		Vehicle actualResult=new Vehicle();
		Vehicle expectedResult=new Vehicle();
		assertEquals(expectedResult.getHighestIdentificationNumber(),actualResult.getHighestIdentificationNumber());
		
	
	}
	
}







