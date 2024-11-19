package co.com.rocketchat.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target TXT_USERNAME = Target.the("user box").located(By.name("usernameOrEmail"));
    public static final Target TXT_PASSWORD = Target.the("password box").located(By.name("password"));
    public static final Target BTN_LOGIN = Target.the("Login button").located(By.xpath("/html/body/div[1]/main/div/div/div[2]/form/footer/div/button"));

}
