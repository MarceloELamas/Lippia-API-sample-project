package services;
import api.model.timeEntryResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class validatorService {
    public static void validate (){
        timeEntryResponse[] response = (timeEntryResponse[]) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response[0].getId(), "ID ES NULO");
    }
}
