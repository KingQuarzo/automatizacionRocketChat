package co.com.rocketchat.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChannelManagementPage {
    public static final Target TXT_NOMBRE = Target.the("").located(By.name("name"));
    public static final Target TXT_TEMA = Target.the("").located(By.name("topic"));
    public static final Target BTN_CREAR = Target.the("").located(By.xpath("/html/body/div[4]/div/dialog/form/div[2]/div/button[2]"));

}
