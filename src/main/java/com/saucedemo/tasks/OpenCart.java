package com.saucedemo.tasks;

import com.saucedemo.uis.PrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Click.on(PrincipalPage.btnCart)
    );}

    public static OpenCart on() {
        return instrumented(OpenCart.class);
    }
}
