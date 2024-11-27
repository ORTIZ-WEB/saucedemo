package com.saucedemo.tasks;

import com.saucedemo.interactions.Wait;
import com.saucedemo.uis.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginUser implements Task {

    String User;
    String Password;

    public LoginUser(String user, String password) {
        User = user;
        Password = password;
    }

    @Step("{0} login site")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.Element(LoginPage.txtUserName),
                Enter.theValue(User).into(LoginPage.txtUserName),
                Enter.theValue(Password).into(LoginPage.txtPassword),
                Click.on(LoginPage.btnLogin)
        );
    }


    public static LoginUser on (String email, String password) {
        return instrumented(LoginUser.class, email, password);
    }


}
