package com.example.Location_App.country.data;

public class GetCapitalRequest {
    private final String countryCapital;

    public GetCapitalRequest(String countryCapital) {
        this.countryCapital = countryCapital;
    }

    public String getCountryCapital() {
        return countryCapital;
    }
}
