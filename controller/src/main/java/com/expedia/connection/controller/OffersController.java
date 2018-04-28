package com.expedia.connection.controller;

import com.expedia.connection.impl.ConnectionManager;
import com.expedia.json.parser.Hotel;
import com.expedia.json.parser.HotelOfferParser;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class OffersController {
    ConnectionManager getOffersList = new ConnectionManager();
    HotelOfferParser offers = getOffersList.connectToDataSource();
    SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
    List<Hotel> filteredHotels;

    @GetMapping(value = "/allOffers")
    public String allOffers(@RequestParam(name = "name", required = false) String[][] name,
                            @RequestParam(name = "price", required = false) String price,
                            @RequestParam(name = "hotelName", required = false) String hotelName,
                            @RequestParam(name = "city", required = false) String city,
                            @RequestParam(name = "url", required = false) String url,
                            @RequestParam(name = "image", required = false) String image,
                            @RequestParam(name = "country", required = false) String country,
                            @RequestParam(name = "minStarRating", required = false) String minStarRating,
                            @RequestParam(name = "maxStarRating", required = false) String maxStarRating,
                            @RequestParam(name = "minGuestRating", required = false) String minGuestRating,
                            @RequestParam(name = "maxGuestRating", required = false) String maxGuestRating,
                            @RequestParam(name = "minTotalRating", required = false) String minTotalRating,
                            @RequestParam(name = "maxTotalRating", required = false) String maxTotalRating,
                            @RequestParam(name = "tripLength", required = false) String tripLength,
                            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                            @RequestParam(name = "startDate", required = false) Date startDate,
                            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                            @RequestParam(name = "endDate", required = false) Date endDate,
                            Model model) {

        List<Hotel> hotels = offers.getOffers().getHotel();
        FilterHotelList(city,minGuestRating,minTotalRating,startDate,endDate,hotels);

        if(filteredHotels.isEmpty()){
            model.addAttribute("name",name);
        }

        name= new String[filteredHotels.size()][9];
        fillAttribute(name, model, filteredHotels);
        return "allOffers";
        }

    private void fillAttribute(@RequestParam(name = "name", required = false) String[][] name, Model model, List<Hotel> hotels) {
        for(int i=0;i<hotels.size();i++){
             name[i][0] =hotels.get(i).getHotelInfo().getHotelName();
             name[i][1] =hotels.get(i).getHotelInfo().getHotelImageUrl();
             name[i][2] = hotels.get(i).getHotelInfo().getHotelCity();
             name[i][3] =hotels.get(i).getDestination().getCountry();
             name[i][4] ="Guest Review: "+ hotels.get(i).getHotelInfo().getHotelGuestReviewRating().toString();
             name[i][5] ="Price per night: "+ hotels.get(i).getHotelPricingInfo().getAveragePriceValue()+" $";
             name[i][6] ="Offer from: " +hotels.get(i).getOfferDateRange().getTravelStartDate().toString();
             name[i][7] ="Offer until: "+ hotels.get(i).getOfferDateRange().getTravelEndDate().toString();
             name[i][8] =hotels.get(i).getHotelUrls().getHotelInfositeUrl().toString();
         }
        model.addAttribute("name",name);
    }

    private void FilterHotelList(@RequestParam(name = "city", required = false) String city,
                                 @RequestParam(name = "minGuestRating", required = false) String minGuestRating,
                                 @RequestParam(name = "minTotalRating", required = false) String minTotalRating,
                                 @RequestParam(name = "startDate", required = false) Date startDate,
                                 @RequestParam(name = "endDate", required = false) Date endDate, List<Hotel> hotels) {
        filteredHotels = new ArrayList<>();
        for (Hotel hotel : hotels) {
            if (isAfter(startDate, hotel) && isBefore(endDate, hotel) && isWithinGuestRating(minGuestRating, hotel) && isWithinTotalRating(minTotalRating, hotel) && isEquals(city, hotel))

                filteredHotels.add(hotel);
        }
    }

    private boolean isEquals(@RequestParam(name = "city", required = false) String city, Hotel hotel) {
        if(city.equals("All destinations"))
            return true;
        return hotel.getDestination().getCity().equals(city);
    }

    private boolean isWithinTotalRating(@RequestParam(name = "minTotalRating", required = false) String minTotalRating, Hotel hotel) {
        if(minTotalRating.equals("All ratings"))
            return true;
        RangeNumbers totalRatingNumbers = convertToDouble(minTotalRating);
        return hotel.getHotelInfo().getHotelReviewTotal() >= totalRatingNumbers.min && hotel.getHotelInfo().getHotelReviewTotal() <= totalRatingNumbers.max;
    }

    private boolean isWithinGuestRating(@RequestParam(name = "minGuestRating", required = false) String minGuestRatingString, Hotel hotel) {
        if(minGuestRatingString.equals("All ratings"))
            return true;
        RangeNumbers guestRatingNumbers = convertToDouble(minGuestRatingString);
        return hotel.getHotelInfo().getHotelGuestReviewRating() >= guestRatingNumbers.min && hotel.getHotelInfo().getHotelGuestReviewRating() <= guestRatingNumbers.max;
    }

    private boolean isBefore(@RequestParam(name = "endDate", required = false) Date endDate, Hotel hotel) {
        if(endDate == null)
            return true;
        try {
            Date offerEndDate = dateFormat.parse(hotel.getOfferDateRange().getTravelEndDate());
            Date tripEndDate = dateFormat.parse(dateFormat.format(endDate));
            return tripEndDate.before(offerEndDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean isAfter(@RequestParam(name = "startDate", required = false) Date startDate,Hotel hotel) {
        if (startDate == null) return true;
        Date offerStartDate = null;
        try {
            offerStartDate = dateFormat.parse(hotel.getOfferDateRange().getTravelStartDate());
            Date tripStartDate = dateFormat.parse(dateFormat.format(startDate));
            return tripStartDate.after(offerStartDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return false;
    }

    private RangeNumbers convertToDouble(String minGuestRating) {
        RangeNumbers numbers= new RangeNumbers();
        String[] s= minGuestRating.split(" ");
        numbers.min= Double.parseDouble(s[0]);
        numbers.max= Double.parseDouble(s[s.length-1]);
        return numbers;
    }

    private class RangeNumbers {
        public RangeNumbers setMin(Double min) {
            this.min = min;
            return this;
        }

        public Double getMin() {
            return min;
        }

        public Double getMax() {
            return max;
        }

        public RangeNumbers setMax(Double max) {
            this.max = max;
            return this;
        }

        Double min;
        Double max;
    }
}
