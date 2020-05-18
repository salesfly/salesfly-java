package com.salesfly.api;

import com.salesfly.SalesflyClient;
import com.salesfly.exceptions.APIException;
import com.salesfly.models.MailMessage;
import com.salesfly.models.MailReceipt;

import org.apache.http.HttpEntity;

/**
 * Mail API model class.
 */
public class Mail {
    /**
     * Class constructor.
     */
    private Mail() {}

    /**
     * Send mail message. 
     * 
     * @param message the mail message to send.
     * @return a mail receipt object with status info.
     * @throws APIException if the request failed
     */
    public static MailReceipt send(MailMessage message) throws APIException {
        HttpEntity content = message.asFormContent();
        return SalesflyClient.post("/v1/mail/send", content, MailReceipt.class);
    }
}
