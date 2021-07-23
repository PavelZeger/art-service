package com.artservice.dto.art;

import com.artservice.dto.Dimensions;
import com.artservice.dto.Links;
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
public class Artwork {

    String id;
    String slug;

    @JsonProperty(value = "created_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    LocalDateTime createdDateTime;

    @JsonProperty(value = "updated_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    LocalDateTime modifiedDateTime;

    String title;
    String category;
    String medium;
    String date;
    Dimensions dimensions;
    boolean published;
    String website;
    String signature;
    String series;
    String provenance;
    String literature;

    @JsonProperty(value = "exhibition_history")
    String exhibitionHistory;

    @JsonProperty(value = "collecting_institution")
    String collectingInstitution;

    @JsonProperty(value = "additional_information")
    String additionalInformation;

    @JsonProperty(value = "image_rights")
    String imageRights;

    String blurb;

    @JsonProperty(value = "unique")
    boolean isUnique;

    @JsonProperty(value = "cultural_maker")
    String culturalMaker;

    double iconicity;

    @JsonProperty(value = "can_inquire")
    boolean isCanInquire;

    @JsonProperty(value = "can_acquire")
    boolean isCanAcquire;

    @JsonProperty(value = "can_share")
    boolean isCanShare;

    @JsonProperty(value = "sale_message")
    String saleMessage;

    @JsonProperty(value = "sold")
    boolean isSold;

    @JsonProperty(value = "image_versions")
    List<String> imageVersions;

    @JsonProperty(value = "_links") //TODO @JsonAnySetter @JsonAnyGetter HAL Documents
//    @JsonUnwrapped
    Links links;

//    @JsonProperty(value = "_embedded") //TODO @JsonAnySetter @JsonAnyGetter HAL Documents
////    @JsonUnwrapped
//    Links links;

}
