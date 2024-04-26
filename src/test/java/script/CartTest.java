package script;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest /*extends PageUrl*/ {
    private final CartPage cartPage = new CartPage();
    private final ProductsPage productsPage = new ProductsPage();
    private final LoginPage loginPage = new LoginPage();
    private final String[] listOfProduct = {"Sauce Labs Backpack", "Sauce Labs Bike Light", "Sauce Labs Bolt T-Shirt"};

    @BeforeEach
    public void setUp() {
        final String URL = "https://www.saucedemo.com/v1/inventory.html";
        // final String URL = saucedemoUrl();
        cartPage.chromeDriverConnection(URL);
    }

    @AfterEach
    public void tearDown() {
        cartPage.tearDownWebDriver();
    }

    @Test
    public void test() {
        productsPage.addProduct();
        cartPage.visitCart();
        assertEquals(cartPage.getFirstProductAdded(), listOfProduct[0]);
        assertEquals(cartPage.getSecondProductAdded(), listOfProduct[1]);
        assertEquals(cartPage.getThirdProductAdded(), listOfProduct[2]);
    }
}
