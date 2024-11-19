package co.com.rocketchat.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserManagementPage {
    public static final Target BTN_NEW_USER = Target.the("").located(By.xpath("/html/body/div[1]/div[2]/main/section/section/header/div/div[2]/button[2]"));
    public static final Target TXT_CORREO = Target.the("").located(By.name("email"));
    public static final Target TXT_NOMBRE = Target.the("").located(By.name("name"));
    public static final Target TXT_USUARIO = Target.the("").located(By.name("username"));
    public static final Target TXT_CONTRASENIA = Target.the("").located(By.name("password"));
    public static final Target TXT_CONFIRMAR_CONTRASENIA = Target.the("").located(By.name("passwordConfirmation"));
    public static final Target TXT_ESTADO = Target.the("").located(By.name("statusText"));
    public static final Target TXT_APODO = Target.the("").located(By.name("nickname"));
    public static final Target BTN_AÑADIR_USUARIO = Target.the("").located(By.xpath("/html/body/div[1]/div[2]/main/section/div/div/div[3]/button"));
}
