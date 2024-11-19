package co.com.rocketchat.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {
    public static final Target BTN_MODULO_USUARIOS = Target.the("Boton para ingresar al modulo de usuarios").located(By.xpath("/html/body/div[1]/div[2]/main/section/div/div/div[1]/div/div/div/div[1]/div[3]/button/span"));
    public static final Target BTN_MODULO_CANALES = Target.the("Boton para ingresar al modulo de canales").located(By.xpath("/html/body/div[1]/div[2]/main/section/div/div/div[1]/div/div/div/div[2]/div[3]/button/span"));
    public static final Target VIEW_WELCOME = Target.the("").locatedBy("/html/body/div[1]/div[2]/main/section/div/div/div[1]/div/h2");
    public static final Target BTN_PROFILE = Target.the("").located(By.xpath("/html/body/div[1]/div[2]/div/nav/div[1]/div/button/div/figure/img"));
    public static final Target BTN_EXIT = Target.the("").located(By.xpath(""));

}
