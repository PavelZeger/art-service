package com.artservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Value;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 23/07/2021
 */
@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class Dimensions {

    Dimension in;
    Dimension cm;
//    Map<String, Dimension> dimensions;

}
