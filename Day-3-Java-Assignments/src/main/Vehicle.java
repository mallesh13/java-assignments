package main;

public class Vehicle{
	
	private int currentSpeed;
	private double currentDirectionInDegrees;
	private String ownerName;
	private long identificationNumber;
	private static long highestIdentificationNumber=201200;

	public Vehicle(){
	}
	
	public Vehicle(String ownerName, int currentSpeed, double currentDirectionInDegrees){
		this.ownerName=ownerName;
		this.currentSpeed=currentSpeed;
		this.currentDirectionInDegrees =currentDirectionInDegrees; 
		this.identificationNumber=++highestIdentificationNumber;
	
	}
	
	public void setOwnerName(String ownerName){
		this.ownerName=ownerName;
	}
	public String getOwnerName(){
		return ownerName;
	}

	public void setCurrentSpeed(int currentSpeed){
		this.currentSpeed=currentSpeed;
	}
	public int getCurrentSpeed(){
		return currentSpeed;
	}
	
	public void setCurrentDirectionInDegrees(double currentDirectionInDegrees){
		this.currentDirectionInDegrees=currentDirectionInDegrees;
	}
	public double getCurrentDirectionInDegrees(){
		return currentDirectionInDegrees;
	}
	
	public void setIdentificationNumber(long identificationNumber){
		this.identificationNumber=identificationNumber;
	}
	public long getIdentificationNumber(){
		return identificationNumber;
	}
	
	public static long getHighestIdentificationNumber(){
		return highestIdentificationNumber;
	}
	
		
	public int changeSpeed(int speed){
		if(currentSpeed > speed){
			currentSpeed = currentSpeed-speed;
			return currentSpeed;
		}
		else
			return currentSpeed;
	}
	
	public int stopVehicle(){
	 	if(currentSpeed>0)
			currentSpeed = 0;
			
		return currentSpeed;
	}
	
	public String vehicleTurn(double degreesTurn){
		
		double newCurrentDirection;
		String direction ;
		newCurrentDirection = currentDirectionInDegrees + degreesTurn;
		if(newCurrentDirection < 90  && degreesTurn > 0)
			direction= "Vehicle Turn_left";
		else if(newCurrentDirection>90 && degreesTurn >0)
			direction= "Vehicle Turn_right";
		else		
			direction= "Constant";
		
		return direction;	
	}	
	
	
	public String toString(){
	
		System.out.println( "ownerName = "+getOwnerName()+"\nidentificationNumber = "+getIdentificationNumber()+"\ncurrentSpeed = "+getCurrentSpeed()+"\ncurrentDirectionInDegrees = "+getCurrentDirectionInDegrees()+"\nhighestIdentificationNumber=" +getHighestIdentificationNumber()+"\n\n");
		return "";
	}
	
}