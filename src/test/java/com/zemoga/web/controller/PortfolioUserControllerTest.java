package com.zemoga.web.controller;

import com.zemoga.web.repository.dto.PortfolioUserDTO;
import com.zemoga.web.util.TestUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class PortfolioUserControllerTest {

    private static final String PORTFOLIO_API_URL = "/portfolio/";

    @Autowired
    private MockMvc restMockMvc;

    private PortfolioUserDTO userDTO;

    @BeforeEach
    void init() {
        this.userDTO = TestUtil.createUserDTO();
    }

    @ParameterizedTest
    @NullAndEmptySource
    void testAddressNullValidation(String address) throws Exception {
        userDTO.setAddress(address);

        restMockMvc
                .perform(
                        post(PORTFOLIO_API_URL)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(TestUtil.convertObjectToJsonBytes(userDTO))
                )
                .andExpect(status().isBadRequest());
    }

    @ParameterizedTest
    @NullAndEmptySource
    void testAddresNullValidation(String adress) throws Exception {
        userDTO.setAdress(adress);

        restMockMvc
                .perform(
                        post(PORTFOLIO_API_URL)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(TestUtil.convertObjectToJsonBytes(userDTO))
                )
                .andExpect(status().isBadRequest());
    }

    @ParameterizedTest
    @NullAndEmptySource
    void testNameNullValidation(String name) throws Exception {
        userDTO.setName(name);

        restMockMvc
                .perform(
                        post(PORTFOLIO_API_URL)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(TestUtil.convertObjectToJsonBytes(userDTO))
                )
                .andExpect(status().isBadRequest());
    }

    @ParameterizedTest
    @NullAndEmptySource
    void testTwitterUserNullValidation(String twitterUser) throws Exception {
        userDTO.setTwitterUser(twitterUser);

        restMockMvc
                .perform(
                        post(PORTFOLIO_API_URL)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(TestUtil.convertObjectToJsonBytes(userDTO))
                )
                .andExpect(status().isBadRequest());
    }

    @ParameterizedTest
    @NullAndEmptySource
    void testTwitter_UserNullValidation(String twitterUser) throws Exception {
        userDTO.setTwiter_user(twitterUser);

        restMockMvc
                .perform(
                        post(PORTFOLIO_API_URL)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(TestUtil.convertObjectToJsonBytes(userDTO))
                )
                .andExpect(status().isBadRequest());
    }

    @ParameterizedTest
    @NullAndEmptySource
    void testPhoneNullValidation(String phone) throws Exception {
        userDTO.setPhone(phone);

        restMockMvc
                .perform(
                        post(PORTFOLIO_API_URL)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(TestUtil.convertObjectToJsonBytes(userDTO))
                )
                .andExpect(status().isBadRequest());
    }

}
