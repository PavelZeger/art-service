package com.artservice;

import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 25/06/2021
 */
@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class AbstractTest {

}
