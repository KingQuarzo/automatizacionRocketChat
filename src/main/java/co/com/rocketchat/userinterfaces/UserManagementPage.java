package co.com.rocketchat.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserManagementPage {
    public static final Target BTN_NEW_USER = Target.the("").located(By.xpath("/html/body/div[1]/div[2]/main/section/section/header/div/div[2]/button[2]"));
    public static final Target BTN_CLOSE_VIEW = Target.the("").located(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[1]/div/button/i"));

}
