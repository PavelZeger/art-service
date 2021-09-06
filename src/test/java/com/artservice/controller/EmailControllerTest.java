package com.artservice.controller;

import com.artservice.AbstractTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 01/07/2021
 */
@Tag("controller")
@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(SpringExtension.class)
class EmailControllerTest extends AbstractTest {

    @Test
    @DisplayName("")
    void sendEmail() {
    }
}