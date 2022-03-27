package com.zemoga.web.repository.mapper;

import com.zemoga.web.entity.PortfolioUser;
import com.zemoga.web.repository.dto.PortfolioUserDTO;
import org.mapstruct.Mapper;

/**
 * Mapper for entity {@link com.zemoga.web.entity.PortfolioUser} and its DTO {@link com.zemoga.web.repository.dto.PortfolioUserDTO}
 */
@Mapper(componentModel = "spring", uses = {})
public interface PortfolioMapperMapper extends EntityMapper<PortfolioUserDTO, PortfolioUser> {
}
