package com.salesfly.api;

import com.salesfly.SalesflyClient;
import com.salesfly.models.PDFOptions;
import com.salesfly.exceptions.APIException;
import org.apache.http.HttpEntity;

/**
 * PDF API class.
 */
public class PDF {
    /**
     * Class constructor.
     */
    private PDF() {
    }

    /**
     * Create PDF document.
     * 
     * @param options the PDF document options.
     * @return a buffer with PDF document bytes.
     * @throws APIException if the request failed
     */
    public static byte[] create(PDFOptions options) throws APIException {
        HttpEntity content = options.asFormContent();
        return SalesflyClient.post2("/v1/pdf/create", content);
    }
}
