package com.expedia.json.parser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelURLS {
    @JsonProperty("hotelInfositeUrl")
    private String hotelInfositeUrl;
    @JsonProperty("hotelSearchResultUrl")
    private String hotelSearchResultUrl;


    public String getHotelInfositeUrl() {
        return hotelInfositeUrl;
    }

    public String getHotelSearchResultUrl() {
        return hotelSearchResultUrl;
    }

    @Override
    public String toString() {
        return "HotelURLS{" + "hotelInfositeUrl='" + hotelInfositeUrl + '\'' + ", hotelSearchResultUrl='" + hotelSearchResultUrl + '\'' + '}';
    }
}
