package com.example.Location_App.country.data;

public class CountryInformationSummary {
    private String countryName;
    private String countryId;
    private String countryCode;
    private String countryPopulation;
    private String countryCapital;

    public CountryInformationSummary(String countryName, String countryId, String countryCode, String countryPopulation, String countryCapital) {
        this.countryName = countryName;
        this.countryId = countryId;
        this.countryCode = countryCode;
        this.countryPopulation = countryPopulation;
        this.countryCapital = countryCapital;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryId() {
        return countryId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryPopulation() {
        return countryPopulation;
    }

    public String getCountryCapital() {
        return countryCapital;
    }
}
