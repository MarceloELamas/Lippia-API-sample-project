package services;

import api.model.addTimeEntryResponse;
import api.model.updateTimeEntryResponse;
import com.crowdar.api.rest.APIManager;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class deleteTimeEntryServices extends BaseServices{
    public static void defineTimeId() {
        addTimeEntryResponse response = (addTimeEntryResponse) APIManager.getLastResponse().getResponse();
        TIME_ID.set(response.getId());

    }

    public static Response delete(String jsonName) {
        return delete(jsonName, updateTimeEntryResponse.class, setParams());
    }
    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<>();
        params.put("baseUrl", PropertyManager.getProperty("base.api.url"));
        params.put("apiKey", API_KEY.get());
        params.put("workspaceId", WORKSPACE_ID.get());
        params.put("timeId", TIME_ID.get());
        return params;
    }


}
