package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by pfatula on 06.09.2016
 */

public class WebDriveFactory {

    private WebDriveFactory() {
    }

    public static synchronized WebDriver createInstance(String browserName) {
        WebDriver webDriver = null;
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "./src/main/resources/webdrivers/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-popup-blocking");
            webDriver = new ChromeDriver(options);
        }

        return webDriver;
    }
}
