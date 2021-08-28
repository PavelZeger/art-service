package com.artservice.model.response.system;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 21/08/2021
 */
@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum ApiStatus {

    GOOD("good"),
    MINOR("minor"),
    MAJOR("major");

    private final String status;

}
