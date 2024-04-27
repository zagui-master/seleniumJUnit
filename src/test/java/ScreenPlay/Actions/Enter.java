package ScreenPlay.Actions;

import org.openqa.selenium.By;
import utils.BasePage;

public class Enter extends BasePage {
    public static void text(By locator, String text) {
        getDriver().findElement(locator).sendKeys(text);
    }
}
