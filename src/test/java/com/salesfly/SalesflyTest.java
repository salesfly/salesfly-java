package com.salesfly;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
//import static org.junit.Assert.assertArrayEquals;

import java.io.FileOutputStream;
//import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

// import com.salesfly.SalesflyClient;
// import com.salesfly.api.GeoLocation;
// import com.salesfly.api.Mail;
import com.salesfly.api.PDF;
import com.salesfly.api.Usage;
import com.salesfly.exceptions.APIException;
import com.salesfly.exceptions.ResponseException;

import com.salesfly.models.APIUsage;
// import com.salesfly.models.IPLocation;
// import com.salesfly.models.IPSecurity;
// import com.salesfly.models.MailMessage;
// import com.salesfly.models.MailReceipt;
import com.salesfly.models.PDFOptions;

public class SalesflyTest {
    private static String apiKey = null;

    @BeforeClass
    public static void setUp() {
        apiKey = System.getenv("SALESFLY_APIKEY");
        SalesflyClient.init(apiKey);
    }

    @AfterClass
    public static void tearDown() {
    }

    @Test
    public void testGetUsage() throws APIException {
        try {
            APIUsage usage = Usage.get();
            assertNotNull(usage);
            assertNotEquals(0, usage.getAllowedRequests());
            assertNotEquals(0, usage.getUsedRequests());
        } catch (ResponseException ex) {
            assertNull(ex);
        }
    }

    @Test
    public void testCreatePDF() throws APIException {
        try {
            PDFOptions options = new PDFOptions();
            options.setDocumentURL("https://example.com");
            byte buffer[] = PDF.create(options);
            try (FileOutputStream fos = new FileOutputStream("/tmp/test-java.pdf")) {
                fos.write(buffer);
            }
        } catch (ResponseException ex) {
            assertNull(ex);
        } catch (Exception ex) {
            System.out.println(ex);
            assertNull(ex);

        }
    }

    /*
     * @Test public void testGetLocation() throws APIException { try { IPLocation
     * location = GeoLocation.get("8.8.8.8"); assertNotNull(location);
     * assertEquals("US", location.getCountryCode()); } catch (ResponseException ex)
     * { assertNull(ex); } catch (IllegalArgumentException ex) { assertNull(ex); } }
     * 
     * @Test public void testGetBulkLocation() throws APIException { try {
     * List<IPLocation> locations = GeoLocation.getBulk(new String[] { "8.8.8.8",
     * "apple.com" }); assertNotNull(locations); assertEquals(2, locations.size());
     * for (IPLocation l : locations) { assertEquals("US", l.getCountryCode()); } }
     * catch (ResponseException ex) { assertNull(ex); } catch
     * (IllegalArgumentException ex) { assertNull(ex); } }
     * 
     * @Test public void testSendMail() throws APIException { try { MailMessage
     * message = new MailMessage("ok@demo2.org", "Test", "This is a test",
     * "ok@demo2.org"); message.addAttachment("/Users/otto/me.png"); MailReceipt
     * receipt = Mail.send(message);
     * 
     * assertNotNull(receipt); assertNotNull(receipt.getSubmitID()); assertEquals(1,
     * receipt.getAcceptedRecipients()); assertEquals(0,
     * receipt.getRejectedRecipients()); } catch (ResponseException ex) {
     * assertNull(ex); } }
     * 
     * @Test public void geoipDataStructures() throws APIException { String json =
     * "{ \"data\": { \"is_proxy\": true, \"proxy_type\": \"test\", \"threat_types\": [\"x\",\"y\"] } }"
     * ; IPSecurity sec = SalesflyClient.fromJSON(json, IPSecurity.class);
     * assertEquals(true, sec.isProxy()); assertEquals("test", sec.getProxyType());
     * assertEquals(null, sec.getThreatLevel()); assertArrayEquals(new String[] {
     * "x", "y" }, sec.getThreatTypes()); }
     */
}