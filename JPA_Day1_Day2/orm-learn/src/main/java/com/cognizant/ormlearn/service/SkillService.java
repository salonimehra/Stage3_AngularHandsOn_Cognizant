package com.cognizant.ormlearn.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;

@Repository
@Service
public class SkillService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	@Transactional
	public ArrayList<Country> getAllCountries() {
		return (ArrayList<Country>) countryRepository.findAll();
	}
}
