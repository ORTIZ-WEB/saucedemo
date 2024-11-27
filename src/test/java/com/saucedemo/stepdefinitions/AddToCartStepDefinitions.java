package com.saucedemo.stepdefinitions;

import com.saucedemo.questions.ResultVerification;
import com.saucedemo.tasks.AddToCart;
import com.saucedemo.tasks.OpenCart;
import com.saucedemo.uis.PrincipalPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddToCartStepDefinitions {

    @When("^User selects (.*) and (.*)$")
    public void user_selects_items(String item1, String item2) {
        System.out.println("2 step");
        theActorInTheSpotlight().attemptsTo(AddToCart.on(item1, item2));
    }

    @When("Opens cart")
    public void opens_cart() {
        System.out.println("3 step");
        theActorInTheSpotlight().attemptsTo(OpenCart.on());
    }

    @Then("^User sees (.*) and (.*) on cart$")
    public void user_sees_items_selected_on_cart(String item1, String item2) {
        System.out.println("4 step");
        theActorInTheSpotlight().should(seeThat(ResultVerification.isVisible(PrincipalPage.btnRemoveItem.of(item1))));
        theActorInTheSpotlight().should(seeThat(ResultVerification.isVisible(PrincipalPage.btnRemoveItem.of(item2))));
    }

}
