package com.salesfly;

/**
 * Constants
 */
public final class Constants {

    private Constants() {
    }

    public static final String VERSION = "0.9.1";

    public static final String USER_AGENT = "salesfly-java/" + VERSION;

    public static final String API_BASE_URL = "https://api.salesfly.com";

    public static final int DEFAULT_TIMEOUT = 30; // in seconds
}