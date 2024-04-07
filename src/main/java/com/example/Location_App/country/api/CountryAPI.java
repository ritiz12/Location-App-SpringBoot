package com.example.Location_App.country.api;

import com.example.Location_App.country.core.CountryService;
import com.example.Location_App.country.data.*;
import com.example.Location_App.country.domian.Country;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/country")
@RestController
public class CountryAPI {

    @Autowired
    private CountryService countryService;

    @GetMapping()
    public ResponseEntity<GetCountryResponse> getCountries(final String countryName , final String countryCode)
    {
        return ResponseEntity.ok(countryService.getCountries(new GetCountryRequest(countryName , countryCode)));
    }

    @GetMapping("/capital")
    public ResponseEntity<GetCapitalResponse> getCountriesCapital(final String countryCapital  )
    {
        return ResponseEntity.ok(countryService.getCountriesCapital(new GetCapitalRequest(countryCapital)));
    }

    //@GetMapping("/countryName/{countryName}")
    @GetMapping("/countryName/{countryName}")
    public ResponseEntity<GetCountryInformationResponse> getCountryInformation(@PathVariable String countryName)
    {
        GetCountryInformationResponse response = countryService.getCountryInformation(countryName);
        return ResponseEntity.ok(response);
    }



}
