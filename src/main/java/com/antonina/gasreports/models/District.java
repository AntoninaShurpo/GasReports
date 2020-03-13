package com.antonina.gasreports.models;

import java.util.Set;

public class District {
    private String name;
    private Set<City> citySet;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCitySet(Set<City> citySet) {
        this.citySet = citySet;
    }

    public Set<City> getCitySet() {
        return citySet;
    }
}
