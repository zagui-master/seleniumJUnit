package ScreenPLay.Tasks;

import ScreenPLay.Actions.Click;
import ScreenPLay.Actions.Enter;
import ScreenPLay.UserInterface.LoginUI;

public class Login {
    public static void  user(){
        Enter.text(LoginUI.emailInput, "sergio@gmail.com");
        Enter.text(LoginUI.passwordInput,"Sergio96");
        Click.on(LoginUI.btnLogin);
    }
}
