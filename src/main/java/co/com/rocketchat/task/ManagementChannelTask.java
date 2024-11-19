package co.com.rocketchat.task;

import co.com.rocketchat.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.rocketchat.userinterfaces.MainPage.BTN_MODULO_CANALES;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ManagementChannelTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.until(5000),
                Click.on(BTN_MODULO_CANALES)
        );
    }

    public static ManagementChannelTask into(){
        return instrumented(ManagementChannelTask.class);
    }
}
