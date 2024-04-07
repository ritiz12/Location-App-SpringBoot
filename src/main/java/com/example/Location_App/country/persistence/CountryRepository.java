package com.example.Location_App.country.persistence;

import com.example.Location_App.country.data.CountryInformationSummary;
import com.example.Location_App.country.data.GetCountryInformationResponse;
import com.example.Location_App.country.domian.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CountryRepository extends CrudRepository<Country,String> {
    Iterable<CountryInformationSummary> findByCountryName(String countryName);



}
