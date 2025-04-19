/* Making a REST API call using HTTPClient, which is more modern and efficient compared to HttpURLConnection. */

package com.javaexamples.API;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
// import com.fasterxml.jackson.databind.ObjectMapper;

public class RestAPI_HttpClient {

    // Define the API URL
    private static final String APIURL = "https://www.alphavantage.co/query";
    private static final String API_KEY = "GET_NEW_API_KEY";
    public static void main(String[] args) {
        try {
            // Create an HttpClient
            HttpClient client = HttpClient.newHttpClient();

            // Create an HttpRequest
            HttpRequest request = HttpRequest.newBuilder()
                                            .uri(URI.create(APIURL))
                                            .GET()  // Specify GET request
                                            .header("Accept", "application/json")  // optional headers
                                            .header("function", "TIME_SERIES_INTRADAY")
                                            .header("symbol", "IBM")
                                            .header("interval", "5minY")
                                            .header("outputsize", "full")
                                            .header("apikey", API_KEY)
                                            .build();

            // Send the request and get the response as string.
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Pring the response status and body
            System.out.println("Response Code: " + response.statusCode());
            System.out.println("Response Body" + response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
