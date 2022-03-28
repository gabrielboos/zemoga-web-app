package com.zemoga.web.repository;

import com.zemoga.web.repository.dto.PortfolioUserDTO;
import com.zemoga.web.util.TestUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class PortfolioRepositoryTest {

    private static final String PORTFOLIO_API_URL = "/portfolio/";

    @Autowired
    private PortfolioRepository repository;

    @Autowired
    private MockMvc restMockMvc;

    private PortfolioUserDTO userDTO;

    @BeforeEach
    void init() {
        this.userDTO = TestUtil.createUserDTO();
    }

    @Test
    void testInsertion() throws Exception {

        userDTO.setId(0);

        long countBefore = repository.findAll().size();

        restMockMvc
                .perform(
                        post(PORTFOLIO_API_URL)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(TestUtil.convertObjectToJsonBytes(userDTO))
                )
                .andExpect(status().isCreated());

        long countAfter = repository.findAll().size();

        Assertions.assertEquals(1, countAfter - countBefore);
    }

    @Test
    void testUpdate() throws Exception {

        String newName = "fsociety";

        userDTO.setName(newName);

        restMockMvc
                .perform(
                        patch(PORTFOLIO_API_URL)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(TestUtil.convertObjectToJsonBytes(userDTO))
                )
                .andExpect(status().isOk());

        var user = repository.findById(userDTO.getId());

        Assertions.assertTrue(user.isPresent());
        Assertions.assertEquals(user.get().getName(), newName);

    }
}
