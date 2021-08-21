package com.artservice.model.response.event;

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
public class Show {

    String id;
    String slug;

    @JsonProperty(value = "created_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    LocalDateTime createdDateTime;

    @JsonProperty(value = "updated_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    LocalDateTime modifiedDateTime;

    String name;

    @JsonProperty(value = "sortable_name")
    String sortableName;

    String description;

    @JsonProperty(value = "press_release")
    String pressRelease;

    @JsonProperty(value = "start_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    LocalDateTime startDatetime;

    @JsonProperty(value = "end_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    LocalDateTime endDateTime;

    String status;

    @JsonProperty(value = "is_reference")
    boolean isReference;

    @JsonProperty(value = "is_solo_show")
    boolean isCanAcquire;

    @JsonProperty(value = "is_group_show")
    boolean isSoloShow;

    @JsonProperty(value = "is_institutional_show")
    boolean isInstitutionalShow;

    @JsonProperty(value = "is_fair_booth")
    boolean isFairBooth;

    @JsonProperty(value = "image_versions")
    List<String> imageVersions;

    @JsonProperty(value = "_links") //TODO @JsonAnySetter @JsonAnyGetter HAL Documents
//    @JsonUnwrapped
    Links links;
}
