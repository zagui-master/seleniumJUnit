package ScreenPLay.Test;

import ScreenPLay.DriverManager.DriverManager;
import ScreenPLay.Tasks.SingUp;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class SingUpTest {
    @BeforeAll
    public static void SetUp() {
        DriverManager.chromeConnection("https://zagui-master.github.io/zaguisoft.github.io/pages/sign-up.html");
    }

    @AfterAll
    public static void tearDown() {
        DriverManager.tearDownConnection();
    }

    @Test
    public void test() {
        SingUp.newUser();
    }
}
