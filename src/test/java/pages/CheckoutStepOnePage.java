package pages;

import org.openqa.selenium.By;
import utils.BasePage;

public class CheckoutStepOnePage extends BasePage {
    private final By inputFirstNameLocator = By.id("first-name");
    private final By inputLastNamelocator = By.id("last-name");
    private final By inputPostalCodeLocator = By.id("postal-code");
    private final By btnContinueCheckout = By.xpath("//input[@VALUE='CONTINUE']");

    public void typeName(String name) {
        sendKeys(inputFirstNameLocator, name);
    }

    public void typeLastName(String lastName) {
        sendKeys(inputLastNamelocator, lastName);
    }

    public void typePostalCode(String postalCode) {
        sendKeys(inputPostalCodeLocator, postalCode);
    }

    public void clickBtnContinueCheckout() {
        click(btnContinueCheckout);
    }
}
