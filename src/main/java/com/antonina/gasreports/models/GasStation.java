package com.antonina.gasreports.models;

import java.util.Set;

public class GasStation {
    private String name;
    private int zipCode;
    private String address;
    private Set<Gas> gasCollection;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setGasCollection(Set<Gas> gasCollection) {
        this.gasCollection = gasCollection;
    }

    public Set<Gas> getGasCollection() {
        return gasCollection;
    }


}
