package examples;

import com.salesfly.salesfly.SalesflyClient;
import com.salesfly.salesfly.api.GeoLocation;
import com.salesfly.salesfly.exceptions.APIException;
import com.salesfly.salesfly.exceptions.ResponseException;
import com.salesfly.salesfly.models.IPLocation;

public class Example {
    public static void main(String[] args) {
        string apiKey = System.getenv("SALESFLY_APIKEY");
        SalesflyClient.init(apiKey);

        try {
            SalesflyClient.init(apiKey);
            GeoLocation location = GeoLocation.get("8.8.8.8");
            System.err.println("Country code: " + location.getCountryCode());
        } catch (ResponseException e) {
            System.err.println("Response error: " + e.getMessage());
        } catch (APIException e) {
            System.err.println("API error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
