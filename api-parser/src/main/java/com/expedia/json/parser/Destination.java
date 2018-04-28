package com.expedia.json.parser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Destination {
    //Map API objects to Destination parser objects
    @JsonProperty("regionID")
    private String regionID;
    @JsonProperty("associatedMultiCityRegionId")
    private String associatedMultiCityRegionId;
    @JsonProperty("longName")
    private String longName;
    @JsonProperty("shortName")
    private String shortName;
    @JsonProperty("country")
    private String country;
    @JsonProperty("province")
    private String province;
    @JsonProperty("city")
    private String city;
    @JsonProperty("tla")
    private String tla;
    @JsonProperty("nonLocalizedCity")
    private String nonLocalizedCity;

//No need for setters
    public String getRegionID() {return regionID;}

    public String getAssociatedMultiCityRegionId() {
        return associatedMultiCityRegionId;
    }

    public String getLongName() {
        return longName;
    }

    public String getShortName() {
        return shortName;
    }

    public String getCountry() {
        return country;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getTla() {
        return tla;
    }

    public String getNonLocalizedCity() {
        return nonLocalizedCity;
    }

    @Override
    public String toString() {
        return "Destination{" + "regionID='" + getRegionID() + '\'' + ", associatedMultiCityRegionId='" + getAssociatedMultiCityRegionId() + '\'' + ", longName='" + getLongName() + '\'' + ", shortName='" + getShortName() + '\'' + ", country='" + getCountry() + '\'' + ", province='" + getProvince() + '\'' + ", city='" + getCity() + '\'' + ", tla='" + getTla() + '\'' + ", nonLocalizedCity='" + getNonLocalizedCity() + '\'' + '}';
    }

}
