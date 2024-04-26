package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BasePage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartPage extends BasePage {
    private final By firstProductTitleLocator = By.xpath("(//*[@class='cart_item'])[1]//a//div");
    private final By secondProductTitleLocator = By.xpath("(//*[@class='cart_item'])[2]//a//div");
    private final By thirdProductTitleLocator = By.xpath("(//*[@class='cart_item'])[3]//a//div");
    private final By cartIconLocator = By.xpath("//*[@id='shopping_cart_container']//a");
    private final By btnGoToCheckoutLocator = By.xpath("//a[@href='./checkout-step-one.html']");

    public void visitCart() {
        click(cartIconLocator);
    }

    public String getFirstProductAdded() {
        return getText(firstProductTitleLocator);
    }

    public String getSecondProductAdded() {
        return getText(secondProductTitleLocator);
    }

    public String getThirdProductAdded() {
        return getText(thirdProductTitleLocator);
    }

    public void ClickBtnCheckout() {
        click(btnGoToCheckoutLocator);
    }
}
