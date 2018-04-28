package com.expedia.json.parser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelInfo {
    @JsonProperty("hotelId")
    private String hotelId;
    @JsonProperty("hotelName")
    private String hotelName;
    @JsonProperty("localizedHotelName")
    private String localizedHotelName;
    @JsonProperty("hotelDestination")
    private String hotelDestination;
    @JsonProperty("hotelDestinationRegionID")
    private String hotelDestinationRegionID;
    @JsonProperty("hotelLongDestination")
    private String hotelLongDestination;
    @JsonProperty("hotelStreetAddress")
    private String hotelStreetAddress;
    @JsonProperty("hotelCity")
    private String hotelCity;
    @JsonProperty("hotelProvince")
    private String hotelProvince;
    @JsonProperty("hotelCountryCode")
    private String hotelCountryCode;
    @JsonProperty("hotelLatitude")
    private Double hotelLatitude;
    @JsonProperty("hotelLongitude")
    private Double hotelLongitude;
    @JsonProperty("hotelStarRating")
    private Double hotelStarRating;
    @JsonProperty("hotelGuestReviewRating")
    private Double hotelGuestReviewRating;
    @JsonProperty("hotelReviewTotal")
    private Double hotelReviewTotal;
    @JsonProperty("hotelImageUrl")
    private String hotelImageUrl;
    @JsonProperty("vipAccess")
    private boolean vipAccess;
    @JsonProperty("isOfficialRating")
    private boolean isOfficialRating;


    public String getHotelId() {
        return hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getLocalizedHotelName() {
        return localizedHotelName;
    }

    public String getHotelDestination() {
        return hotelDestination;
    }

    public String getHotelDestinationRegionID() {
        return hotelDestinationRegionID;
    }

    public String getHotelLongDestination() {
        return hotelLongDestination;
    }

    public String getHotelStreetAddress() {
        return hotelStreetAddress;
    }

    public String getHotelCity() {
        return hotelCity;
    }

    public String getHotelProvince() {
        return hotelProvince;
    }

    public String getHotelCountryCode() {
        return hotelCountryCode;
    }

    public Double getHotelLatitude() {
        return hotelLatitude;
    }

    public Double getHotelLongitude() {
        return hotelLongitude;
    }

    public Double getHotelStarRating() {
        return hotelStarRating;
    }

    public Double getHotelGuestReviewRating() {
        return hotelGuestReviewRating;
    }

    public Double getHotelReviewTotal() {
        return hotelReviewTotal;
    }

    public String getHotelImageUrl() {
        return hotelImageUrl;
    }

    public boolean isVipAccess() {
        return vipAccess;
    }

    public boolean isOfficialRating() {
        return isOfficialRating;
    }

    @Override
    public String toString() {
        return "HotelInfo{" + "hotelId='" + hotelId + '\'' + ", hotelName='" + hotelName + '\'' + ", localizedHotelName='" + localizedHotelName + '\'' + ", hotelDestination='" + hotelDestination + '\'' + ", hotelDestinationRegionID='" + hotelDestinationRegionID + '\'' + ", hotelLongDestination='" + hotelLongDestination + '\'' + ", hotelStreetAddress='" + hotelStreetAddress + '\'' + ", hotelCity='" + hotelCity + '\'' + ", hotelProvince='" + hotelProvince + '\'' + ", hotelCountryCode='" + hotelCountryCode + '\'' + ", hotelLatitude=" + hotelLatitude + ", hotelLongitude=" + hotelLongitude + ", hotelStarRating=" + hotelStarRating + ", hotelGuestReviewRating=" + hotelGuestReviewRating + ", hotelReviewTotal=" + hotelReviewTotal + ", hotelImageUrl='" + hotelImageUrl + '\'' + ", vipAccess=" + vipAccess + ", isOfficialRating=" + isOfficialRating + '}';
    }
}
