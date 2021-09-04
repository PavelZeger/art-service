package com.artservice;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Tag;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 25/06/2021
 */
@Tag("base")
@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class AbstractTest {

}
