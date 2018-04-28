package com.expedia.connection.impl;

import com.expedia.connection.exception.InvalidDataSourceException;
import com.expedia.json.parser.HotelOfferParser;
import org.springframework.web.client.RestTemplate;

public class ConnectionManager {
    RestTemplate restTemplate = new RestTemplate();
    public static String HOTEL_OFFERS = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";

    public HotelOfferParser connectToDataSource() throws InvalidDataSourceException {
        if(null ==HOTEL_OFFERS )
            throw new InvalidDataSourceException();
        HotelOfferParser offerParser = restTemplate.getForObject(
                HOTEL_OFFERS, HotelOfferParser.class);
        return offerParser;
    }
}
