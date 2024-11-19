package co.com.rocketchat.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {
    public static final Target BTN_MODULO_USUARIOS = Target.the("Boton para ingresar al modulo de usuarios").located(By.xpath("/html/body/div[1]/div[2]/main/section/div/div/div[1]/div/div/div/div[1]/div[3]/button"));
    public static final Target BTN_MODULO_CANALES = Target.the("Boton para ingresar al modulo de canales").located(By.xpath("/html/body/div[1]/div[2]/main/section/div/div/div[1]/div/div/div/div[2]/div[3]/button/span"));
}
