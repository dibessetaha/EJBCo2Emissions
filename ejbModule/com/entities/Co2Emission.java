package com.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="co2_emissions")
public class Co2Emission implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ; 
	private String year ; 
	private String country ;
	private double co2EmissionKt ; 
	private boolean approuved ; 
	
	@ManyToOne
	private DataScientist dataScientist ; 
	
	public Co2Emission(String year, String country, double co2data , boolean approuved) {
		this.year = year;
		this.country = country;
		this.approuved = approuved ; 
		this.co2EmissionKt = co2data ; 
	}
	
	public Co2Emission() {}
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isApprouved() {
		return approuved;
	}

	public void setApprouved(boolean approuved) {
		this.approuved = approuved;
	} 
	
	
	public DataScientist getDataScientist() {
		return dataScientist;
	}

	public double getCo2EmissionKt() {
		return co2EmissionKt;
	}

	public void setCo2EmissionKt(double co2EmissionKt) {
		this.co2EmissionKt = co2EmissionKt;
	}
	


}
