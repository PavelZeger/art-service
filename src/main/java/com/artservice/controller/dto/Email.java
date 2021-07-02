package com.artservice.controller.dto;

import lombok.Data;

import javax.mail.Address;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 01/07/2021
 */
@Data
public class Email {

    @NotNull
    List<Address> recipients;
    
    @NotNull
    String subject;

    @NotNull
    String messageText;

}
