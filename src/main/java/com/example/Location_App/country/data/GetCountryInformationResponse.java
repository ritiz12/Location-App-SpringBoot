package com.example.Location_App.country.data;

import java.util.ArrayList;
import java.util.Collection;

public class GetCountryInformationResponse {
    private Collection<CountryInformationSummary> countryInformation;
    public void addCountryInformation(final CountryInformationSummary information)
    {
        if(countryInformation == null)
        {
            countryInformation = new ArrayList<>();
        }
        countryInformation.add(information);
    }

   public Collection<CountryInformationSummary> getCountryInformation()
    {
        return countryInformation;
    }
}
