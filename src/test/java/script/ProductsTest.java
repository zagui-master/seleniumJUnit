package script;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.ProductsPage;
import utils.PageUrl;

public class ProductsTest /*extends PageUrl*/ {
    private final ProductsPage productsPage = new ProductsPage();

    @BeforeEach
    public void setUp() {
        final String URL = "https://www.saucedemo.com/v1/inventory.html";
        // final String URL = saucedemoUrl();
        productsPage.chromeDriverConnection(URL);
    }

    @AfterEach
    public void tearDown() {
        productsPage.tearDownWebDriver();
    }

    @Test
    public void test() {
        productsPage.addProduct();
    }
}
