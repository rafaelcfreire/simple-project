package com.br.ehnois.simpleproject;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SampleControllerTest {

    private SampleController sampleController = new SampleController();

    @Test
    public void testSampleController() {
        assertEquals("Hello World", sampleController.getResponse());
    }
}
