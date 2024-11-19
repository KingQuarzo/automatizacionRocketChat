package co.com.rocketchat.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.rocketchat.userinterfaces.UserManagementPage.BTN_CLOSE_VIEW;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CerrarSesionTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(BTN_CLOSE_VIEW),
            Click.on(),
            Click.on()
    );
    }

    public static CerrarSesionTask exit(){
        return instrumented(CerrarSesionTask.class);
    }

}
