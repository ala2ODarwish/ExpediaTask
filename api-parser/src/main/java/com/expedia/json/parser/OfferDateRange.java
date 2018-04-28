package com.expedia.json.parser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OfferDateRange {

    SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
    Calendar calendar = Calendar.getInstance();

    @JsonProperty("travelStartDate")
    private List<Integer> travelStartDate;
    @JsonProperty("travelEndDate")
    private List<Integer> travelEndDate;
    @JsonProperty("lengthOfStay")
    private int lengthOfStay;

    public String getTravelStartDate() {
        return getDate(travelStartDate);
    }

    public String getTravelEndDate() {
        return getDate(travelEndDate);
    }

    public int getLengthOfStay() {
        return lengthOfStay;
    }

    @Override
    public String toString() {
        return "OfferDateRange{" + "travelStartDate=" + getTravelStartDate() + ", travelEndDate=" + getTravelEndDate() + ", lengthOfStay=" + lengthOfStay + '}';
    }

    private String getDate(List<Integer> travelDate) {
        calendar.set(Calendar.YEAR, travelDate.get(0));
        calendar.set(Calendar.MONTH,travelDate.get(1));
        calendar.set(Calendar.DAY_OF_MONTH,travelDate.get(2));
        return sdf.format(calendar.getTime());
    }


}
