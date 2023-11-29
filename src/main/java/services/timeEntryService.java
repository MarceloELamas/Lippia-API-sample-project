package services;

import api.model.timeEntryResponse;
import com.crowdar.api.rest.MethodsService;
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

    public static Response delete(String jsonName) {
        return delete(jsonName, null);
    }

    @Override
    public void validateFields(Object expected, Object actual, Map<String, String> parameters) throws Exception {
        Map<String, Object> expectedObjectMapped = MapUtils.convertObjectToMap(expected);
        Map<String, String> expectedData = (Map<String, String>) expectedObjectMapped.get("data");
        expectedData.replace("first_name", parameters.get("name"));

        ObjectMapper objectMapper = new ObjectMapper();
        expected = objectMapper.convertValue(expectedObjectMapped, Object.class);

        validateFields(expected, actual);
    }

    private static Map<String, String> setParams(){
        Map<String, String> params = new HashMap<>();
        params.put("baseUrl", PropertyManager.getProperty("base.api.url"));
        params.put("apiKey", API_KEY.get());
        return params;
    }

}


