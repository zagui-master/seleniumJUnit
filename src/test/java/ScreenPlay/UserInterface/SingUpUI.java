package ScreenPlay.UserInterface;

import org.openqa.selenium.By;

public class SingUpUI {
    public static By userInput = By.id("user_name");
    public static By lastnameInput = By.id("user_last_name");
    public static By emailInput = By.id("user_email");
    public static By phoneInput = By.id("user_phone_number");
    public static By passwordInput = By.id("user_password");
    public static By btnSIngUp = By.xpath("//button[@data-testid='btn-signin']");
    public static By linkAlreadyHaveAnAccount = By.xpath("//a[@href='../index.html']");
}
