package com.expedia.json.parser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserInfo {
    @JsonProperty("userId")
    private String userID;
    @JsonProperty("persona")
    private Persona persona;


    public Persona getPersona() {
        return persona;
    }
    public String getUserID() {
        return userID;
    }

    @Override
    public String toString() {
        return "UserInfo{" + "persona=" + persona + ", userID='" + userID + '\'' + '}';
    }
}
