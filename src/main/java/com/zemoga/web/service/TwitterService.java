package com.zemoga.web.service;

import org.springframework.social.twitter.api.Tweet;

import java.util.List;

/**
 * The services for the twitter API connection.
 */
public interface TwitterService {

    List<Tweet> getHomeTimeline();

}
