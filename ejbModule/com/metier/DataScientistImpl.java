package com.metier;

import javax.sound.midi.Soundbank;

import com.dao.IDataScientist;
import com.entities.DataScientist;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class DataScientistImpl implements IDataScientist {
	
	@PersistenceContext(unitName = "UP_CO2DATA" )
	private EntityManager em ; 

	@Override
	public boolean login(String username, String password) {
		
		try {
			Query query = em.createQuery("Select ds From DataScientist ds WHERE ds.username = :username OR ds.password = :password",DataScientist.class) ; 
			query.setParameter("username",username) ; 
			query.setParameter("password", password) ; 
				System.out.println(query.getSingleResult());;
				return true ; 
			
		}catch(Exception e) {
			System.out.println(e);
			return false ; 
		}
		
		
	}

}
