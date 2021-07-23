package com.artservice.dto.account;

import com.artservice.dto.Links;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 23/07/2021
 */
@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class Applications {

    @JsonProperty(value = "total_count")
    int totalCount;

    @JsonProperty(value = "_links") //TODO @JsonAnySetter @JsonAnyGetter HAL Documents
//    @JsonUnwrapped
    Links links;

//    @JsonProperty(value = "_embedded") //TODO @JsonAnySetter @JsonAnyGetter HAL Documents
////    @JsonUnwrapped
//    Links links;

}
