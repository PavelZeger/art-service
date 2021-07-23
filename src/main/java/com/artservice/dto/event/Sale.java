package com.artservice.dto.event;

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
public class Sale {

    String id;
    String slug;

    @JsonProperty(value = "auction_state")
    String auctionState;

    String name;

    @JsonProperty(value = "is_preliminary")
    boolean isPreliminary;

    @JsonProperty(value = "is_auction")
    boolean isAuction;

    @JsonProperty(value = "is_live_integration")
    boolean isLiveIntegration;

    @JsonProperty(value = "start_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    LocalDateTime startDatetime;

    @JsonProperty(value = "end_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    LocalDateTime endDateTime;

    @JsonProperty(value = "time_zone")
    String timeZone;

    @JsonProperty(value = "live_start_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    LocalDateTime liveStartDateTime;

    @JsonProperty(value = "registration_ends_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    LocalDateTime registrationEndDateTime;

    @JsonProperty(value = "published")
    boolean isPublished;

    @JsonProperty(value = "has_buyers_premium")
    boolean isHasBuyersPremium;

    @JsonProperty(value = "created_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    LocalDateTime createdDateTime;

    @JsonProperty(value = "updated_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    LocalDateTime modifiedDateTime;

    @JsonProperty(value = "image_versions")
    List<String> imageVersions;

    @JsonProperty(value = "_links") //TODO @JsonAnySetter @JsonAnyGetter HAL Documents
//    @JsonUnwrapped
    Links links;

}
