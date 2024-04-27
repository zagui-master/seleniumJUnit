package ScreenPlay.Tasks;

import ScreenPlay.Actions.Click;
import ScreenPlay.Actions.Enter;
import ScreenPlay.UserInterface.SingUpUI;

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
