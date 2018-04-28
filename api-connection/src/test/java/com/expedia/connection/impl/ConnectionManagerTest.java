package com.expedia.connection.impl;

import com.expedia.connection.exception.InvalidDataSourceException;
import org.junit.Test;

public class ConnectionManagerTest {

    @Test(expected = InvalidDataSourceException.class)
    public void givenConnectionManagerCalled_WhenNullDataSource_thenException(){
        ConnectionManager connection = new ConnectionManager();
        connection.HOTEL_OFFERS= null;
        connection .connectToDataSource();
    }

    @Test
    public void givenConnectionManagerCalled_WhenCorrectDataSource_thenShouldReturnOffersList(){
        new ConnectionManager().connectToDataSource();
    }

}