package ar.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import services.BaseServices;
import services.validatorService;

public class updateTimeEntrySteps extends PageSteps {

    @And("^un workspaceId '(.*)' y timeId '(.*)'$")
    public void unWorkspaceIdYTimeId(String workSpaceId, String timeId) {
        BaseServices.WORKSPACE_ID.set(workSpaceId);
        BaseServices.TIME_ID.set(timeId);
    }


    @Then("obtengo la descripcion de mi hora actualizada")
    public void obtengoLaDescripcionDeMiHoraActualizada() {
        validatorService.validateUpdateEntry();
    }

}
