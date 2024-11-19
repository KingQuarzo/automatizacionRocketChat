package co.com.rocketchat.stepdefinitions;

import co.com.rocketchat.models.User;
import co.com.rocketchat.task.LoginTask;
import co.com.rocketchat.utils.drivers.OwnRemoteWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import io.cucumber.java.DataTableType;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidarInicioSesionStepDefinition {

    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Gandalf");
    }

    @DataTableType
    public User defineUser(Map<String, String> row) {
        return new User(row.get("user"), row.get("password"));
    }

    @Given("dado que se ingreso al aplicativo RocketChat")
    public void dadoQueSeIngresoAlAplicativoRocketChat() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(OwnRemoteWebDriver.on("http://localhost:3000/")));
    }

    @When("se ingrese los datos para autenticacion")
    public void seIngreseLosDatosParaAutenticacion(List<User> users) {
        theActorInTheSpotlight().attemptsTo(LoginTask.inRocketChat(users.get(0)));
    }

    @Then("se podra visualizar el mensaje de bienvenida")
    public void sePodraVisualizarElMensajeDeBienvenida() {
    }

    @After
    public void closeDriver(){
       // closeDriver();
    }

}
