package com.saucedemo.uis;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PrincipalPage {

    public static final Target btnMenu = Target.the("menu button").located(By.id("react-burger-menu-btn"));
    public static final Target btnLogout = Target.the("logout button").located(By.id("logout_sidebar_link"));
    public static Target btnAddItem = Target.the("").locatedBy("//button[@id='add-to-cart-sauce-labs-{0}']");
    public static final Target btnCart = Target.the("cart button").located(By.className("shopping_cart_link"));
    public static  Target btnRemoveItem = Target.the("remove button").locatedBy("//button[@id='remove-sauce-labs-{0}']");
}
