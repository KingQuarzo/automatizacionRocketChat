package co.com.rocketchat.stepdefinitions;

import co.com.rocketchat.models.NewUser;
import co.com.rocketchat.task.InsertNewUserTask;
import co.com.rocketchat.task.ManagementUsersTask;
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

public class ValidarCrearUsuarioStepDefinition {

    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Gandalf");
    }

    @DataTableType
    public NewUser defineUser(Map<String, String> row) {
        return new NewUser(row.get("Correo"), row.get("Nombre"), row.get("NombreUsuario"),
                row.get("Contrasenia"), row.get("Estado"), row.get("Apodo"));
    }

    @Given("se ingreso al modulo de creacion de usuario como administrador")
    public void seIngresoAlModuloDeCreacionDeUsuarioComoAdministrador() {
        theActorInTheSpotlight().attemptsTo(ManagementUsersTask.into());
    }

    @When("se añada un nuevo usuario")
    public void seAñadaUnNuevoUsuario(List<NewUser> newUsers) {
        theActorInTheSpotlight().attemptsTo(InsertNewUserTask.withThisData(newUsers.get(0)));
    }

    @Then("se visualizara el usario en las lista de usuarios")
    public void  seVisualizaraElUsarioEnLasListaDeUsuarios() {
    }

    @After
    public void closeDriver(){
        // closeDriver();
    }

}
