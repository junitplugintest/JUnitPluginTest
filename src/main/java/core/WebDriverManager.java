package core;

import org.openqa.selenium.WebDriver;

/**
 * Created by pfatula on 06.09.2016
 */
public class WebDriverManager {

    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    private WebDriverManager() {
    }

    public static WebDriver createInstanceFor(String browserName){
        if(webDriver.get() == null){
            webDriver.set(WebDriveFactory.createInstance(browserName));
        }
        return getDriver();
    }

    public static WebDriver getDriver() {
        return webDriver.get();
    }

    public static void quitDriver() {
        if (WebDriverManager.getDriver() != null) {
            WebDriverManager.getDriver().quit();
        }
        webDriver.remove();
    }
}
