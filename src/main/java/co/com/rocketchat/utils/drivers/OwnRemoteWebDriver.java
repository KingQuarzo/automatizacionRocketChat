package co.com.rocketchat.utils.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OwnRemoteWebDriver {

    private static WebDriver driver;

    private OwnRemoteWebDriver(){
    }

    public static OwnRemoteWebDriver hisBrowserWeb(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-infobars");
        driver(options);
        return new OwnRemoteWebDriver();
    }

    public static void driver(ChromeOptions options){
        driver = new ChromeDriver(options);
    }

    public static WebDriver on(String url){
        driver.get(url);
        return driver;
    }

}
