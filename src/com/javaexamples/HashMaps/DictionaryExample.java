package com.javaexamples.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class DictionaryExample {
    public static void main(String[] args) {
        Map<String, String> params = new HashMap<>();
        params.put("function", "TIME_SERIES_INTRADAY");
        params.put("symbol", "IBM");
        params.put("interval", "5minY");
        params.put("outputsize", "full");
        params.put("apikey", "abcdefg");

        for (Map.Entry<String, String> param : params.entrySet()){
            System.out.println("key= " + param.getKey() + "\nvalue= " + param.getValue());
        }
    }
    
}
