package ScreenPLay.Tasks;

import ScreenPLay.Actions.Click;
import ScreenPLay.Actions.Enter;
import ScreenPLay.UserInterface.SingUpUI;

public class SingUp {
    public static void newUser() {

        Enter.text(SingUpUI.userInput, "Sergio");
        Enter.text(SingUpUI.lastnameInput, "Lopez");
        Enter.text(SingUpUI.emailInput, "sergio@gmail.com");
        Enter.text(SingUpUI.phoneInput, "3003659739");
        Enter.text(SingUpUI.passwordInput, "Sergio96");
        Click.on(SingUpUI.btnSIngUp);
    }
}
