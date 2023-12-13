package com.dao;

import com.entities.Co2Emission;
import com.entities.DataScientist;

import java.util.List ; 

public interface ICo2Emissions {
	
	public void addCo2Emisson(Co2Emission co2Emission) ; 
	public List<Co2Emission> getCo2Emissions() ; 
	public List<Co2Emission> getApprouvedData() ; 
	public List<Co2Emission> getCo2EmissionsPerDs(DataScientist ds) ; 
	public List<Co2Emission> getCo2EmissionsByCountry(String country) ; 
	public List<String> getAllCountries() ; 
	public Co2Emission getOne(Long id) ; 
	public void approuveCo2Emission(Long id) ;
	public void disApprouveCo2Emission(Long id) ;
	

}
