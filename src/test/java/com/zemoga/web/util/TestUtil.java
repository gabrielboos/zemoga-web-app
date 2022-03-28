package com.zemoga.web.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.zemoga.web.repository.dto.PortfolioUserDTO;

import java.io.IOException;

public class TestUtil {

    private static final ObjectMapper mapper = createObjectMapper();

    private static ObjectMapper createObjectMapper() {
        return new ObjectMapper().configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false).registerModule(new JavaTimeModule());
    }

    public static byte[] convertObjectToJsonBytes(Object object) throws IOException {
        return mapper.writeValueAsBytes(object);
    }

    public static PortfolioUserDTO createUserDTO() {
        var userDTO = new PortfolioUserDTO();

        userDTO.setId(14);
        userDTO.setExperience("No experience plz job");
        userDTO.setImagePath("https://i.kym-cdn.com/entries/icons/mobile/000/021/807/ig9OoyenpxqdCQyABmOQBZDI0duHk2QZZmWg2Hxd4ro.jpg");
        userDTO.setName("Mr. Robot");
        userDTO.setTwiter_user("FBI");
        userDTO.setTwitterUser("FBI");
        userDTO.setEmail("mr.robot@fsociety.net");
        userDTO.setAddress("935 Pennsylvania Avenue");
        userDTO.setAdress("935 Pennsylvania Avenue");
        userDTO.setPhone("(202) 324-3000");
        userDTO.setZipCode("20535-0001");

        return userDTO;
    }


}
