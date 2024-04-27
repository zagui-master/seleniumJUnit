package ScreenPlay.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static final WebDriver driver = new ChromeDriver();

    public static WebDriver getDriver() {
        return driver;
    }

    public static void chromeConnection(String url) {
        getDriver().manage().window().maximize();
        getDriver().get(url);
    }

    public static void tearDownConnection() {
        getDriver().quit();
    }
}
