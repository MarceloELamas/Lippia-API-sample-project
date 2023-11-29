package services;
import api.model.timeEntryResponse;
import api.model.addTimeEntryResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;
import api.model.updateTimeEntryResponse;

public class validatorService {
    public static void validate (){
        timeEntryResponse[] response = (timeEntryResponse[]) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response[0].getId(), "ID ES NULO");
    }
    public static void validateAddEntry (){
        addTimeEntryResponse response = (addTimeEntryResponse) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response.getId(), "ID ES NULO");
    }

    public static void validateUpdateEntry (){
        updateTimeEntryResponse response = (updateTimeEntryResponse) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response.getDescription(), "ID ES NULO");
    }
}
