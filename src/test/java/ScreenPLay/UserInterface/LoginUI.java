package ScreenPLay.UserInterface;

import org.openqa.selenium.By;

public class LoginUI {
    public static By emailInput = By.id("user_email_login");
    public static By passwordInput = By.id("user_password_login");

    public static By btnLogin = By.xpath("//button[@name='btn-login']");

    public static By linkCreateAccount = By.xpath("//a[@name='link-sig-up']");
}
