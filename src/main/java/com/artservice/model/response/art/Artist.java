package com.artservice.model.response.art;

import com.artservice.model.response.Links;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 08/07/2021
 */
@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class Artist {

    String id;
    String slug;

    @JsonProperty(value = "updated_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    LocalDateTime modifiedDateTime;

    @JsonProperty(value = "name")
    String fullName;

    @JsonProperty(value = "sortable_name")
    String sortableFullName;

    String gender;
    String biography;

    @JsonProperty(value = "birthday")
    int birthYear;

    @JsonProperty(value = "deathday")
    int deathYear;

    String hometown;
    String location;
    String nationality;

    @JsonProperty(value = "image_versions")
    List<String> imageVersions;

    @JsonProperty(value = "_links") //TODO @JsonAnySetter @JsonAnyGetter HAL Documents
//    @JsonUnwrapped
    Links links;


}
