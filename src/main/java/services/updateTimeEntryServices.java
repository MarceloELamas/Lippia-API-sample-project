package services;

import api.model.updateTimeEntryResponse;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class updateTimeEntryServices extends BaseServices{
    public static Response put(String jsonName) {
        return put(jsonName, updateTimeEntryResponse.class, setParams());
    }

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<>();
        params.put("baseUrl", PropertyManager.getProperty("base.api.url"));
        params.put("apiKey", API_KEY.get());
        params.put("workspaceId", WORKSPACE_ID.get());
        params.put("description", DESCRIPTION.get());
        params.put("END", END.get());
        params.put("START", START.get());
        params.put("timeId", TIME_ID.get());
        return params;
    }
}
