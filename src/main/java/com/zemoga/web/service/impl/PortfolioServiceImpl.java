package com.zemoga.web.service.impl;

import com.zemoga.web.entity.PortfolioUser;
import com.zemoga.web.repository.PortfolioRepository;
import com.zemoga.web.repository.dto.PortfolioUserDTO;
import com.zemoga.web.repository.mapper.PortfolioMapperMapper;
import com.zemoga.web.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class PortfolioServiceImpl implements PortfolioService {

    @Autowired
    private PortfolioRepository repository;

    @Autowired
    private PortfolioMapperMapper mapper;

    @Override
    public PortfolioUserDTO get(long id) {

        var savedUser = repository.findById(id);

        if (savedUser.isEmpty()) {
            throw new EntityNotFoundException("Missing portfolio ID for " + id);
        }

        return mapper.toDto(savedUser.get());
    }

    @Override
    public PortfolioUserDTO getByTwitter(String twitter) {

        var savedUser = repository.findByTwitterUser(twitter);

        if (savedUser.isEmpty()) {
            throw new EntityNotFoundException("Missing portfolio twitter for " + twitter);
        }

        return mapper.toDto(savedUser.get(0));
    }

    @Override
    public List<PortfolioUserDTO> getAll() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }

    @Override
    public PortfolioUserDTO save(PortfolioUserDTO portfolioUserDTO) {

        var user = mapper.toEntity(portfolioUserDTO);
        var savedUser = repository.saveAndFlush(user);

        return mapper.toDto(savedUser);
    }

    @Override
    public PortfolioUserDTO patch(PortfolioUserDTO portfolioUserDTO) {

        PortfolioUser foundUser = repository.getById(portfolioUserDTO.getId());

        mapper.partialUpdate(foundUser, portfolioUserDTO);

        PortfolioUser savedUser = repository.save(foundUser);

        return mapper.toDto(savedUser);
    }
}
