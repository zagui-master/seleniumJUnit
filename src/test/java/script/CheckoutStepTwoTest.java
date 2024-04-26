package script;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.CheckoutStepOnePage;
import pages.CheckoutStepTwoPage;
import pages.ProductsPage;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutStepTwoTest {
    private final CheckoutStepTwoPage checkoutStepTwoPage = new CheckoutStepTwoPage();
    private final CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage();
    private final ProductsPage productsPage = new ProductsPage();
    private final CartPage cartPage = new CartPage();
    private final String NAME = "Sergio";
    private final String LASTNAME = "Lopez";
    private final String POSTAL_CODE = "730001";

    @BeforeEach
    public void setUp() {
        final String URL = "https://www.saucedemo.com/v1/inventory.html";
        checkoutStepTwoPage.chromeDriverConnection(URL);
    }

    @AfterEach
    public void tearDopwn() {
        checkoutStepTwoPage.tearDownWebDriver();
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
        assertEquals(checkoutStepTwoPage.getFirstProductTitle(), "Sauce Labs Backpack");
        assertEquals(checkoutStepTwoPage.getFirstProductPrice(), "$29.99");
        assertEquals(checkoutStepTwoPage.getSecondProductTitle(), "Sauce Labs Bike Light");
        assertEquals(checkoutStepTwoPage.getSecondProductPrice(), "$9.99");
        assertEquals(checkoutStepTwoPage.getThirdProductTitle(), "Sauce Labs Bolt T-Shirt");
        assertEquals(checkoutStepTwoPage.getThirdProductPrice(), "$15.99");
        checkoutStepTwoPage.clickBtnFinishCheckoutOverview();
    }
}
