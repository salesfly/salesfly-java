package com.salesfly;

import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.salesfly.exceptions.APIConnectionException;
import com.salesfly.exceptions.APIException;
import com.salesfly.exceptions.APITimeoutException;
import com.salesfly.exceptions.ResponseException;
import com.salesfly.models.Entity;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 * Singleton class to initialize SalesflyClient.
 */
public final class SalesflyClient {
    private static final Gson GSON = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").create();

    private static String apiKey;
    private static int timeout = 30;

    /**
     * Private constructor to prevent instantiation.
     */
    private SalesflyClient() {
    }

    /**
     * Initialize the client with apikey
     * 
     * @param apiKey API key
     */
    public static void init(final String apiKey) {
        init(apiKey, 30);
    }

    /**
     * Initialize the client with apikey and timeout
     * 
     * @param apiKey  API key
     * @param timeout connection timeout
     */
    public static void init(final String apiKey, final int timeout) {
        SalesflyClient.setApiKey(apiKey);
        SalesflyClient.setTimeout(timeout);
    }

    /**
     * Executes an HTTP GET request
     * 
     * @param <T>    the response type
     * @param path   the path to add to the base URL
     * @param aClass the type of class we want to return
     * @return an instance of class T
     * @throws APIException of the request failed
     */
    public static <T> T get(final String path, Class<T> aClass) throws APIException {
        RequestConfig config = RequestConfig.custom().setConnectTimeout(timeout * 1000)
                .setConnectionRequestTimeout(timeout * 1000).setSocketTimeout(timeout * 1000).build();

        CloseableHttpClient httpclient = HttpClientBuilder.create().setDefaultRequestConfig(config).build();
        CloseableHttpResponse response = null;
        try {
            HttpGet request = new HttpGet(Constants.API_BASE_URL + path);
            request.addHeader("User-Agent", Constants.USER_AGENT);
            request.addHeader("Authorization", "Bearer " + apiKey);
            request.addHeader("Accept", "application/json");

            response = httpclient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == 200) {
                HttpEntity entity = response.getEntity();
                String json = EntityUtils.toString(entity);
                return SalesflyClient.fromJSON(json, aClass);
            } else {
                HttpEntity entity = response.getEntity();
                String json = EntityUtils.toString(entity);
                Error err = GSON.fromJson(json, Error.class);
                throw new ResponseException(err.getStatus(), err.getMessage(), err.getCode());
            }
        } catch (java.net.SocketTimeoutException e) {
            throw new APITimeoutException("The request timed out");
        } catch (IOException ex) {
            throw new APIConnectionException(
                    "Unable to connect to server. Please check your internet connection and try again.");
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
                httpclient.close();
            } catch (IOException ex) {
                // Ignore
            }
        }
    }

    /**
     * Executes an HTTP POST request
     * 
     * @param <T>     the response type
     * @param path    the path to add to the base URL
     * @param payload an object containing the post payload data
     * @param aClass  the type of class we want to return
     * @return an instance of class T
     * @throws APIException of the request failed
     */
    public static <T> T post(final String path, final Object payload, Class<T> aClass) throws APIException {
        RequestConfig config = RequestConfig.custom().setConnectTimeout(timeout * 1000)
                .setConnectionRequestTimeout(timeout * 1000).setSocketTimeout(timeout * 1000).build();

        CloseableHttpClient httpclient = HttpClientBuilder.create().setDefaultRequestConfig(config).build();
        CloseableHttpResponse response = null;
        try {
            HttpPost request = new HttpPost(Constants.API_BASE_URL + path);
            request.addHeader("User-Agent", Constants.USER_AGENT);
            request.addHeader("Authorization", "Bearer " + apiKey);
            request.addHeader("Accept", "application/json");

            if (payload instanceof HttpEntity) {
                // Multipart/form-data
                request.setEntity((HttpEntity) payload);
            } else {
                // Assume JSON
                JsonObject json = (JsonObject) payload;
                StringEntity requestEntity = new StringEntity(json.toString(), ContentType.APPLICATION_JSON);
                request.setEntity(requestEntity);
            }

            response = httpclient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == 200) {
                HttpEntity entity = response.getEntity();
                String json = EntityUtils.toString(entity);
                return SalesflyClient.fromJSON(json, aClass);
            } else {
                HttpEntity entity = response.getEntity();
                String json = EntityUtils.toString(entity);
                Error err = GSON.fromJson(json, Error.class);
                throw new ResponseException(err.getStatus(), err.getMessage(), err.getCode());
            }
        } catch (java.net.SocketTimeoutException e) {
            throw new APITimeoutException("The request timed out");
        } catch (IOException ex) {
            throw new APIConnectionException(
                    "Unable to connect to server. Please check your internet connection and try again.");
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
                httpclient.close();
            } catch (IOException ex) {
                // Ignore
            }
        }
    }

    public static byte[] post2(final String path, final Object payload) throws APIException {
        RequestConfig config = RequestConfig.custom().setConnectTimeout(timeout * 1000)
                .setConnectionRequestTimeout(timeout * 1000).setSocketTimeout(timeout * 1000).build();

        CloseableHttpClient httpclient = HttpClientBuilder.create().setDefaultRequestConfig(config).build();
        CloseableHttpResponse response = null;
        try {
            HttpPost request = new HttpPost(Constants.API_BASE_URL + path);
            request.addHeader("User-Agent", Constants.USER_AGENT);
            request.addHeader("Authorization", "Bearer " + apiKey);
            request.addHeader("Accept", "application/pdf");

            if (payload instanceof HttpEntity) {
                // Multipart/form-data
                request.setEntity((HttpEntity) payload);
            } else {
                // Assume JSON
                JsonObject json = (JsonObject) payload;
                StringEntity requestEntity = new StringEntity(json.toString(), ContentType.APPLICATION_JSON);
                request.setEntity(requestEntity);
            }

            response = httpclient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == 200) {
                HttpEntity entity = response.getEntity();

                if (entity != null) {
                    ByteArrayOutputStream bos = new ByteArrayOutputStream();
                    entity.writeTo(bos);
                    byte[] bytes = bos.toByteArray();
                    if (bytes == null) {
                        bytes = "null".getBytes();
                    }
                    return bytes;
                }
                return null;
            } else {
                HttpEntity entity = response.getEntity();
                String json = EntityUtils.toString(entity);
                Error err = GSON.fromJson(json, Error.class);
                throw new ResponseException(err.getStatus(), err.getMessage(), err.getCode());
            }
        } catch (java.net.SocketTimeoutException e) {
            throw new APITimeoutException("The request timed out");
        } catch (IOException ex) {
            throw new APIConnectionException(
                    "Unable to connect to server. Please check your internet connection and try again.");
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
                httpclient.close();
            } catch (IOException ex) {
                // Ignore
            }
        }
    }

    /**
     * Creates an object from a JSON string
     * 
     * @param <T>    the response type
     * @param json   the JSON string
     * @param aClass the type of class we want to create
     * @return an instance of class T
     */
    public static <T> T fromJSON(final String json, Class<T> aClass) {
        Type type = TypeToken.getParameterized(Entity.class, aClass).getType();
        Entity<T> res = GSON.fromJson(json, type);
        return res.getData();
    }

    /**
     * Creates a JSON string from an object
     * 
     * @param obj the object to convert
     * @return a JSON data string
     */
    public static String toJSON(Object obj) {
        return GSON.toJson(obj);
    }

    /**
     * Set the api key
     * 
     * @param apiKey API key to use
     */
    public static void setApiKey(final String apiKey) {
        SalesflyClient.apiKey = apiKey;
    }

    /**
     * Set the timeout
     * 
     * @param timeout timeout to use
     */
    public static void setTimeout(final int timeout) {
        SalesflyClient.timeout = timeout;
    }
}
