package ar.steps;

import api.config.EntityConfiguration;
import com.crowdar.core.PageSteps;
import com.google.api.client.repackaged.com.google.common.base.Splitter;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;
import org.apache.commons.lang.StringUtils;
import services.BaseServices;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;


public class addTimeEntrySteps extends PageSteps {



    @And("^un workspaceId '(.*)' y proyectId '(.*)'$")
    public void unWorkspaceIdYProyectId(String workSpaceId, String proyectId) {
        BaseServices.WORKSPACE_ID.set(workSpaceId);
        BaseServices.PROYECT_ID.set(proyectId);
    }

    @And("^un workspaceId '(.*)'y proyectId '(.*)'$")
    public void unWorkspaceId(String workSpaceId, String proyectId) {
        BaseServices.WORKSPACE_ID.set(workSpaceId);
        BaseServices.PROYECT_ID.set(proyectId);
    }

    @And("^una descripcion '(.*)', fecha hora de entrada '(.*)' y salida '(.*)'$")
    public void unaDescripcionFechaHoraDeEntradaYSalida(String descripcion, String start, String end) {
        BaseServices.DESCRIPTION.set(descripcion);
        BaseServices.START.set(start);
        BaseServices.END.set(end);
    }




}