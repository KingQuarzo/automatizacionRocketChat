package co.com.rocketchat.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/inicioSesion.feature",
        glue = "co.com.rocketchat.stepdefinitions")
public class ValidarInicioSesionRunner {
}
