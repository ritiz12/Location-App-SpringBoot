package com.example.Location_App.country.data;

import java.util.ArrayList;
import java.util.Collection;

public class GetCountryResponse {
    private Collection<CountrySummary> countries;
    public void addCountry(final CountrySummary country)
    {
        if(countries == null)
        {
            countries = new ArrayList<>();
        }
        countries.add(country);
    }

    public Collection<CountrySummary> getCountries() {
        return countries;
    }
}
