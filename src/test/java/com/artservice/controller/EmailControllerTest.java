package com.artservice.controller;

import com.artservice.AbstractTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 01/07/2021
 */
@Tag("`emailController")
@Execution(ExecutionMode.CONCURRENT)
class EmailControllerTest extends AbstractTest {

    @Test
    void sendEmail() {
    }
}