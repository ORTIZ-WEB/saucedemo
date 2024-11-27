package com.saucedemo.tasks;

import com.saucedemo.interactions.Wait;
import com.saucedemo.uis.PrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddToCart implements Task {

    String Item1;
    String Item2;

    public AddToCart(String item1, String item2) {
        Item1 = item1;
        Item2 = item2;
    }

    @Step("Select item")
    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("Add to cart task");
        actor.attemptsTo(
        Wait.Element(PrincipalPage.btnCart),
        Click.on(PrincipalPage.btnAddItem.of(Item1)),
        Click.on(PrincipalPage.btnAddItem.of(Item2))
        );
    }


    public static AddToCart on(String item1, String item2) {
        return instrumented(AddToCart.class, item1,item2);
    }
}
