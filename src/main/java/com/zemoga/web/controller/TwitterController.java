package com.zemoga.web.controller;

import com.zemoga.web.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@PropertySource({"classpath:/messages.properties"})
@RestController
@RequestMapping("/twitter")
public class TwitterController {

    @Autowired
    private TwitterService twitterService;

    @GetMapping("/")
    public ResponseEntity<List<Tweet>> getTimeline() {

        var response = twitterService.getHomeTimeline();

        return ResponseEntity.ok(response);
    }

}
