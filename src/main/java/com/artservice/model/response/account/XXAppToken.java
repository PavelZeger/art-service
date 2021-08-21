package com.artservice.model.response.account;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

import java.time.LocalDateTime;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 09/07/2021
 */
@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class XXAppToken {

    String type;

    @JsonProperty(value = "token")
    String authenticationToken;

    @JsonProperty(value = "expires_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    LocalDateTime expiredDateTime;

}
