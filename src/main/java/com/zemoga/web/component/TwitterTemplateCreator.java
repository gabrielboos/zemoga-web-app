package com.zemoga.web.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.impl.TwitterTemplate;
import org.springframework.stereotype.Component;

@Component
public class TwitterTemplateCreator {

    @Value("${twitter.zemoga.consumer-key}")
    private String consumerKey;

    @Value("${twitter.zemoga.consumer-secret}")
    private String consumerSecret;

    @Value("${twitter.zemoga.access-tokens}")
    private String accessToken;

    @Value("${twitter.zemoga.access-token-secret}")
    private String accessTokenSecret;

    @Bean
    public Twitter getTwitterTemplate() {
        return new TwitterTemplate(consumerKey, consumerSecret, accessToken, accessTokenSecret);
    }
}