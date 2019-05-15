package com.engine.oms.util;

import com.google.gson.GsonBuilder;
import java.util.HashMap;
import java.util.List;

public final class Util {

    public static String buildListJson(List list) {
        HashMap<String, Object> response = new HashMap<>();
        
        response.put("Result", "OK");
        response.put("Records", list);

        return new GsonBuilder().setPrettyPrinting().create().toJson(response);
    }
    
    public static String buildObjectJson(Object obj) {
        HashMap<String, Object> response = new HashMap<>();
        
        response.put("Result", "OK");
        response.put("Record", obj);

        return new GsonBuilder().setPrettyPrinting().create().toJson(response);
    }
    
}
