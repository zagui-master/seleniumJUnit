package pages;

import org.openqa.selenium.By;
import utils.BasePage;

import java.util.Arrays;

public class CheckoutStepTwoPage extends BasePage {
    private final By firstProductTitleLocator = By.xpath("//*[@id='item_4_title_link']/div");
    private final By secondProductTitleLocator = By.xpath("//*[@id='item_0_title_link']/div");
    private final By thirdProductTitleLocator = By.xpath("//*[@id='item_1_title_link']/div");
    private final By firstProductPriceLocator = By.xpath("(//*[@class='cart_item_label'])[1]//div[2]");
    private final By secondProductPriceLocator = By.xpath("(//*[@class='cart_item_label'])[2]//div[2]");
    private final By thirdProductPriceLocator = By.xpath("(//*[@class='cart_item_label'])[3]//div[2]");

    private final By btnFinishCheckoutOverviewLocator = By.xpath("//a[@href='./checkout-complete.html']");

    public String getFirstProductTitle() {
        return getText(firstProductTitleLocator);
    }

    public String getFirstProductPrice() {
        return getText(firstProductPriceLocator);
    }

    public String getSecondProductTitle() {
        return getText(secondProductTitleLocator);
    }

    public String getSecondProductPrice() {
        return getText(secondProductPriceLocator);
    }

    public String getThirdProductTitle() {
        return getText(thirdProductTitleLocator);
    }

    public String getThirdProductPrice() {
        return getText(thirdProductPriceLocator);
    }

    public  void clickBtnFinishCheckoutOverview(){
        click(btnFinishCheckoutOverviewLocator);
    }

}


