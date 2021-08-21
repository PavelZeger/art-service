package com.artservice.model.response.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

import java.util.Map;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 08/07/2021
 */
@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    String id;
    String name;

    //TODO to parse nested jsons to map
    @JsonProperty(value = "_links")
    Map<String, String> links;
}
