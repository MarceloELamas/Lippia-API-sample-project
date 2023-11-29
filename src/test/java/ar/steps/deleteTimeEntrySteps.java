package ar.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import services.deleteTimeEntryServices;

public class deleteTimeEntrySteps  extends PageSteps {
    @And("obtengo un id timeEntry")
    public void obtengoUnIdTimeEntry() {
        deleteTimeEntryServices.defineTimeId();
    }
}
