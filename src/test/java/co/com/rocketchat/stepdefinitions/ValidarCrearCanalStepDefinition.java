package co.com.rocketchat.stepdefinitions;

import co.com.rocketchat.models.NewCanal;
import co.com.rocketchat.task.InsertNewChannelTask;
import co.com.rocketchat.task.ManagementChannelTask;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidarCrearCanalStepDefinition {

    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Gandalf");
    }

    @DataTableType
    public NewCanal defineChannel(Map<String, String> row) {
        return new NewCanal(row.get("nombre"), row.get("tema"));
    }

    @Given("se ingreso al modulo de creacion de canal como administrador")
    public void seIngresoAlModuloDeCreacionDeCanalComoAdministrador() {
        theActorInTheSpotlight().attemptsTo(ManagementChannelTask.into());
    }

    @When("se ingreser todos los datos")
    public void seIngreserTodosLosDatos(List<NewCanal> newCanal) {
        theActorInTheSpotlight().attemptsTo(InsertNewChannelTask.into(newCanal.get(0)));
    }

    @Then("se podra visualizar el canal en lista de canales")
    public void sePodraVisualizarElCanalEnListaDeCanales() {
    }

    @After
    public void closeDriver(){
        // closeDriver();
    }

}
