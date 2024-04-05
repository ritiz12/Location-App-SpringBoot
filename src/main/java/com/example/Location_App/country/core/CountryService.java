package com.example.Location_App.country.core;

import com.example.Location_App.country.data.*;
import com.example.Location_App.country.domian.Country;
import com.example.Location_App.country.persistence.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public GetCountryResponse getCountries(final GetCountryRequest getCountryRequest) {
        final var response = new GetCountryResponse();
        for(final var country : countryRepository.findAll())
        {
            response.addCountry(new CountrySummary(country.getCountryName() , country.getCountryCode()));
        }
        return response;
    }



    public GetCapitalResponse getCountriesCapital(GetCapitalRequest getCapitalRequest) {
        final var response = new GetCapitalResponse();
        for(final var capital : countryRepository.findAll())
        {
            response.addCapital(new CapitalSummary
                    (capital.getCountryCapital() ));
        }
        return response;
    }
}
