package com.example.Location_App.country.persistence;

import com.example.Location_App.country.domian.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CountryRepository extends CrudRepository<Country,String> {
   // List<Country> findByCountryName(String countryName);
}
