package com.example.Location_App.country.data;

public class GetCountryRequest {
    private final String countryName ;
    private final String countryCode;

    public GetCountryRequest(String countryName, String countryCode) {
        this.countryName = countryName;
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }
}
