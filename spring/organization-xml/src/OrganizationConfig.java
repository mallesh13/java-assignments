package com.capgemini.spring.organization.config;


import org.springframework.context.annotation.*;
import com.capgemini.spring.organization.*;
import java.io.*;
import java.util.*;

@Configaration
class OrganizationConfig{
	
	public List<String> getDirectors(){
		List<String> list=new ArrayList<>();
		list.add("director1");
		list.add("director2");
		list.add("director3");
		list.add("director4");
		
		return list;
	}
	public Set<String> getBranches() {
		Set<String> set = new HashSet<>();
		set.add("branch1");
		set.add("branch2");
		set.add("branch3");
		set.add("branch4");

		return set;
	}
	public Map<String, String> getBranchWiseHead() {
		
		Map<String,String> map = new HashMap<>();
		map.put("branch1","director1");	
		map.put("branch2","director2");	
		map.put("branch3","director3");	
		map.put("branch4","director4");	

		return map;
	}

	public Properties getIpAddresses() {
	
		Properties ipAddresses = new Properties();
		FileReader file =null;
		try{
			file= new FileReader("ip.properties");
			ipAddresses.load(file);
		}
		catch(Exception e){
			e.printStackTrace();
		}	
		return ipAddresses;
	}

	public Properties getDatabaseDetails() {
		Properties databaseDetails = new Properties();
		FileReader file =null;
		try{
			file= new FileReader("ip.properties");
			databaseDetails.load(file);
		}
		catch(Exception e){
			e.printStackTrace();
		}	
		return databaseDetails;
	}


	@Bean
	public Organization organization(){
		Organization organization= new Organization();
		organization.setOrgId(10010);
		organization.setOrgName("All India pvt.");
		organization.setMarketPrice(250000);
		organization.setAddress(getAddress());
		organization.setDirectors(getDirectors());
		organization.setBranches( getBranches());
		organization.setBranchWiseHead(getBranchWiseHead());
		organization.setIpAddresses(getIpAddresses()) ;
		organization.setDatabaseDetails(getDatabaseDetails());

		
	}


}