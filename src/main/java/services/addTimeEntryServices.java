package services;

import api.model.addTimeEntryResponse;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;
import com.crowdar.util.MapUtils;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;


public class addTimeEntryServices extends BaseServices {

    public static Response POST(String jsonName) {
        return post(jsonName, addTimeEntryResponse.class, setParams());
    }

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<>();
        params.put("baseUrl", PropertyManager.getProperty("base.api.url"));
        params.put("apiKey", API_KEY.get());
        params.put("workspaceId", WORKSPACE_ID.get());
        params.put("description", DESCRIPTION.get());
        params.put("END", END.get());
        params.put("START", START.get());
        params.put("projectId", PROYECT_ID.get());
        return params;
    }

}