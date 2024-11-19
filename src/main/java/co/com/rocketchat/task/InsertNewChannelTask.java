package co.com.rocketchat.task;

import co.com.rocketchat.interactions.Wait;
import co.com.rocketchat.models.NewCanal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.rocketchat.userinterfaces.ChannelManagementPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InsertNewChannelTask implements Task {

    public NewCanal newCanal;

    public InsertNewChannelTask(NewCanal newCanal){
        this.newCanal = newCanal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(newCanal.getNombre()).into(TXT_NOMBRE),
                Enter.theValue(newCanal.getTema()).into(TXT_TEMA),
                Wait.until(5000)
//                Click.on(BTN_CREAR)
        );
    }

    public static InsertNewChannelTask into(NewCanal newCanal){
        return instrumented(InsertNewChannelTask.class, newCanal);
    }
}
