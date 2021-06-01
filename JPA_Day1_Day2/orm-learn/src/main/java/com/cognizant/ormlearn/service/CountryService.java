package com.cognizant.ormlearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.ormlearn.service.Exception.CountryNotFoundException;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.cognizant.ormlearn.model.Country;

@Service
public class CountryService {
	
	@Autowired
	CountryRepository countryRepository;
	
	@Transactional
	public List<Country> getAllCountries(){
		return countryRepository.findAll();
	}
	
	@Transactional
	public Country findCountryByCode(String countryCode) throws CountryNotFoundException {
		Optional<Country> result = countryRepository.findById(countryCode);
		if (!result.isPresent())
			throw new CountryNotFoundException();
		Country country = result.get();
		return country;
	}
	@Transactional
	public void addCountry(Country country) {
		countryRepository.save(country);
	}
	@Transactional
	public void updateCountry(String code) throws CountryNotFoundException {
		Country country=findCountryByCode(code);
		country.setName("Hindustan");
		countryRepository.save(country);
	}
	@Transactional
	public void deleteCountry(String code) {
		countryRepository.deleteById(code);
	}
}
