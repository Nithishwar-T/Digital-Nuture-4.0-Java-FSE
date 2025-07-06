package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

	@Autowired
	private CountryService countryService;

	public static void main(String[] args) {
		SpringApplication.run(OrmLearnApplication.class, args);
	}

	@Override
	public void run(String... args) {
		LOGGER.info("Getting all countries:");
		countryService.getAllCountries().forEach(c -> LOGGER.info(c.getCode() + " - " + c.getName()));

		LOGGER.info("Getting country by code: IN");
		Country c = countryService.findCountryByCode("IN");
		LOGGER.info("Found: " + c.getCode() + " - " + c.getName());

		LOGGER.info("Adding new country: JP - Japan");
		Country newC = new Country();
		newC.setCode("JP");
		newC.setName("Japan");
		countryService.addCountry(newC);
	}
}
