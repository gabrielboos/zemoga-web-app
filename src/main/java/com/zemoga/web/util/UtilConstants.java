package com.zemoga.web.util;

import java.net.URI;
import java.net.URISyntaxException;

public class UtilConstants {

    private UtilConstants() {
    }

    private static final String PORTFOLIO_URI = "/portfolio/";

    public static URI getPortfolioResponseURI() throws URISyntaxException {
        return new URI(PORTFOLIO_URI);
    }

}
