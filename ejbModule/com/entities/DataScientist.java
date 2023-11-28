package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "scientists")
public class DataScientist implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ; 
	
	private String username ; 
	
	private String password ; 
	
	
	
	public DataScientist(String username, String password, List<Co2Emission> co2Emissions) {
		super();
		this.username = username;
		this.password = password;
		this.co2Emissions = co2Emissions;
	}

	@OneToMany(mappedBy = "dataScientist")
    private List<Co2Emission> co2Emissions = new ArrayList<>();

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
