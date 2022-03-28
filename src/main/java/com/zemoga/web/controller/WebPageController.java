package com.zemoga.web.controller;

import com.zemoga.web.repository.dto.PortfolioUserDTO;
import com.zemoga.web.service.PortfolioService;
import com.zemoga.web.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class WebPageController {

    @Autowired
    private TwitterService twitterService;

    @Autowired
    private PortfolioService portfolioService;

    @Value("${portfolio.account-id}")
    private long accountId;

    @RequestMapping("/portfolioIndex")
    public String loadPortfolioValues(Map<String, Object> model) {

        var user = portfolioService.get(accountId);
        var tweets = twitterService.getHomeTimeline();

        model.put("user", user);
        model.put("tweets", tweets);

        return "portfolio";
    }

}
