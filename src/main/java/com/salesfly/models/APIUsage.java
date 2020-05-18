package com.salesfly.models;

import com.google.gson.annotations.SerializedName;

/**
 * APIUsage model.
 */
public class APIUsage {
    /**
     * Number of allowed requests
     */
    @SerializedName("allowed")
    private final int allowed;

    /**
     * Number of used requests
     */
    @SerializedName("used")
    private final int used;

    /**
     * Class constructor.
     */
    public APIUsage() {
        this.allowed = 0;
        this.used = 0;
    }

    /**
     * Get the number of allowed requests
     * 
     * @return number of requests
     */
    public int getAllowedRequests() {
        return this.allowed;
    }

    /**
     * Get the number of used requests
     * 
     * @return number of requests
     */
    public int getUsedRequests() {
        return this.used;
    }
}
