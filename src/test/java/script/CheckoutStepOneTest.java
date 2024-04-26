package script;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.CheckoutStepOnePage;
import pages.ProductsPage;

public class CheckoutStepOneTest {
    private final CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage();
    private final ProductsPage productsPage = new ProductsPage();
    private final CartPage cartPage = new CartPage();
    private final String NAME = "Sergio";
    private final String LASTNAME = "Lopez";
    private final String POSTAL_CODE = "730001";

    @BeforeEach
    public void setUp() {
        final String URL = "https://www.saucedemo.com/v1/inventory.html";
        checkoutStepOnePage.chromeDriverConnection(URL);
    }

    @AfterEach
    public void tearDown() {
        checkoutStepOnePage.tearDownWebDriver();
    }

    @Test
    public void test() {
        productsPage.addProduct();
        cartPage.visitCart();
        cartPage.ClickBtnCheckout();
        checkoutStepOnePage.typeName(NAME);
        checkoutStepOnePage.typeLastName(LASTNAME);
        checkoutStepOnePage.typePostalCode(POSTAL_CODE);
        checkoutStepOnePage.clickBtnContinueCheckout();

    }
}
