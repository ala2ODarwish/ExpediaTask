package com.expedia.json.parser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Offers {
    @JsonProperty("Hotel")
    private List<Hotel> hotel;

    public List<Hotel> getHotel() {
        return hotel;
    }

    @Override
    public String toString() {
        return "Offers{" + "hotel=" + hotel + '}';
    }

}
