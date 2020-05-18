package com.salesfly.api;

import com.salesfly.SalesflyClient;
import com.salesfly.models.APIUsage;
import com.salesfly.exceptions.APIException;

/**
 * Usage API class.
 */
public class Usage {
    /**
     * Class constructor.
     */
    private Usage() {}

    /**
     * Get API usage.
     * 
     * @return an object with API usage info.
     * @throws APIException if the request failed
     */
    public static APIUsage get() throws APIException {
        return SalesflyClient.get("/v1/usage", APIUsage.class);
    }

}
