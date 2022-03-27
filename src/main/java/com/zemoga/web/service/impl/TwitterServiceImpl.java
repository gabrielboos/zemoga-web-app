package com.zemoga.web.service.impl;

import com.zemoga.web.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TwitterServiceImpl implements TwitterService {

    @Autowired
    private Twitter twitter;

    @Override
    public List<Tweet> getHomeTimeline() {
        return twitter.timelineOperations().getUserTimeline();
    }

}
