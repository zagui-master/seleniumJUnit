package script;

import org.junit.jupiter.api.*;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest /*extends PageUrl*/ {
    private final LoginPage loginPage = new LoginPage();
    private final String USER = "standard_user";
    private final String PASSWORD = "secret_sauce";
    private final String CURRENT_URL = "https://www.saucedemo.com/v1/inventory.html";

    @BeforeEach
    public void setUp() {
        //private final String URL = sauceDemoUrl();
        final String URL = "https://www.saucedemo.com/v1/index.html";
        loginPage.chromeDriverConnection(URL);
    }

    @AfterEach
    public void tearDown() {
        loginPage.tearDownWebDriver();
    }

    @Test
    public void test() {
        loginPage.typeUserLogin(USER);
        loginPage.typePasswordLogin(PASSWORD);
        loginPage.clickBtnLogin();
        assertEquals(loginPage.loginAuthentication(), CURRENT_URL);
    }
}

