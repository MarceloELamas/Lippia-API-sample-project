package ar.steps;

import api.config.EntityConfiguration;
import com.crowdar.core.PageSteps;
import com.google.api.client.repackaged.com.google.common.base.Splitter;
import com.google.cloud.BaseService;
import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;
import org.apache.commons.lang.StringUtils;
import services.BaseServices;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class timeEntrySteps extends PageSteps {

    @Given("una cuenta creada en clockify y x-api-key generado")
    public void unaCuentaCreadaEnClockifyYXApiKeyGenerado() {
        String apikey = System.getenv("API_KEY");
        BaseServices.API_KEY.set(apikey);
    }

    @When("^I perform a '(.*)' to '(.*)' endpoint with the '(.*)' and '(.*)'$")
    public void doRequest(String methodName, String entity, String jsonName, String jsonReplacementValues) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Class entityService = EntityConfiguration.valueOf(entity).getEntityService();
        Map<String, String> parameters = getParameters(jsonReplacementValues);
        String jsonPath = "request/".concat(jsonName);
        if (parameters == null) {
            entityService.getMethod(methodName.toLowerCase(), String.class).invoke("", jsonPath);
        } else {
            entityService.getMethod(methodName.toLowerCase(), String.class, Map.class).invoke("", jsonPath, parameters);
        }
    }

    private Map<String, String> getParameters(String jsonReplacementValues) {
        Map<String, String> parameters = null;
        if (!StringUtils.isEmpty(jsonReplacementValues)) {
            parameters = Splitter.on(",").withKeyValueSeparator(":").split(jsonReplacementValues);
        }
        return parameters;
    }


}
