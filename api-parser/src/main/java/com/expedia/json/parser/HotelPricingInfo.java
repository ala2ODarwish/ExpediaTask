package com.expedia.json.parser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelPricingInfo {
    @JsonProperty("drr")
    private Boolean drr;
    @JsonProperty("percentSavings")
    private Double percentSavings;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("originalPricePerNight")
    private Double originalPricePerNight;
    @JsonProperty("crossOutPriceValue")
    private Double crossOutPriceValue;
    @JsonProperty("totalPriceValue")
    private Double totalPriceValue;
    @JsonProperty("averagePriceValue")
    private Double averagePriceValue;

    public Boolean getDrr() {
        return drr;
    }

    public Double getPercentSavings() {
        return percentSavings;
    }

    public String getCurrency() {
        return currency;
    }

    public Double getOriginalPricePerNight() {
        return originalPricePerNight;
    }

    public Double getCrossOutPriceValue() {
        return crossOutPriceValue;
    }

    public Double getTotalPriceValue() {
        return totalPriceValue;
    }

    public Double getAveragePriceValue() {
        return averagePriceValue;
    }

    @Override
    public String toString() {
        return "HotelPricingInfo{" + "drr=" + drr + ", percentSavings=" + percentSavings + ", currency='" + currency + '\'' + ", originalPricePerNight=" + originalPricePerNight + ", crossOutPriceValue=" + crossOutPriceValue + ", totalPriceValue=" + totalPriceValue + ", averagePriceValue=" + averagePriceValue + '}';
    }
}
