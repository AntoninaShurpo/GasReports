package com.antonina.gasreports.models;

import java.util.Set;

public class City {
    private String name;
    private Set<GasStation> gasStationCollection;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGasStationCollection(Set<GasStation> gasStationCollection) {
        this.gasStationCollection = gasStationCollection;
    }

    public Set<GasStation> getGasStationCollection() {
        return gasStationCollection;
    }
}
