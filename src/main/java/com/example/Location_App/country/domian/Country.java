package com.example.Location_App.country.domian;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
    @Column(length = 100 , name = "countryName" , nullable = false,updatable = false)
    private String countryName ;

    @Id
    @Column(length = 100 , name = "countryId" , nullable = false,updatable = false)
    private String countryId ;

    @Column(length = 100 , name = "countryCode" , nullable = false,updatable = false)
    private String countryCode ;

    @Column(length = 100 , name = "countryPopulation" , nullable = false,updatable = false)
    private String countryPopulation ;

    @Column(length = 100 , name = "countryCapital" , nullable = false,updatable = false)
    private String countryCapital ;

    Country()
    {
        super();
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

    public Country(String countryName, String countryId, String countryCode, String countryPopulation, String countryCapital) {
        this.countryName = countryName;
        this.countryId = countryId;
        this.countryCode = countryCode;
        this.countryPopulation = countryPopulation;
        this.countryCapital = countryCapital;
    }

}
