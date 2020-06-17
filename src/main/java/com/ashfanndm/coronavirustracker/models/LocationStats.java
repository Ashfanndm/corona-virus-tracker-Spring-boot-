package com.ashfanndm.coronavirustracker.models;

public class LocationStats {
    private String state;
    private String country;
    private int latestTotalCases;
    private int difFromPrevDay;

    public int getDifFromPrevDay() {
        return difFromPrevDay;
    }

    public void setDifFromPrevDay(int difFromPrevDay) {
        this.difFromPrevDay = difFromPrevDay;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
