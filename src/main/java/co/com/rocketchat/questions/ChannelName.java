package co.com.rocketchat.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.logging.Logger;

public class ChannelName implements Question<Boolean> {

    private static final Logger logger = Logger.getLogger(ChannelName.class.getName());

    String channelName;
    String nameCheck;

    private ChannelName(String channelName, String nameCheck) {
        this.channelName = channelName;
        this.nameCheck = nameCheck;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        channelName = Text.of(channelName).answeredBy(actor);
        logger.info(channelName + "<----------->" + nameCheck);
        return nameCheck.equals(channelName);
    }

    public static ChannelName check(String channelName, String nameCheck) {
        return new ChannelName(channelName, nameCheck);
    }
}
