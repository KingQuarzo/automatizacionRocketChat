package co.com.rocketchat.interactions;

import co.com.rocketchat.exceptions.MessageException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Wait implements Interaction {

    private long time;

    public Wait(long time) {
        this.time = time;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(time);
        } catch (MessageException | InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new MessageException(MessageException.ERROR, e);
        }

    }

    public static Wait until(long time) {
        return new Wait(time);
    }

}
