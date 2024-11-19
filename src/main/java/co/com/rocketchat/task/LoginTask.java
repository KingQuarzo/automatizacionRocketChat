package co.com.rocketchat.task;

import co.com.rocketchat.interactions.Wait;
import co.com.rocketchat.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.rocketchat.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {

    private User user;

    public LoginTask(User user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getUser()).into(TXT_USERNAME),
                Enter.theValue(user.getPassword()).into(TXT_PASSWORD),
                Click.on(BTN_LOGIN),
                Wait.until(5000)
        );
    }

    public static LoginTask inRocketChat(User user){
        return instrumented(LoginTask.class, user);
    }
}
