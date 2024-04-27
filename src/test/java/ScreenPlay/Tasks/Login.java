package ScreenPlay.Tasks;

import ScreenPlay.Actions.Click;
import ScreenPlay.Actions.Enter;
import ScreenPlay.UserInterface.LoginUI;

public class Login {
    public static void  user(){
        Enter.text(LoginUI.emailInput, "sergio@gmail.com");
        Enter.text(LoginUI.passwordInput,"Sergio96");
        Click.on(LoginUI.btnLogin);
    }
}
