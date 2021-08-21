package com.artservice.model.response.art;

import com.artservice.model.response.Links;
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
public class CollectionItem {

    String id;

    @JsonProperty(value = "created_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    LocalDateTime createdDateTime;

    @JsonProperty(value = "updated_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    LocalDateTime modifiedDateTime;

    int position;

    @JsonProperty(value = "_links") //TODO @JsonAnySetter @JsonAnyGetter HAL Documents
//    @JsonUnwrapped
    Links links;

}
