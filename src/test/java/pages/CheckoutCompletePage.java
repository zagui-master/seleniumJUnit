package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BasePage;

public class CheckoutCompletePage extends BasePage {
    private final By IMG_LOCATOR = By.xpath("//img[@src='img/pony-express.png']");

    public WebElement getImg() {
        return findElement(IMG_LOCATOR);
    }
}
