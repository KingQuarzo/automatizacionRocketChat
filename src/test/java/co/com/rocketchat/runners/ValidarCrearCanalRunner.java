package co.com.rocketchat.runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/crearCanal.feature",
        glue = "stepdefinitions")
public class ValidarCrearCanalRunner {
}
