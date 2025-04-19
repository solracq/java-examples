package com.javaexamples.API;

/* Making a GET request to a server using HttpURLConnection (old) implementation */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;  // Class that allows to send HTTP requests and receive response from servers
import java.net.URISyntaxException;
import java.net.URI;
import java.net.URL;
// To create and retrieve a dictionary
import java.util.Map;
import java.util.HashMap;

public class RestAPI_HttpURLConnection
{
    private static final String API_URL = "https://www.alphavantage.co/query";
    private static final String API_KEY = "GET_A_NEW_KEY";
    
    public static void main(String[] args) throws URISyntaxException {
        // Declaring API parameters in a dictionary
        Map<String, String> params = new HashMap<>();
        params.put("function", "TIME_SERIES_INTRADAY");
        params.put("symbol", "IBM");
        params.put("interval", "5minY");
        params.put("outputsize", "full");
        params.put("apikey", API_KEY);

        try 
        {
            // Making an object to point to the API URL
            URL url = new URI(API_URL).toURL();  // it seems URL class is deprecated, so using URI class

            // Open a connection to the URL and cast the response
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Now that the connection is 'open', we set the HTTP request method to GET.
            connection.setRequestMethod("GET");
            
            // Set request headers (optional)
            // connection.setRequestProperty("Accept", "applicaiton/json");
            for (Map.Entry<String, String> param : params.entrySet()){
                connection.setRequestProperty(param.getKey(), param.getValue());
            }

            // Get the response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);
            
            // Read the response if it's successful (200 OK)
            if (responseCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    String inputLine;
                    StringBuffer response = new StringBuffer();

                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();
                    
                    //Print the response
                    System.out.println("Response: " + response.toString());
            } else {
                System.out.println("GET request failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
