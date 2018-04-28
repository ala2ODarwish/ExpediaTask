package com.expedia.json.parser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelOfferParser {

    @JsonProperty("offerInfo")
    private OfferInfo offerInfo;
    @JsonProperty("userInfo")
    private UserInfo userInfo;
    @JsonProperty("offers")
    private Offers offers;

    public OfferInfo getOfferInfo() {
        return offerInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public Offers getOffers() {
        return offers;
    }

    @Override
    public String toString() {
        return "HotelOfferParser{" + "offerInfo=" + offerInfo + ", userInfo=" + userInfo + ", offers=" + offers + '}';
    }


}
