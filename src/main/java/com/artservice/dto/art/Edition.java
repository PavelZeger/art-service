package com.artservice.dto.art;

import com.artservice.dto.Dimensions;
import com.artservice.dto.Links;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

import java.time.LocalDateTime;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 08/07/2021
 */
@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class Edition {

    String id;

    @JsonProperty(value = "created_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    LocalDateTime createdDateTime;

    @JsonProperty(value = "updated_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    LocalDateTime modifiedDateTime;

    Dimensions dimensions;
    String editions;
    String size;

    @JsonProperty(value = "available_editions")
    String availableEditions;

    @JsonProperty(value = "artist_proofs")
    String artistsProofs;

    String prototypes;

    @JsonProperty(value = "can_acquire")
    boolean isCanAcquire;

    @JsonProperty(value = "sale_message")
    String saleMessage;

    @JsonProperty(value = "sold")
    boolean isSold;

    @JsonProperty(value = "_links") //TODO @JsonAnySetter @JsonAnyGetter HAL Documents
//    @JsonUnwrapped
    Links links;

}
