package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class ProductsPage extends BasePage {
    private final By btnProductOneLocator = By.xpath("//*[@class='inventory_item' and contains(.,'Sauce Labs Backpack')]//button");
    private final By btnProductTwoLocator = By.xpath("//*[@class='inventory_item' and contains(.,'Sauce Labs Bike Light')]//button");
    private final By btnProductThreeLocator = By.xpath("//*[@class='inventory_item' and contains(.,'Sauce Labs Bolt T-Shirt')]//button");

    public void addProduct() {
        click(btnProductOneLocator);
        click(btnProductTwoLocator);
        click(btnProductThreeLocator);
    }
}
