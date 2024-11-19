package co.com.rocketchat.stepdefinitions;

import co.com.rocketchat.models.NewCanal;
import io.cucumber.java.After;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class ValidarCrearCanalStepDefinition {

    @DataTableType
    public NewCanal defineUser(Map<String, String> row) {
        return new NewCanal(row.get("Nombre"), row.get("Tema"), row.get("Accesbilidad"));
    }

    @Given("se ingreso al modulo de creacion de canal como administrador")
    public void seIngresoAlModuloDeCreacionDeCanalComoAdministrador() {
    }

    @When("se ingreser todos los datos")
    public void seIngreserTodosLosDatos(List<NewCanal> newCanal) {
    }

    @Then("se podra visualizar el canal en lista de canales")
    public void sePodraVisualizarElCanalEnListaDeCanales() {
    }

    @After
    public void closeDriver(){
        // closeDriver();
    }

}
