package co.com.rocketchat.task;

import co.com.rocketchat.interactions.Wait;
import co.com.rocketchat.models.NewUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.rocketchat.userinterfaces.UserManagementPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InsertNewUserTask implements Task {

    public NewUser newUser;

    public InsertNewUserTask(NewUser newUser){
        this.newUser = newUser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_NEW_USER),
                Enter.theValue(newUser.getCorreo()).into(TXT_CORREO),
                Enter.theValue(newUser.getNombre()).into(TXT_NOMBRE),
                Enter.theValue(newUser.getNombreUsuario()).into(TXT_USUARIO),
                Enter.theValue(newUser.getContrasenia()).into(TXT_CONTRASENIA),
                Enter.theValue(newUser.getContrasenia()).into(TXT_CONFIRMAR_CONTRASENIA),
                Enter.theValue(newUser.getEstado()).into(TXT_ESTADO),
                Enter.theValue(newUser.getApodo()).into(TXT_APODO),
                Click.on(BTN_AÑADIR_USUARIO)
        );
    }

    public static InsertNewUserTask withThisData(NewUser newUser){
        return instrumented(InsertNewUserTask.class, newUser);
    }
}
