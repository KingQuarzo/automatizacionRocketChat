package co.com.rocketchat.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.logging.Logger;

public class WelcomeMessage implements Question<Boolean> {

    private static final Logger logger = Logger.getLogger(WelcomeMessage.class.getName());

    String welcomeMessage;
    String messageCheck;

    private WelcomeMessage(String welcomeMessage, String messageCheck){
        this.welcomeMessage = welcomeMessage;
        this.messageCheck = messageCheck;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        welcomeMessage = Text.of(welcomeMessage).answeredBy(actor);
        logger.info(welcomeMessage +"<----------->"+messageCheck);
        return messageCheck.equals(welcomeMessage);
    }

    public static WelcomeMessage check(String welcomeMessage, String messageCheck){
        return new WelcomeMessage(welcomeMessage, messageCheck);
    }
}
