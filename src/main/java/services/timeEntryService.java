package services;

import api.model.timeEntryResponse;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;
import com.crowdar.util.MapUtils;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;


public class timeEntryService extends BaseServices {

    public static Response get(String jsonName) {
       return get(jsonName, timeEntryResponse[].class,setParams());
    }

    private static Map<String, String> setParams(){
        Map<String, String> params = new HashMap<>();
        params.put("baseUrl", PropertyManager.getProperty("base.api.url"));
        params.put("apiKey", API_KEY.get());
        params.put("workspaceId", WORKSPACE_ID.get());
        params.put("id", ID.get());
        return params;
    }

}


