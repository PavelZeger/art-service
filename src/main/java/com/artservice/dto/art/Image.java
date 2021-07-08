package com.artservice.dto.art;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Value;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 08/07/2021
 */
@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class Image {
}
