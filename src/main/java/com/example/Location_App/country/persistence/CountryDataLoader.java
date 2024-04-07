package com.example.Location_App.country.persistence;

import com.example.Location_App.country.domian.Country;
import com.example.Location_App.country.persistence.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

@Repository
public class CountryDataLoader implements CommandLineRunner {

    @Autowired
    private  CountryRepository countryRepository;

        @Override
        public void run(String... args) throws Exception {
            // Define some sample data
            Country country1 = new Country("India", "1", "IN", "80000000", "Delhi");
            Country country2 = new Country("Pakistan", "2", "PK", "20000000", "Lahore");
            Country country3 = new Country("Canada", "3", "CN", "50000000", "Ottawa");
            Country country4 = new Country("Iran", "4", "IR", "50900000", "Tehran");
            Country country5 = new Country("China", "5", "CH", "80000000", "Bhijjin");



            countryRepository.save(country1);
            countryRepository.save(country2);
            countryRepository.save(country3);
            countryRepository.save(country4);
            countryRepository.save(country5);



    }
}

