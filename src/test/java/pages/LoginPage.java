package pages;

import org.openqa.selenium.By;
import utils.BasePage;

public class LoginPage extends BasePage {
    private final By userLocator = By.id("user-name");
    private final By passwordLocator = By.id("password");
    private final By btnLoginLocator = By.id("login-button");

    public void typeUserLogin(String user) {
        sendKeys(userLocator, user);
    }

    public void typePasswordLogin(String password) {
        sendKeys(passwordLocator, password);
    }

    public void clickBtnLogin() {
        click(btnLoginLocator);
    }

    public String loginAuthentication() {
        return getCurrentUrl();
    }
}
