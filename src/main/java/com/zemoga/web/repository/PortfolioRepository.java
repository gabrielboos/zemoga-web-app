package com.zemoga.web.repository;

import com.zemoga.web.entity.PortfolioUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PortfolioRepository extends JpaRepository<PortfolioUser, Long> {

    List<PortfolioUser> findByTwitterUser(String twitterUser);

}
