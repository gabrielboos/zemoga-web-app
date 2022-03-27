package com.zemoga.web.service;

import com.zemoga.web.repository.dto.PortfolioUserDTO;

import java.util.List;

public interface PortfolioService {

    PortfolioUserDTO get(long id);

    PortfolioUserDTO getByTwitter(String twitter);

    List<PortfolioUserDTO> getAll();

    PortfolioUserDTO save(PortfolioUserDTO portfolioUserDTO);

    PortfolioUserDTO patch(PortfolioUserDTO portfolioUserDTO);

}
