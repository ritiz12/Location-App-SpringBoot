package com.example.Location_App.country.data;

import java.util.ArrayList;
import java.util.Collection;

public class GetCapitalResponse {
private Collection<CapitalSummary> capitals ;
public void addCapital(final CapitalSummary capital)
{
    if(capitals == null)
    {
        capitals = new ArrayList<>();
    }
    capitals.add(capital);
}
public Collection<CapitalSummary> getCapitals()
{
    return capitals;
}

}
