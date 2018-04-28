package com.expedia.json.parser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Persona {
    @JsonProperty("personaType") //Map API object to persona parser object
    String personaType;

    //No need for setters, user shouldn't be able to manipulate data.
    public String getPersonaType() {
        return personaType;
    }

    @Override
    public String toString() {
        return "Persona{" + "personaType='" + getPersonaType() + '\'' + '}';
    }
}
