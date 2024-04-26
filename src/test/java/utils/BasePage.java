package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    private static final WebDriver driver = new ChromeDriver();
    // private  static  final WebDriver fireFox = new FirefoxDriver();

    public static WebDriver getDriver() {
        return driver;
    }

    public void tearDownWebDriver() {
        driver.quit();
    }

    public void chromeDriverConnection(String url) {
        getDriver().manage().window().maximize();
        getDriver().get(url);
    }

    /*
        final Long num = 10L;
        WebDriverWait wait = new WebDriverWait(getDriver(), 10L );
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("my-element")));


        public void waitEvent(int seconds) {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(seconds));
        }
    */
    public WebElement findElement(By locator) {
        return getDriver().findElement(locator);
    }

    public List<WebElement> findElements(By locator) {
        return getDriver().findElements(locator);
    }

    public String getCurrentUrl() {
        return getDriver().getCurrentUrl();
    }

    public String getText(WebElement element) {
        return element.getText();
    }

    public String getText(By locator) {
        return getDriver().findElement(locator).getText();
    }

    public String getTitle(String text) {
        return getDriver().getTitle();
    }

    public void sendKeys(By locator, String text) {
        getDriver().findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        getDriver().findElement(locator).click();
    }
}
