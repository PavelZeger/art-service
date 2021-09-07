package com.artservice.controller.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 01/07/2021
 */
@Data
@Builder
public class Email {

    @NotNull
    List<String> recipients;
    
    @NotNull
    String subject;

    @NotNull
    String messageText;

}
