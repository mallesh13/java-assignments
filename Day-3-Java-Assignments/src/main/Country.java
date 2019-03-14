package main;

public class Country{
	
	private String countryName;
	private long population;
	private long area;
	
	public Country(String countryName, long population , long area){
		this.countryName=countryName;
		this.population=population;
		this.area=area;
	}
	
	public Country(){
	}
		
	public void setCountryName(String countryName){
		this.countryName=countryName;
	}
	public String getCountryName(){
		return countryName;
	}

	public void setPopulation(long population){
		this.population=population;
	}
	public long getPopulation(){
		return population;
	}
	
	public void setArea(long area){
		this.area=area;
	}
	public long getArea(){
		return area;
	}
	
	public Country toFindCountryWithLargestArea(Country []country){
	
		int index=0;
		long maxArea=country[0].area;
		for(int i=1;i<country.length;++i){
		
			if(maxArea < country[i].area){
				maxArea=country[i].area;
				index=i;
			}
		}
		return country[index];
	
	}

	public Country toFindCountryWithLargestPopulation(Country country[]){
		int index=0;
		long maxPopulation =country[0].population;
		for(int i=1;i<country.length;++i){
		
			if( maxPopulation < country[i].population){
				maxPopulation = country[i].population;
				index=i;
			}
		}
		return country[index];
	}
	
	public Country toFindCountryWithLargestPopulationDensity(Country country[]){
	
		int index=0;
		double populationDensity = country[0].population/country[0].area;
		for(int i=1;i<country.length;++i){
			double density=country[i].population/country[i].area;
			if(populationDensity < density){
				populationDensity = density;
				index=i;
			}	
		}
		return country[index];

	}	


}	
	
	
	
	
	
	

	
		
	
	