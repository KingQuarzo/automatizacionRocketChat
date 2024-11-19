package co.com.rocketchat.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AbrirWeb {

    private static WebDriver driver;

    public static AbrirWeb hisBrowserWeb() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-infobars");
        driver(options);

        return new AbrirWeb();
    }
    public static void driver(ChromeOptions options) {
        driver = new ChromeDriver(options);
    }


    public static WebDriver on(String url) {
        driver.get(url);
        return driver;

    }

}
