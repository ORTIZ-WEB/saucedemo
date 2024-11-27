package com.saucedemo.tasks;

import com.saucedemo.interactions.Wait;
import com.saucedemo.uis.PrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Logout implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Wait.Element(PrincipalPage.btnMenu),
        Click.on(PrincipalPage.btnMenu),
        Click.on(PrincipalPage.btnLogout)
    );}

    public static Logout on() {
        return instrumented(Logout.class);
    }
}
