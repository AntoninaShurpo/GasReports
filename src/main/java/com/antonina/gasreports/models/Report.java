package com.antonina.gasreports.models;

import java.util.ArrayList;
import java.util.List;

public class Report{
    private String date;
    private List<GasStation> gasStationCollection;

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setGasStationCollection(List<GasStation> gasStationCollection) {
        this.gasStationCollection = gasStationCollection;
    }

    public List<GasStation> getGasStationCollection() {
        return gasStationCollection;
    }

}
