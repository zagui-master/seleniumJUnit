package ScreenPlay.Actions;

import org.openqa.selenium.By;

import static ScreenPlay.DriverManager.DriverManager.getDriver;


public class Click {

    public static void on(By locator) {
        getDriver().findElement(locator).click();
    }
}
