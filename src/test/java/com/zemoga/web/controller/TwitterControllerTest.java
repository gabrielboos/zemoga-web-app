package com.zemoga.web.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.social.twitter.api.TwitterObject;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.hamcrest.Matchers.notNullValue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class TwitterControllerTest {

    private static final String PORTFOLIO_API_URL = "/twitter/";

    @Autowired
    private MockMvc restMockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testTweets() throws Exception {

        var result = restMockMvc
                .perform(get(PORTFOLIO_API_URL))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.[*].text").value(notNullValue()))
                .andReturn();

        var responseAsString = result.getResponse().getContentAsString();
        var reference = new TypeReference<List<TwitterObject>>(){};
        var response = objectMapper.readValue(responseAsString, reference);

        Assertions.assertNotNull(response);
        Assertions.assertFalse(response.isEmpty());
    }

}
