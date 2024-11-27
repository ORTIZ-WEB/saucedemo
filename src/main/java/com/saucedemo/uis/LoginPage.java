package com.saucedemo.uis;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target txtUserName = Target.the("User Name").located(By.id("user-name"));
    public static final Target txtPassword = Target.the("Password").located(By.id(("password")));
    public static final Target btnLogin = Target.the("").located(By.id("login-button"));

}
