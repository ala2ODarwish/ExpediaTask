package com.expedia.json.parser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Hotel {
    @JsonProperty("offerDateRange")
    private OfferDateRange offerDateRange;
    @JsonProperty("destination")
    private Destination destination;
    @JsonProperty("hotelInfo")
    private HotelInfo hotelInfo;
    @JsonProperty("hotelPricingInfo")
    private HotelPricingInfo hotelPricingInfo;
    @JsonProperty("hotelUrls")
    private HotelURLS hotelUrls;

    public OfferDateRange getOfferDateRange() {
        return offerDateRange;
    }

    public Destination getDestination() {
        return destination;
    }

    public HotelInfo getHotelInfo() {
        return hotelInfo;
    }

    public HotelPricingInfo getHotelPricingInfo() {
        return hotelPricingInfo;
    }

    public HotelURLS getHotelUrls() {
        return hotelUrls;
    }

    @Override
    public String toString() {
        return "Hotel{" + "offerDateRange=" + offerDateRange + ", destination=" + destination + ", hotelInfo=" + hotelInfo + ", hotelPricingInfo=" + hotelPricingInfo + ", hotelUrls=" + hotelUrls + '}';
    }
}
