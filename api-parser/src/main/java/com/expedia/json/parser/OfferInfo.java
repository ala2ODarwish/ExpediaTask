package com.expedia.json.parser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OfferInfo {
    @JsonProperty("siteID")
    private Long siteID;
    @JsonProperty("language")
    private String language;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("userSelectedCurrency")
    private String userSelectedCurrency;

    public Long getSiteID() {
        return siteID;
    }

    public String getLanguage() {
        return language;
    }

    public String getCurrency() {
        return currency;
    }

    public String getUserSelectedCurrency() {
        return userSelectedCurrency;
    }

    @Override
    public String toString() {
        return "OfferInfo{" + "siteID=" + siteID + ", language='" + language + '\'' + ", currency='" + currency + '\'' + ", userSelectedCurrency='" + userSelectedCurrency + '\'' + '}';
    }

}
